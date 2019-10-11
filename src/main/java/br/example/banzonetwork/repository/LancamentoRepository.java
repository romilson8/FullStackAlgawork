package br.example.banzonetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.banzonetwork.model.Lancamento;
import br.example.banzonetwork.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
