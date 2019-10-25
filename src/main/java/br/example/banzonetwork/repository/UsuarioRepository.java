package br.example.banzonetwork.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.banzonetwork.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByEmail(String email);

}
