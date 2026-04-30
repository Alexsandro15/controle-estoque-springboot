package com.example.estoqueSpringBoot.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstoqueDTO {

    private Long id;
    private Integer quantidade;
    private Long produtoId;

    public EstoqueDTO(Integer quantidade, Long produtoId) {
        this.quantidade = quantidade;
        this.produtoId = produtoId;
    }
}