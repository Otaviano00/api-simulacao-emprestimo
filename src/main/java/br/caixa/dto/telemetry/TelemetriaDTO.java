package br.caixa.dto.telemetry;

import java.time.LocalDate;
import java.util.List;

public record TelemetriaDTO(
        LocalDate dataReferencia,
        List<DadosTelemetriaDTO> listaEndpoints
) {
}
