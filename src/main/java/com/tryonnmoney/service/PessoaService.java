package com.tryonnmoney.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.tryonnmoney.model.Pessoa;
import com.tryonnmoney.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa atualizar(Long codigo, Pessoa p) {
		
		Pessoa pSalva = buscarPessoaPeloCodigo(codigo);
		BeanUtils.copyProperties(p, pSalva, "codigo");
		return pessoaRepository.save(pSalva);
	}

	public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
		Pessoa pSalva = buscarPessoaPeloCodigo(codigo);
		pSalva.setAtivo(ativo);
		pessoaRepository.save(pSalva);
		
	}
	
	public Pessoa buscarPessoaPeloCodigo(Long codigo) {
		Pessoa pSalva = pessoaRepository.findOne(codigo);
		if (pSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return pSalva;
	}
}
