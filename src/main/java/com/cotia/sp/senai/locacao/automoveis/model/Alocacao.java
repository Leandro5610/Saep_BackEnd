package com.cotia.sp.senai.locacao.automoveis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity
public class Alocacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idalocacao;
	private int area;
	@OneToOne
	@JoinColumn(name = "automovel")
	private Automoveis automoveis;
	private int quantidade;
	@ManyToOne
	@JoinColumn(name = "concessionaria")
	private Concessionarias concessionaria;
	
}
