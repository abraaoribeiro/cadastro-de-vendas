package com.abraao.pa.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abraao.pa.model.Venda;
import com.abraao.pa.repository.ProdutosRepository;
import com.abraao.pa.repository.VendasRepository;

@Service
public class VendaService {

	@Autowired
	private VendasRepository vendasRepository;

	@Autowired
	private ProdutosRepository produtosRepository;

	public Venda adicionar(Venda venda) {
		venda.setCadastro(LocalDateTime.now());
		venda.getItens().forEach(i -> {
			i.setVenda(venda);
			i.setProduto(produtosRepository.findById(i.getProduto().getId()).get());
		

		});

		// Mutiplicando o valor do Produto por sua quantidade
		BigDecimal totalItens = venda.getItens().stream()
				.map(i -> i.getProduto().getValor().multiply(new BigDecimal(i.getQuantidade())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		venda.setTotal(totalItens.add(venda.getFrete()));
		
		return vendasRepository.save(venda);
	}

}
