package com.tryonnmoney.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tryonnmoney.api.model.Lancamento;
import com.tryonnmoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	
	

}
