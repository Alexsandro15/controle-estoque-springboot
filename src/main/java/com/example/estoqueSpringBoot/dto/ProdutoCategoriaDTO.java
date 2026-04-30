package com.example.estoqueSpringBoot.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoCategoriaDTO {

    private Long id;
    private Long produtoId;
    private Long categoriaId;

    public ProdutoCategoriaDTO(Long produtoId, Long categoriaId) {
        this.produtoId = produtoId;
        this.categoriaId = categoriaId;
    }
}
