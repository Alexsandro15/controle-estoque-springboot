package com.example.estoqueSpringBoot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.estoqueSpringBoot.entity.ProdutoFornecedor;

@Repository
public interface ProdutoFornecedorRepository extends JpaRepository<ProdutoFornecedor, Long> {
    // todos os vínculos de um produto
    List<ProdutoFornecedor> findByProdutoId(Long produtoId);

    // todos os vínculos de um fornecedor
    List<ProdutoFornecedor> findByFornecedorId(Long fornecedorId);

    // remover vínculo específico
    void deleteByProdutoIdAndFornecedorId(Long produtoId, Long fornecedorId);
}
