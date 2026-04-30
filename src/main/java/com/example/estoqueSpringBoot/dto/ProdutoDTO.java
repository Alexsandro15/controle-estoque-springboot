package com.example.estoqueSpringBoot.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {

    private Long id;
    private String nome;
    private String descricao;
    private Boolean ativo;

    public ProdutoDTO(String nome, String descricao, Boolean ativo) {
        this.nome = nome;
        this.descricao = descricao;
        this.ativo = ativo;
    }
}
