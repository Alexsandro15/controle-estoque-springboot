package com.example.estoqueSpringBoot.mapper;

import org.springframework.stereotype.Component;
import com.example.estoqueSpringBoot.dto.CategoriaDTO;
import com.example.estoqueSpringBoot.entity.Categoria;

@Component
public class CategoriaMapper {

    public Categoria toEntity(CategoriaDTO dto) {
        return Categoria.builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .ativo(dto.getAtivo())
                .build();
    }

    public CategoriaDTO toDTO(Categoria entity) {
        return CategoriaDTO.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .ativo(entity.getAtivo())
                .build();
    }
}
