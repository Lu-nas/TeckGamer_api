package com.generation.teckGamer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.generation.teckGamer.exception.ResourceNotFoundException;
import com.generation.teckGamer.model.Game;
import com.generation.teckGamer.repository.GameRepository;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

       
	public List<Game> listarTodos() {
        return gameRepository.findAll();
    }

    public Game buscarPorId(Long id) {
        return gameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Game não encontrado"));
    }

    public Game criar(Game game) {
        return gameRepository.save(game);
    }

    public Game atualizar(Long id, Game gameAtualizado) {

        Game gameExistente = buscarPorId(id);

        gameExistente.setNome(gameAtualizado.getNome());
        gameExistente.setGenero(gameAtualizado.getGenero());
        gameExistente.setDescricao(gameAtualizado.getDescricao());
        gameExistente.setPreco(gameAtualizado.getPreco());

        return gameRepository.save(gameExistente);
    }

    public void deletar(Long id) {
        buscarPorId(id);
        gameRepository.deleteById(id);
    }

    // MÉTODO FLEXÍVEL FUTURO — associar a categoria ou aplicar regras
    public void associarCategoria(Game game, Object categoria) {

        // Ex.: game.setCategoria(categoria);
    }
    
}
