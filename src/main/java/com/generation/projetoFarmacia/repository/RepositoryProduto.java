package com.generation.projetoFarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.projetoFarmacia.model.Produto;



@Repository
public interface RepositoryProduto extends JpaRepository <Produto, Long> {
	
	public List<Produto> findAllByProdutoContainingIgnoreCase(String produto);

}
