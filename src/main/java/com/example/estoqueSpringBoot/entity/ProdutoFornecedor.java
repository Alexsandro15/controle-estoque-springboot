package com.example.estoqueSpringBoot.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produto_fornecedor")
public class ProdutoFornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    //@MapsId("id")
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @ManyToOne
    //@MapsId("id")
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;
}