package com.example.estoqueSpringBoot.mapper;

import org.springframework.stereotype.Component;
import com.example.estoqueSpringBoot.dto.ProdutoDTO;
import com.example.estoqueSpringBoot.entity.Produto;

@Component
public class ProdutoMapper {

    public Produto toEntity(ProdutoDTO dto) {
        return Produto.builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .descricao(dto.getDescricao())
                .ativo(dto.getAtivo())
                .build();
    }

    public ProdutoDTO toDTO(Produto entity) {
        return ProdutoDTO.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .descricao(entity.getDescricao())
                .ativo(entity.getAtivo())
                .build();
    }
}