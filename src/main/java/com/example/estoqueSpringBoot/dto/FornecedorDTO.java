package com.example.estoqueSpringBoot.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FornecedorDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String descricao;
    private Boolean ativo;

    public FornecedorDTO(String nome, String email, String telefone, String descricao, Boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.descricao = descricao;
        this.ativo = ativo;
    }
}
