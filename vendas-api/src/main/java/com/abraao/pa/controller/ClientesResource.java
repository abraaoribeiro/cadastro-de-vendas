package com.abraao.pa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abraao.pa.model.Cliente;
import com.abraao.pa.repository.ClientesRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/clientes")
public class ClientesResource {

	@Autowired
	private ClientesRepository clienteRepository;

	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	
}
