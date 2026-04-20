package com.example.estoqueSpringBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.estoqueSpringBoot.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // buscar por ativo(só ativos)
    List<Produto> findByAtivoTrue();

    // buscar por nome
    List<Produto> findByNomeContainingIgnoreCase(String nome);

    // ativos + nome
    List<Produto> findByAtivoTrueAndNomeContainingIgnoreCase(String nome);
}
