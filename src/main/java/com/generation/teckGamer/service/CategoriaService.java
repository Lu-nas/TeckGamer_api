package com.generation.teckGamer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import com.generation.teckGamer.model.Categoria;
import com.generation.teckGamer.repository.CategoriaRepository;

@Service
public class CategoriaService {
    

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> buscarTodas() {
        return categoriaRepository.findAll();
    }

    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new ResolutionException("Categoria não encontrada"));
    }

    public Categoria criar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria atualizar(Long id, Categoria categoriaAtualizada) {

        Categoria categoriaExistente = buscarPorId(id);

        categoriaExistente.setNome(categoriaAtualizada.getNome());

        return categoriaRepository.save(categoriaExistente);
    }

    public void deletar(Long id) {
        buscarPorId(id);
        categoriaRepository.deleteById(id);
    }

  
}
