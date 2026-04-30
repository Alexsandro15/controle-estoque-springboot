package com.example.estoqueSpringBoot.mapper;

import org.springframework.stereotype.Component;
import com.example.estoqueSpringBoot.dto.FornecedorDTO;
import com.example.estoqueSpringBoot.entity.Fornecedor;

@Component
public class FornecedorMapper {

    public Fornecedor toEntity(FornecedorDTO dto) {
        return Fornecedor.builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .email(dto.getEmail())
                .telefone(dto.getTelefone())
                .descricao(dto.getDescricao())
                .ativo(dto.getAtivo())
                .build();
    }

    public FornecedorDTO toDTO(Fornecedor entity) {
        return FornecedorDTO.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .email(entity.getEmail())
                .telefone(entity.getTelefone())
                .descricao(entity.getDescricao())
                .ativo(entity.getAtivo())
                .build();
    }
}