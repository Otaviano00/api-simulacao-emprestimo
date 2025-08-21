package br.caixa.dto.emprestimo.simulacao;

import java.math.BigDecimal;

public record SimulacaoEmprestimoRequest(
        BigDecimal valorDesejado,
        Integer prazo
) {
}
