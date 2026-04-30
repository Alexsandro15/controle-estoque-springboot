package com.example.estoqueSpringBoot.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.example.estoqueSpringBoot.enums.Tipo;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovimentacaoEstoqueDTO {

    private Long id;
    private Long produtoId;
    private Integer quantidade;
    private BigDecimal precoUnitario;
    private LocalDateTime data;
    private Tipo tipo;

    public MovimentacaoEstoqueDTO(Long produtoId, Integer quantidade, BigDecimal precoUnitario, LocalDateTime data,
            Tipo tipo) {
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.data = data;
        this.tipo = tipo;
    }
}