package com.cotia.sp.senai.locacao.automoveis.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cotia.sp.senai.locacao.automoveis.model.Clientes;

public interface ClienteRepostory extends PagingAndSortingRepository<Clientes, Long>{

}
