package com.cotia.sp.senai.locacao.automoveis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.cotia.sp.senai.locacao.automoveis.model.Alocacao;
import com.cotia.sp.senai.locacao.automoveis.model.Automoveis;

public interface AlocacaoRepository extends PagingAndSortingRepository<Alocacao, Long>{
	@Query("SELECT alocacao FROM Alocacao alocacao where alocacao.area = :a ")
	public List<Alocacao> procurarAutomoveis(@Param("a") int area);
}
