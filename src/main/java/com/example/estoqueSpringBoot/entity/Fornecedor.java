package com.example.estoqueSpringBoot.entity;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "descricao", length = 300)
    private String descricao;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "telefone", length = 11, nullable = false)
    private String telefone;

    @Column(name = "ativo", nullable = false, columnDefinition = "BOOLEAN DEFAULT TRUE")
    private Boolean ativo;

    @OneToMany(mappedBy = "fornecedor")
    private List<ProdutoFornecedor> produtos;
}