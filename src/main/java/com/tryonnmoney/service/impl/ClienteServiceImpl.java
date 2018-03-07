package com.tryonnmoney.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tryonnmoney.model.Cliente;
import com.tryonnmoney.repository.ClienteDAO;
import com.tryonnmoney.service.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteDAO repository;

	@Override
	public List<Cliente> findAll() {
		return (List<Cliente>) this.repository.findAll();
	}

	@Override
	public Cliente findById(Integer id) {
		return this.repository.findOne(id);
	}

	@Override
	public Cliente save(Cliente cliente) {
		return this.repository.save(cliente);
	}

	@Override
	public Cliente update(Cliente cliente) {
		return this.repository.saveAndFlush(cliente);
	}

	@Override
	public void delete(Cliente cli) {
		this.repository.delete(cli);
	}
	
	

}