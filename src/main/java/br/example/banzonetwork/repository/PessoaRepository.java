package br.example.banzonetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.example.banzonetwork.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
