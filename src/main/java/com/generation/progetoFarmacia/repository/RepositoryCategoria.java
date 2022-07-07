package com.generation.progetoFarmacia.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.progetoFarmacia.model.Categoria;



@Repository
public interface RepositoryCategoria extends JpaRepository<Categoria, Long>{
	
   public List<Categoria> findAllByCategoriaContainingIgnoreCase(String descricao);

}
