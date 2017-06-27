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
import controller.EstabelecimentoComPontoController;
import dto.EstabelecimentoComPontoDTO;
import model.EstabelecimentoComPonto;

@Path("/EstabelecimentoComPonto")
public class EstabelecimentoComPontoRestfull {

	//////////////////////
	@POST
	@Path("/Cadastrar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public EstabelecimentoComPontoDTO cadastrar(EstabelecimentoComPonto pEstabelecimentoComPonto) {
		// Iniciando a transação Hibernate
		

		EstabelecimentoComPontoDTO tDto = EstabelecimentoComPontoController.cadastrar(pEstabelecimentoComPonto);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	/**
	 * @GET @Path("/Recuperar/{matricula}")
	 * @Produces(MediaType.APPLICATION_JSON) public EstabelecimentoComPontoDTO
	 *                                       recuperar(@PathParam("matricula")
	 *                                       int pMatricula) { return
	 *                                       EstabelecimentoComPontoController.recuperar(pMatricula
	 *                                       ); }
	 **/
	@PUT
	@Path("/Atualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public EstabelecimentoComPontoDTO atualizar(EstabelecimentoComPonto pEstabelecimentoComPonto) {
		// Iniciando a transação Hibernate
		

		EstabelecimentoComPontoDTO tDto = EstabelecimentoComPontoController.atualizar(pEstabelecimentoComPonto);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@DELETE
	@Path("/Remover/{idEstabelecimentoComPonto}")
	@Produces(MediaType.APPLICATION_JSON)
	public EstabelecimentoComPontoDTO remover(@PathParam("idEstabelecimentoComPonto") Integer pidEstabelecimentoComPonto) {
		// Iniciando a transação Hibernate
		

		EstabelecimentoComPontoDTO tDto = EstabelecimentoComPontoController.remover(pidEstabelecimentoComPonto);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@GET
	@Path("/Pesquisar")
	@Produces(MediaType.APPLICATION_JSON)
	public EstabelecimentoComPontoDTO pesquisar() {
		// Iniciando a transação Hibernate
		

		EstabelecimentoComPontoDTO tDto = EstabelecimentoComPontoController.pesquisar();

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@GET
	@Path("/PesquisarPorID/{idEstabelecimentoComPonto}")
	@Produces(MediaType.APPLICATION_JSON)
	public EstabelecimentoComPontoDTO pesquisarPorId(@PathParam("idEstabelecimentoComPonto") Integer pidEstabelecimentoComPonto) {// Iniciando
																			// a
																			// transação
																			// Hibernate
		

		EstabelecimentoComPontoDTO tDto = EstabelecimentoComPontoController.pesquisarPorID(pidEstabelecimentoComPonto);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

}
