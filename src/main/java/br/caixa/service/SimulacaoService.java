package br.caixa.service;

import br.caixa.entity.Simulacao;
import br.caixa.repository.ProdutoRepository;
import br.caixa.repository.SimulacaoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class SimulacaoService {

    @Inject
    SimulacaoRepository simulacaoRepository;

    @Transactional
    public List<Simulacao> getAllSimulacoes() {
        return simulacaoRepository.listAll();
    }
}
