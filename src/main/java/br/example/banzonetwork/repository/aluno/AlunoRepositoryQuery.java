package br.example.banzonetwork.repository.aluno;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.example.banzonetwork.model.Aluno;
import br.example.banzonetwork.repository.filter.AlunoFilter;

public interface AlunoRepositoryQuery {

	public Page<Aluno> filtrar(AlunoFilter alunoFilter, Pageable pageable);
}
