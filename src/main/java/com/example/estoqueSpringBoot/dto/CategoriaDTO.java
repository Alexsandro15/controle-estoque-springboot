package com.example.estoqueSpringBoot.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaDTO {

    private Long id;
    private String nome;
    private Boolean ativo;

    public CategoriaDTO(String nome, Boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;
    }
}
        