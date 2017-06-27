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
import controller.PontoTuristicoController;
import dto.PontoTuristicoDTO;
import model.PontoTuristico;






@Path("/PontoTuristico")
public class PontoTuristicoRestfull
{
	
	
	//////////////////////
    @POST
    @Path("/Cadastrar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public PontoTuristicoDTO cadastrar(PontoTuristico pPontoTuristico)
    {
    	// Iniciando a transação Hibernate
        

        PontoTuristicoDTO tDto = PontoTuristicoController.cadastrar(pPontoTuristico);

        // Confirmando a transação hibernate
        

        // Retornando o resultado
       return tDto;
    }

    /**@GET
    @Path("/Recuperar/{matricula}")
    @Produces(MediaType.APPLICATION_JSON)
    public PontoTuristicoDTO recuperar(@PathParam("matricula") int pMatricula)
    {
        return PontoTuristicoController.recuperar(pMatricula);
    }
	**/
    @PUT
    @Path("/Atualizar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public PontoTuristicoDTO atualizar(PontoTuristico pPontoTuristico)
    {
    	// Iniciando a transação Hibernate
        

        PontoTuristicoDTO tDto = PontoTuristicoController.atualizar(pPontoTuristico);

        // Confirmando a transação hibernate
        

        // Retornando o resultado
       return tDto;
    }

    @DELETE
    @Path("/Remover/{idPonto}")
    @Produces(MediaType.APPLICATION_JSON)
    public PontoTuristicoDTO remover(@PathParam("idPonto") Integer pIdPonto)
    {
    	// Iniciando a transação Hibernate
        

        PontoTuristicoDTO tDto = PontoTuristicoController.remover(pIdPonto);

        // Confirmando a transação hibernate
        

        // Retornando o resultado
       return tDto;
    }

    @GET
    @Path("/Pesquisar")
    @Produces(MediaType.APPLICATION_JSON)
    public PontoTuristicoDTO pesquisar()
    {
    	// Iniciando a transação Hibernate
        

        PontoTuristicoDTO tDto = PontoTuristicoController.pesquisar();

        // Confirmando a transação hibernate
        

        // Retornando o resultado
       return tDto;
    }

    @GET
    @Path("/PesquisarPorID/{idPonto}")
    @Produces(MediaType.APPLICATION_JSON)
    public PontoTuristicoDTO pesquisarPoridPonto(@PathParam("idPonto") Integer pIdPonto)
    {// Iniciando a transação Hibernate
        

        PontoTuristicoDTO tDto = PontoTuristicoController.pesquisarPorID(pIdPonto);

        // Confirmando a transação hibernate
        

        // Retornando o resultado
       return tDto;}

    
}
