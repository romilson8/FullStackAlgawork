package br.example.banzonetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.banzonetwork.model.Aluno;
import br.example.banzonetwork.repository.aluno.AlunoRepositoryQuery;

public interface AlunoRepository extends JpaRepository<Aluno, Long>, AlunoRepositoryQuery{

}
