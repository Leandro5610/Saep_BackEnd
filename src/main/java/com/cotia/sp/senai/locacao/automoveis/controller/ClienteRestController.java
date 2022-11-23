package com.cotia.sp.senai.locacao.automoveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cotia.sp.senai.locacao.automoveis.model.Alocacao;
import com.cotia.sp.senai.locacao.automoveis.model.Clientes;
import com.cotia.sp.senai.locacao.automoveis.repository.AlocacaoRepository;
import com.cotia.sp.senai.locacao.automoveis.repository.ClienteRepostory;

@RestController
@CrossOrigin
@RequestMapping("api/cliente")
public class ClienteRestController {
	@Autowired
	private ClienteRepostory repository;
	
	@GetMapping(value = "list")
	public Iterable<Clientes> listarCliente(){
		return repository.findAll(); 
		
		
	}
}
