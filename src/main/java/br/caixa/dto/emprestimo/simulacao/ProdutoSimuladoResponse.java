package br.caixa.dto.emprestimo.simulacao;

import java.time.LocalDate;
import java.util.List;

public record ProdutoSimuladoResponse(
        LocalDate dataReferencia,
        List<ProdutoDTO> simulacoes
) {
}
