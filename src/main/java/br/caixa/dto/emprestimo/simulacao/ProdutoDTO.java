package br.caixa.dto.emprestimo.simulacao;

import java.math.BigDecimal;

public record ProdutoDTO(
        String codigoProduto,
        String descricaoProduto,
        BigDecimal taxaMediaJuro,
        BigDecimal valorMedioPrestacao,
        BigDecimal valorTotalDesejado,
        BigDecimal valorTotalCredito
) {
}
