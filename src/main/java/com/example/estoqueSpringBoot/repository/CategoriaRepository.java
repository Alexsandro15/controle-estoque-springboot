package com.example.estoqueSpringBoot.repository;

import java.util.List;

import com.example.estoqueSpringBoot.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> findByAtivoTrue();
}
