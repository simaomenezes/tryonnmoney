package com.tryonnmoney.api.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tryonnmoney.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByEmail(String email);
	
}