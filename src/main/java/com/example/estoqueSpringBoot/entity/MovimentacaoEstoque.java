package com.example.estoqueSpringBoot.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.example.estoqueSpringBoot.enums.Tipo;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.PastOrPresent;
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
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    @Column(name = "quantidade", nullable = false)
    @Min(1)
    private Integer quantidade;

    @Column(name = "preco_unitario", nullable = false)
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal precoUnitario;

    @Column(name = "data", nullable = false)
    @PastOrPresent
    private LocalDateTime data;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private Tipo tipo;
}