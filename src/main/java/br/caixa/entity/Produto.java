package br.caixa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "PRODUTO")
@Data
public class Produto {
    @Id
    @NotNull
    @Column(name = "CO_PRODUTO", nullable = false)
    private Integer id;

    @NotBlank
    @Column(name = "NO_PRODUTO", nullable = false, length = 200)
    private String nome;

    @NotNull
    @Positive
    @Column(name = "PC_TAXA_JUROS", nullable = false)
    private BigDecimal taxaJuros;

    @NotNull
    @Positive
    @Column(name = "NU_MINIMO_MESES", nullable = false)
    private Short numeroMinimoMeses;

    @Positive
    @Column(name = "NU_MAXIMO_MESES", nullable = true)
    private Short numeroMaximoMeses;

    @NotNull
    @Positive
    @Column(name = "VR_MINIMO", nullable = false)
    private BigDecimal valorMinimo;

    @Positive
    @Column(name = "VR_MAXIMO", nullable = true)
    private BigDecimal valorMaximo;
}
