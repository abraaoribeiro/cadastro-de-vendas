package com.abraao.pa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abraao.pa.model.Produto;

public interface ProdutosRepository extends JpaRepository<Produto, Long> {

}
