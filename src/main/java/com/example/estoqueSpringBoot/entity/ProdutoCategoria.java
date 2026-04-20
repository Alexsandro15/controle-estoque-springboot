package com.example.estoqueSpringBoot.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produto_categoria")
public class ProdutoCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    //@MapsId("id")
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @ManyToOne
    //@MapsId("id")
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}