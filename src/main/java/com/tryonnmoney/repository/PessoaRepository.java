package com.tryonnmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tryonnmoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
