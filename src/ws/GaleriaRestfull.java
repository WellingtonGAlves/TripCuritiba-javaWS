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
import controller.GaleriaController;
import dto.GaleriaDTO;
import model.Galeria;

@Path("/Galeria")
public class GaleriaRestfull {

	//////////////////////
	@POST
	@Path("/Cadastrar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public GaleriaDTO cadastrar(Galeria pGaleria) {
		// Iniciando a transação Hibernate
		

		GaleriaDTO tDto = GaleriaController.cadastrar(pGaleria);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	/**
	 * @GET @Path("/Recuperar/{matricula}")
	 * @Produces(MediaType.APPLICATION_JSON) public GaleriaDTO
	 *                                       recuperar(@PathParam("matricula")
	 *                                       int pMatricula) { return
	 *                                       GaleriaController.recuperar(pMatricula
	 *                                       ); }
	 **/
	@PUT
	@Path("/Atualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public GaleriaDTO atualizar(Galeria pGaleria) {
		// Iniciando a transação Hibernate
		

		GaleriaDTO tDto = GaleriaController.atualizar(pGaleria);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@DELETE
	@Path("/Remover/{idGaleria}")
	@Produces(MediaType.APPLICATION_JSON)
	public GaleriaDTO remover(@PathParam("idGaleria") Integer pidGaleria) {
		// Iniciando a transação Hibernate
		

		GaleriaDTO tDto = GaleriaController.remover(pidGaleria);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@GET
	@Path("/Pesquisar")
	@Produces(MediaType.APPLICATION_JSON)
	public GaleriaDTO pesquisar() {
		// Iniciando a transação Hibernate
		

		GaleriaDTO tDto = GaleriaController.pesquisar();

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@GET
	@Path("/PesquisarPorID/{idGaleria}")
	@Produces(MediaType.APPLICATION_JSON)
	public GaleriaDTO pesquisarPorId(@PathParam("idGaleria") Integer pidGaleria) {// Iniciando
																			// a
																			// transação
																			// Hibernate
		

		GaleriaDTO tDto = GaleriaController.pesquisarPorID(pidGaleria);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

}
