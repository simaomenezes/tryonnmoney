package com.tryonnmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tryonnmoney.model.Cliente;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}