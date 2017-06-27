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
import controller.PessoaController;
import dto.PessoaDTO;
import model.Pessoa;






@Path("/Pessoa")
public class PessoaRestfull
{
	
	
	//////////////////////
    @POST
    @Path("/Cadastrar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public PessoaDTO cadastrar(Pessoa pPessoa)
    {
    	// Iniciando a transação Hibernate

        PessoaDTO tDto = PessoaController.cadastrar(pPessoa);

        // Confirmando a transação hibernate

        // Retornando o resultado
       return tDto;
    }

    /**@GET
    @Path("/Recuperar/{matricula}")
    @Produces(MediaType.APPLICATION_JSON)
    public PessoaDTO recuperar(@PathParam("matricula") int pMatricula)
    {
        return PessoaController.recuperar(pMatricula);
    }
	**/
    @PUT
    @Path("/Atualizar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public PessoaDTO atualizar(Pessoa pPessoa)
    {
    	// Iniciando a transação Hibernate

        PessoaDTO tDto = PessoaController.atualizar(pPessoa);

        // Confirmando a transação hibernate

        // Retornando o resultado
       return tDto;
    }

    @DELETE
    @Path("/Remover/{email}")
    @Produces(MediaType.APPLICATION_JSON)
    public PessoaDTO remover(@PathParam("email") String pEmail)
    {
    	// Iniciando a transação Hibernate

        PessoaDTO tDto = PessoaController.remover(pEmail);

        // Confirmando a transação hibernate

        // Retornando o resultado
       return tDto;
    }

    @GET
    @Path("/Pesquisar")
    @Produces(MediaType.APPLICATION_JSON)
    public PessoaDTO pesquisar()
    {
       return  PessoaController.pesquisar();
    }

    @GET
    @Path("/PesquisarPorEmail/{email}")
    @Produces(MediaType.APPLICATION_JSON)
    public PessoaDTO pesquisarPorEmail(@PathParam("email") String pEmail)
    {// Iniciando a transação Hibernate

    	PessoaDTO tDto = PessoaController.pesquisarPorEmail(pEmail);

        // Confirmando a transação hibernate

        // Retornando o resultado
       return tDto;}

    
}
