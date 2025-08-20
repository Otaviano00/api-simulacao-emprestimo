package br.caixa.service;

import br.caixa.entity.Produto;
import br.caixa.repository.ProdutoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class ProdutoService {
    @Inject
    ProdutoRepository produtoRepository;

    @Transactional
    public List<Produto> getAllProdutos() {
        return produtoRepository.listAll();
    }
}
