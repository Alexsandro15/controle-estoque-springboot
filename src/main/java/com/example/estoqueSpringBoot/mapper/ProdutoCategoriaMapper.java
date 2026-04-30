package com.example.estoqueSpringBoot.mapper;

import org.springframework.stereotype.Component;
import com.example.estoqueSpringBoot.dto.ProdutoCategoriaDTO;
import com.example.estoqueSpringBoot.entity.ProdutoCategoria;
import com.example.estoqueSpringBoot.entity.Produto;
import com.example.estoqueSpringBoot.entity.Categoria;

@Component
public class ProdutoCategoriaMapper {

    public ProdutoCategoria toEntity(ProdutoCategoriaDTO dto, Produto produto, Categoria categoria) {
        return ProdutoCategoria.builder()
                .id(dto.getId())
                .produto(produto)
                .categoria(categoria)
                .build();
    }

    public ProdutoCategoriaDTO toDTO(ProdutoCategoria entity) {
        return ProdutoCategoriaDTO.builder()
                .id(entity.getId())
                .produtoId(entity.getProduto().getId())
                .categoriaId(entity.getCategoria().getId())
                .build();
    }
}