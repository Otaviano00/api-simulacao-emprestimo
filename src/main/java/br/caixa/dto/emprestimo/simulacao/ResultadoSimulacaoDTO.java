package br.caixa.dto.emprestimo.simulacao;

import br.caixa.dto.emprestimo.simulacao.enums.TipoSimulacao;

import java.util.List;

public record ResultadoSimulacaoDTO(
        TipoSimulacao tipoSimulacao,
        List<ParcelasSimulacaoDTO> parcelas
) {
}
