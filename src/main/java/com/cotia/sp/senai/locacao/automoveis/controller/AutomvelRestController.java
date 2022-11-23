package com.cotia.sp.senai.locacao.automoveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cotia.sp.senai.locacao.automoveis.model.Alocacao;
import com.cotia.sp.senai.locacao.automoveis.model.Automoveis;
import com.cotia.sp.senai.locacao.automoveis.repository.AlocacaoRepository;
import com.cotia.sp.senai.locacao.automoveis.repository.AutomovelRepository;

@RestController
@CrossOrigin
@RequestMapping("api/automovel")
public class AutomvelRestController {
	@Autowired
	private AutomovelRepository repository;
	
	@GetMapping(value = "list")
	public Iterable<Automoveis> listarAutomovel(){
		return repository.findAll(); 
		
		
	}
}
