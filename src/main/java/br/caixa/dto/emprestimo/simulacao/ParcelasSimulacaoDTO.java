package br.caixa.dto.emprestimo.simulacao;

import java.math.BigDecimal;

public record ParcelasSimulacaoDTO(
        Long numero,
        BigDecimal valorAmortizacao,
        BigDecimal valorJuros,
        BigDecimal valorPrestacao
) {
}
