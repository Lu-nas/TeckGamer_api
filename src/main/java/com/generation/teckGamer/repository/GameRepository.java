package com.generation.teckGamer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.teckGamer.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}