package br.caixa.dto.paging;

import lombok.Data;

import java.util.List;

@Data
public class Page<T> {
    private Long pagina;
    private Long qtdRegistros;
    private Long qtdRegistrosPagina;
    private List<T> registros;
}
