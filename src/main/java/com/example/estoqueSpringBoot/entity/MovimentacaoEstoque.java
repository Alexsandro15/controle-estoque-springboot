package com.example.estoqueSpringBoot.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.estoqueSpringBoot.enums.Tipo;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movimentacao_estoque")
public class MovimentacaoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    private Integer quantidade;
    private BigDecimal preco_unitario;
    private LocalDateTime data;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;
}