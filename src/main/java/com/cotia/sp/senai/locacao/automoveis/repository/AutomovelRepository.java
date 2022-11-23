package com.cotia.sp.senai.locacao.automoveis.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cotia.sp.senai.locacao.automoveis.model.Automoveis;

public interface AutomovelRepository extends PagingAndSortingRepository<Automoveis, Long>{

}
