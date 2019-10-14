package br.example.banzonetwork.repository.aluno;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

import br.example.banzonetwork.model.Aluno;
import br.example.banzonetwork.model.Aluno_;
import br.example.banzonetwork.model.Lancamento;
import br.example.banzonetwork.repository.filter.AlunoFilter;

public class AlunoRepositoryImpl implements AlunoRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<Aluno> filtrar(AlunoFilter alunoFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Aluno> criteria = builder.createQuery(Aluno.class);
		Root<Aluno> root = criteria.from(Aluno.class);

		Predicate[] predicates = criarRestricoes(alunoFilter, builder, root);

		criteria.where(predicates);

		TypedQuery<Aluno> query = manager.createQuery(criteria);
		
		adicionaRestricoesDePaginacao(query, pageable);
		
		return new PageImpl<>(query.getResultList(), pageable, total(alunoFilter));
	}




	private Predicate[] criarRestricoes(AlunoFilter alunoFilter, CriteriaBuilder builder, Root<Aluno> root) {
		
		List<Predicate> predicates = new ArrayList<>();
		
		if (!StringUtils.isEmpty(alunoFilter.getNome())) {
			predicates.add(builder.like(
					builder.lower(root.get(Aluno_.nome)), "%" + alunoFilter.getNome().toLowerCase() + "%"));
		}
		if (!StringUtils.isEmpty(alunoFilter.getEmail())) {
			predicates.add(builder.like(
					builder.lower(root.get(Aluno_.email)), "%" + alunoFilter.getEmail().toLowerCase() + "%"));
		}
		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private void adicionaRestricoesDePaginacao(TypedQuery<Aluno> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrospagina =  pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual*totalRegistrospagina;
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrospagina);
		
	}
	
	private Long total(AlunoFilter alunoFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Aluno> root = criteria.from(Aluno.class);
		
		Predicate[]predicates = criarRestricoes(alunoFilter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}
}
