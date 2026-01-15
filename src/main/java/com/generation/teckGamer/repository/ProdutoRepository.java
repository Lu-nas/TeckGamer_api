package com.generation.teckGamer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.teckGamer.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
