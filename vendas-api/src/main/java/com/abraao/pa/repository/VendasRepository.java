package com.abraao.pa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abraao.pa.model.Venda;

public interface VendasRepository extends JpaRepository<Venda, Long> {

}
