package com.tryonnmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tryonnmoney.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
