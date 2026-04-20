package com.example.estoqueSpringBoot.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.estoqueSpringBoot.entity.Fornecedor;
@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    // buscar por ativo(só ativos)
    List<Fornecedor> findByAtivoTrue();

    // ativos + nome
    List<Fornecedor> findByAtivoTrueAndNomeContainingIgnoreCase(String nome);
}
