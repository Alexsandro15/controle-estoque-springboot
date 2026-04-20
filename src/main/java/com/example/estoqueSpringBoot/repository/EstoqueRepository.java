package com.example.estoqueSpringBoot.repository;

import com.example.estoqueSpringBoot.entity.Estoque;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    
    // cada livro tem 1 estoque
    Optional<Estoque> findByProdutoId(Long ProdutoId);
}
