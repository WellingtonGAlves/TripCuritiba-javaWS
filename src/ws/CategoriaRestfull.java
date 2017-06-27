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
import controller.CategoriaController;
import dto.CategoriaDTO;
import model.Categoria;

@Path("/Categoria")
public class CategoriaRestfull {

	//////////////////////
	@POST
	@Path("/Cadastrar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CategoriaDTO cadastrar(Categoria pCategoria) {
		// Iniciando a transação Hibernate
		

		CategoriaDTO tDto = CategoriaController.cadastrar(pCategoria);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	/**
	 * @GET @Path("/Recuperar/{matricula}")
	 * @Produces(MediaType.APPLICATION_JSON) public CategoriaDTO
	 *                                       recuperar(@PathParam("matricula")
	 *                                       int pMatricula) { return
	 *                                       CategoriaController.recuperar(pMatricula
	 *                                       ); }
	 **/
	@PUT
	@Path("/Atualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CategoriaDTO atualizar(Categoria pCategoria) {
		// Iniciando a transação Hibernate
		

		CategoriaDTO tDto = CategoriaController.atualizar(pCategoria);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@DELETE
	@Path("/Remover/{idRota}")
	@Produces(MediaType.APPLICATION_JSON)
	public CategoriaDTO remover(@PathParam("idRota") Integer pidRota) {
		// Iniciando a transação Hibernate
		

		CategoriaDTO tDto = CategoriaController.remover(pidRota);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@GET
	@Path("/Pesquisar")
	@Produces(MediaType.APPLICATION_JSON)
	public CategoriaDTO pesquisar() {
		// Iniciando a transação Hibernate
		

		CategoriaDTO tDto = CategoriaController.pesquisar();

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

	@GET
	@Path("/PesquisarPorID/{idRota}")
	@Produces(MediaType.APPLICATION_JSON)
	public CategoriaDTO pesquisarPorId(@PathParam("idRota") Integer pidRota) {// Iniciando
																			// a
																			// transação
																			// Hibernate
		

		CategoriaDTO tDto = CategoriaController.pesquisarPorID(pidRota);

		// Confirmando a transação hibernate
		

		// Retornando o resultado
		return tDto;
	}

}
