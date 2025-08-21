package br.caixa.dto.emprestimo.simulacao;

import java.math.BigDecimal;
import java.util.List;

public record SimulacaoEmprestimoResponse(
        Long idSimulacao,
        Long codigoProduto,
        String descricaoProduto,
        BigDecimal taxaJuros,
        List<ResultadoSimulacaoDTO> resultadosSimulacao
) {
}
