package com.cotia.sp.senai.locacao.automoveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cotia.sp.senai.locacao.automoveis.model.Concessionarias;
import com.cotia.sp.senai.locacao.automoveis.repository.ConcessionaraRepository;

@RestController
@CrossOrigin
@RequestMapping("api/concessionara")
public class ConcessionaraRestController {
	@Autowired
	private ConcessionaraRepository repository;
	
	@GetMapping(value = "list")
	public Iterable<Concessionarias> listarConcessionara(){
		return repository.findAll(); 
		
		
	}
}
