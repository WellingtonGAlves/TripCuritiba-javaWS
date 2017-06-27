package ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import javax.ws.rs.core.*;

import Hibernate.HibernateUtil;
import controller.EstabelecimentoController;
import dto.EstabelecimentoDTO;
import model.Estabelecimento;

@Path("/Estabelecimento")
public class EstabelecimentoRestfull {

	//////////////////////
	@POST
	@Path("/Cadastrar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public EstabelecimentoDTO cadastrar(Estabelecimento pEstabelecimento) {
		// Iniciando a transação Hibernate
		

		EstabelecimentoDTO tDto = EstabelecimentoController.cadastrar(pEstabelecimento);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	/**
	 * @GET @Path("/Recuperar/{matricula}")
	 * @Produces(MediaType.APPLICATION_JSON) public EstabelecimentoDTO
	 *                                       recuperar(@PathParam("matricula")
	 *                                       int pMatricula) { return
	 *                                       EstabelecimentoController.recuperar(pMatricula
	 *                                       ); }
	 **/
	@PUT
	@Path("/Atualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public EstabelecimentoDTO atualizar(Estabelecimento pEstabelecimento) {
		// Iniciando a transação Hibernate
		

		EstabelecimentoDTO tDto = EstabelecimentoController.atualizar(pEstabelecimento);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@DELETE
	@Path("/Remover/{idEstabelecimento}")
	@Produces(MediaType.APPLICATION_JSON)
	public EstabelecimentoDTO remover(@PathParam("idEstabelecimento") Integer pidEstabelecimento) {
		// Iniciando a transação Hibernate
		

		EstabelecimentoDTO tDto = EstabelecimentoController.remover(pidEstabelecimento);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@GET
	@Path("/Pesquisar")
	@Produces(MediaType.APPLICATION_JSON)
	public EstabelecimentoDTO pesquisar() {
		// Iniciando a transação Hibernate
		

		EstabelecimentoDTO tDto = EstabelecimentoController.pesquisar();

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@GET
	@Path("/PesquisarPorID/{idEstabelecimento}")
	@Produces(MediaType.APPLICATION_JSON)
	public EstabelecimentoDTO pesquisarPorId(@PathParam("idEstabelecimento") Integer pidEstabelecimento) {// Iniciando
																			// a
																			// transação
																			// Hibernate
		

		EstabelecimentoDTO tDto = EstabelecimentoController.pesquisarPorID(pidEstabelecimento);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

}
