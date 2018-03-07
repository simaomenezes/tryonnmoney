package com.tryonnmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tryonnmoney.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
