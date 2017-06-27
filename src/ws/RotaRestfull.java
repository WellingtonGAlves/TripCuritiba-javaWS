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
import controller.RotaController;
import dto.RotaDTO;
import model.Rota;

@Path("/Rota")
public class RotaRestfull {

	//////////////////////
	@POST
	@Path("/Cadastrar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RotaDTO cadastrar(Rota pRota) {
		// Iniciando a transação Hibernate
		

		RotaDTO tDto = RotaController.cadastrar(pRota);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	/**
	 * @GET @Path("/Recuperar/{matricula}")
	 * @Produces(MediaType.APPLICATION_JSON) public RotaDTO
	 *                                       recuperar(@PathParam("matricula")
	 *                                       int pMatricula) { return
	 *                                       RotaController.recuperar(pMatricula
	 *                                       ); }
	 **/
	@PUT
	@Path("/Atualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RotaDTO atualizar(Rota pRota) {
		// Iniciando a transação Hibernate
		

		RotaDTO tDto = RotaController.atualizar(pRota);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@DELETE
	@Path("/Remover/{idRota}")
	@Produces(MediaType.APPLICATION_JSON)
	public RotaDTO remover(@PathParam("idRota") Integer pidRota) {
		// Iniciando a transação Hibernate
		

		RotaDTO tDto = RotaController.remover(pidRota);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@GET
	@Path("/Pesquisar")
	@Produces(MediaType.APPLICATION_JSON)
	public RotaDTO pesquisar() {
		// Iniciando a transação Hibernate
		

		RotaDTO tDto = RotaController.pesquisar();

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@GET
	@Path("/PesquisarPorID/{idRota}")
	@Produces(MediaType.APPLICATION_JSON)
	public RotaDTO pesquisarPorId(@PathParam("idRota") Integer pidRota) {// Iniciando
																			// a
																			// transação
																			// Hibernate
		

		RotaDTO tDto = RotaController.pesquisarPorID(pidRota);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

}
