package br.example.banzonetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.banzonetwork.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
