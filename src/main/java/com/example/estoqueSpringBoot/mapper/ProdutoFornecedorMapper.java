package com.example.estoqueSpringBoot.mapper;

import org.springframework.stereotype.Component;
import com.example.estoqueSpringBoot.dto.ProdutoFornecedorDTO;
import com.example.estoqueSpringBoot.entity.Fornecedor;
import com.example.estoqueSpringBoot.entity.Produto;
import com.example.estoqueSpringBoot.entity.ProdutoFornecedor;

@Component
public class ProdutoFornecedorMapper {

    public ProdutoFornecedor toEntity(ProdutoFornecedorDTO dto, Produto produto, Fornecedor fornecedor) {
        return ProdutoFornecedor.builder()
                .id(dto.getId())
                .produto(produto)
                .fornecedor(fornecedor)
                .build();
    }

    public ProdutoFornecedorDTO toDTO(ProdutoFornecedor entity) {
        return ProdutoFornecedorDTO.builder()
                .id(entity.getId())
                .produtoId(entity.getProduto().getId())
                .fornecedorId(entity.getFornecedor().getId())
                .build();
    }
}