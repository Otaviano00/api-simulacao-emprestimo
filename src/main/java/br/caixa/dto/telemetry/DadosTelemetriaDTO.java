package br.caixa.dto.telemetry;

import java.math.BigDecimal;

public record DadosTelemetriaDTO(
        String nomeApi,
        Long qtdRequisicoes,
        Long tempoMedio,
        Long tempoMinimo,
        Long tempoMaximo,
        BigDecimal percentualSucesso
) {
}
