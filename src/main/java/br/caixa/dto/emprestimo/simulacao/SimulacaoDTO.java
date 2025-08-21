package br.caixa.dto.emprestimo.simulacao;

import java.math.BigDecimal;

public record SimulacaoDTO(
        Long idSimulacao,
        BigDecimal valorDesejado,
        Integer prazo,
        BigDecimal valorTotalParcelas
) {
}
