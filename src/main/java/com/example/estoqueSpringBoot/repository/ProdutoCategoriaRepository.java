package com.example.estoqueSpringBoot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.estoqueSpringBoot.entity.ProdutoCategoria;

@Repository
public interface ProdutoCategoriaRepository extends JpaRepository<ProdutoCategoria, Long> {
    
    // todos os vínculos de um produto
    List<ProdutoCategoria> findByProdutoId(Long produtoId);

    // todos os vínculos de um autor
    List<ProdutoCategoria> findByAutorId(Long autorId);

    // remover vínculo específico
    void deleteByProdutoIdAndAutorId(Long produtoId, Long autorId);
}
