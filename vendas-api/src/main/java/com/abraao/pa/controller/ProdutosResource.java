package com.abraao.pa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abraao.pa.model.Produto;
import com.abraao.pa.repository.ProdutosRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

	@Autowired
	private ProdutosRepository produtosRepository;

	@GetMapping
	public List<Produto> listar() {
		return produtosRepository.findAll();
	}
	
}
