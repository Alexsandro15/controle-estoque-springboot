package com.example.estoqueSpringBoot.mapper;

import org.springframework.stereotype.Component;
import com.example.estoqueSpringBoot.dto.EstoqueDTO;
import com.example.estoqueSpringBoot.entity.Estoque;
import com.example.estoqueSpringBoot.entity.Produto;

@Component
public class EstoqueMapper {

    public Estoque toEntity(EstoqueDTO dto, Produto produto) {
        return Estoque.builder()
                .id(dto.getId())
                .produto(produto)
                .quantidade(dto.getQuantidade())
                .build();
    }

    public EstoqueDTO toDTO(Estoque entity) {
        return EstoqueDTO.builder()
                .id(entity.getId())
                .produtoId(entity.getProduto().getId())
                .quantidade(entity.getQuantidade())
                .build();
    }
}