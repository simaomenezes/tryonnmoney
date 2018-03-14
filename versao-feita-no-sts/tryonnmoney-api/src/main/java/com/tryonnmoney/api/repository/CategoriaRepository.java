package com.tryonnmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tryonnmoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
