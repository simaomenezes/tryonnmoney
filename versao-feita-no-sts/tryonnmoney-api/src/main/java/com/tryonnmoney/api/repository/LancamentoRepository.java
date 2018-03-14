package com.tryonnmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tryonnmoney.api.model.Lancamento;
import com.tryonnmoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
