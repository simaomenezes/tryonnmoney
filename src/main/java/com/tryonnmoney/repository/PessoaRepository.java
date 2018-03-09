package com.tryonnmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tryonnmoney.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
