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
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "descricao", length = 300)
    private String descricao;

    @Column(name = "ativo", nullable = false, columnDefinition = "BOOLEAN DEFAULT TRUE")
    private Boolean ativo;

    @OneToMany(mappedBy = "produto")
    private List<ProdutoCategoria> categorias;

    @OneToMany(mappedBy = "produto")
    private List<ProdutoFornecedor> fornecedores;

    @OneToOne(mappedBy = "produto")
    private Estoque estoque;

    @OneToMany(mappedBy = "produto")
    private List<MovimentacaoEstoque> movimentacoes;
}