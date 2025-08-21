package br.caixa.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "SIMULACAO")
@Data
public class Simulacao {
    @Id
    @NotNull
    @Column(name = "CO_SIMULACAO", nullable = false)
    private Long id;

    @Positive
    @NotNull
    @Column(name = "VR_DESEJADO", nullable = false)
    private BigDecimal valorDesejado;

    @Positive
    @NotNull
    @Column(name = "NU_PRAZO", nullable = false)
    private Integer prazo;

    @Positive
    @NotNull
    @Column(name = "VR_TOTAL_PARCELAS", nullable = false)
    private BigDecimal valorTotalParcelas;
}
