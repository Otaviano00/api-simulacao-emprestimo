package br.caixa.resource.emprestimo;

import br.caixa.dto.emprestimo.simulacao.SimulacaoEmprestimoRequest;
import br.caixa.entity.Produto;
import br.caixa.service.ProdutoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

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
    @Operation(
            summary = "Listar Produtos simulados",
            description = "Retorna uma lista com valores simulados para cada produto"
    )
    @APIResponse(
            responseCode = "200",
            description = "Simulação realizada com sucesso",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Produto.class, type = SchemaType.ARRAY))
    )
    @GET
    public Response getSimulacoes() {
        var produtos = produtoService.getAllProdutos();
        return Response.ok(produtos).build();
    }

}
