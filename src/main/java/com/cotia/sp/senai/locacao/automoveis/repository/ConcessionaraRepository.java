package com.cotia.sp.senai.locacao.automoveis.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cotia.sp.senai.locacao.automoveis.model.Concessionarias;

public interface ConcessionaraRepository extends PagingAndSortingRepository<Concessionarias, Long>{

}
