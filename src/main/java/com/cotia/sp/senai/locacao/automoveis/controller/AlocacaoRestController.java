package com.cotia.sp.senai.locacao.automoveis.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cotia.sp.senai.locacao.automoveis.model.Alocacao;
import com.cotia.sp.senai.locacao.automoveis.repository.AlocacaoRepository;



@RestController
@CrossOrigin
@RequestMapping("api/alocacao")
public class AlocacaoRestController {
	@Autowired
	private AlocacaoRepository repository;
	
	@GetMapping(value = "list/{area}")
	public Iterable<Alocacao> listarAlocacao(@PathVariable("area") int i){
		return repository.procurarAutomoveis(i); 
		
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> updateAlocacao(@RequestBody Alocacao alocacao,
			@PathVariable("id") Long id) {
		if (id != alocacao.getIdalocacao()) {
			throw new RuntimeException("Id Inválido");
		}
		repository.save(alocacao);
		HttpHeaders header = new HttpHeaders();
		header.setLocation(URI.create("/api/alocacao"));
		return new ResponseEntity<Void>(header, HttpStatus.OK);

	}
	
	
	
	
}
