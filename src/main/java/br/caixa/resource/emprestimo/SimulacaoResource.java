package br.caixa.resource.emprestimo;

import br.caixa.dto.emprestimo.simulacao.SimulacaoEmprestimoRequest;
import br.caixa.service.ProdutoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("api/v0/emprestimo/simulacao")
@ApplicationScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SimulacaoResource {

    @Inject
    ProdutoService produtoService;

    @POST
    public String simular(@Valid @NotNull SimulacaoEmprestimoRequest request) {
        return "Simulação de empréstimo realizada com sucesso!";
    }

    @Path("produto")
    @GET
    public Response getSimulacoes() {
        var produtos = produtoService.getAllProdutos();
        return Response.ok(produtos).build();
    }

}
