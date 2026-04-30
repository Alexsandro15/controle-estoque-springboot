package com.example.estoqueSpringBoot.mapper;

import org.springframework.stereotype.Component;
import com.example.estoqueSpringBoot.dto.MovimentacaoEstoqueDTO;
import com.example.estoqueSpringBoot.entity.MovimentacaoEstoque;
import com.example.estoqueSpringBoot.entity.Produto;

@Component
public class MovimentacaoEstoqueMapper {
    public MovimentacaoEstoque toEntity(MovimentacaoEstoqueDTO dto, Produto produto) {
        return MovimentacaoEstoque.builder()
                .id(dto.getId())
                .produto(produto)
                .quantidade(dto.getQuantidade())
                .precoUnitario(dto.getPrecoUnitario())
                .data(dto.getData())
                .tipo(dto.getTipo())
                .build();
    }

    public MovimentacaoEstoqueDTO toDTO(MovimentacaoEstoque entity) {
        return MovimentacaoEstoqueDTO.builder()
                .id(entity.getId())
                .produtoId(entity.getProduto().getId())
                .quantidade(entity.getQuantidade())
                .precoUnitario(entity.getPrecoUnitario())
                .data(entity.getData())
                .tipo(entity.getTipo())
                .build();
    }
}