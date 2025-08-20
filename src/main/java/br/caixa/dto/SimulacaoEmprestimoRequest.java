package br.caixa.dto;

import java.math.BigDecimal;

public record SimulacaoEmprestimoRequest(BigDecimal valorDesejado, Integer prazo) {

}
