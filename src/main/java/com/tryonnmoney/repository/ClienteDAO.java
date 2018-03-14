package com.tryonnmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tryonnmoney.api.model.Cliente;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}