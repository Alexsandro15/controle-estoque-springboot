package com.example.estoqueSpringBoot.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoFornecedorDTO {

    private Long id;
    private Long produtoId;
    private Long fornecedorId;

    public ProdutoFornecedorDTO(Long produtoId, Long fornecedorId) {
        this.produtoId = produtoId;
        this.fornecedorId = fornecedorId;
    }
}
