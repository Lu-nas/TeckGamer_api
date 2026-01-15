package com.generation.teckGamer.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.generation.teckGamer.model.Game;
import com.generation.teckGamer.service.GameService;

@RestController
@RequestMapping("/api/games")
public class GameController {
    
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<List<Game>> listarTodos() {
        return ResponseEntity.ok(gameService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(gameService.buscarPorId(id));
    }

     @PostMapping
    public ResponseEntity<Game> criar(@RequestBody Game game) {
        Game gameCriado = gameService.criar(game);
        return ResponseEntity.status(HttpStatus.CREATED).body(gameCriado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        gameService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
