package br.example.banzonetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.banzonetwork.model.Alimento;

public interface AlimentoRepository extends JpaRepository<Alimento, Integer>{

}
