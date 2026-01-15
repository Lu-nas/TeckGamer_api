package com.generation.teckGamer.model;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "games")
public class Game {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O nome do game é obrigatório")
    @Column(nullable = false, length = 150)
	private String nome;

	@NotBlank(message = "O gênero do game é obrigatório")
    @Column(nullable = false, length = 100)
	private String genero;

	@NotBlank(message = "A descrição do game é obrigatória")
    @Column(nullable = false, length = 500)
	private String descricao;

	@NotNull(message = "O preço é obrigatório")
    @Positive(message = "O preço deve ser maior que zero")
    @Column(nullable = false)
	private BigDecimal preco;

	// getters e setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	// equals e hashCode baseados no id

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game game = (Game) o;
        return id != null && id.equals(game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
