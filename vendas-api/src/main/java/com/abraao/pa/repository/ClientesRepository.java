package com.abraao.pa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abraao.pa.model.Cliente;

public interface ClientesRepository extends JpaRepository<Cliente, Long> {

}
