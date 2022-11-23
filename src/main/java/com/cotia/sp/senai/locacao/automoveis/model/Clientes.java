package com.cotia.sp.senai.locacao.automoveis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nome;
}
