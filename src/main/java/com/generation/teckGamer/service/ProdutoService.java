package com.generation.teckGamer.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.generation.teckGamer.exception.ResourceNotFoundException;
import com.generation.teckGamer.model.Produto;
import com.generation.teckGamer.repository.ProdutoRepository;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;
	 
	 public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado"));
    }

    public Produto criar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto atualizar(Long id, Produto produtoAtualizado) {

        Produto produtoExistente = buscarPorId(id);

        produtoExistente.setNome(produtoAtualizado.getNome());
        produtoExistente.setDescricao(produtoAtualizado.getDescricao());
        produtoExistente.setPreco(produtoAtualizado.getPreco());
        produtoExistente.setCategoria(produtoAtualizado.getCategoria());

        return produtoRepository.save(produtoExistente);
    }

    public void deletar(Long id) {
        buscarPorId(id);
        produtoRepository.deleteById(id);
    }

}
