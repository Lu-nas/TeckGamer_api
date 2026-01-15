package com.generation.teckGamer.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.generation.teckGamer.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
