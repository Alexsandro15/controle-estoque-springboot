package com.example.estoqueSpringBoot.repository;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.estoqueSpringBoot.entity.MovimentacaoEstoque;
import com.example.estoqueSpringBoot.enums.Tipo;

@Repository
public interface MovimentacaoEstoqueRepository extends JpaRepository<MovimentacaoEstoque, Long> {
    
    // histórico do livro (ordenado)
    List<MovimentacaoEstoque> findByProdutoIdOrderByDataDesc(Long produtoId);

    // por tipo
    List<MovimentacaoEstoque> findByTipo(Tipo tipo);

    // por período
    List<MovimentacaoEstoque> findByDataBetween(LocalDateTime inicio, LocalDateTime fim);
}
