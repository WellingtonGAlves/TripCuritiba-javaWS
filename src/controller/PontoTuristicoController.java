package controller;

import java.util.List;

import Dao.DaoFactory;
import Dao.PontoTuristicoDAO;
import dto.PontoTuristicoDTO;
import model.PontoTuristico;




public class PontoTuristicoController {
    // M�todo para criar um PontoTuristico
    public static PontoTuristicoDTO cadastrar(PontoTuristico pPontoTuristico)
    {
        if (pPontoTuristico == null)
            return new PontoTuristicoDTO(false, "Tentativa de inserir um PontoTuristico nulo");

        // Chamando a camada de persist�ncia
        PontoTuristicoDAO tDao = DaoFactory.getPontoTuristicoDAO();
        PontoTuristico tPontoTuristico = tDao.create(pPontoTuristico);

        // Verificando se houve erro de cria��o
        if (tPontoTuristico == null)
            return new PontoTuristicoDTO(false, "Problemas na grava��o do PontoTuristico");

        // Retornando o indicativo de sucesso com o objeto criado
        return new PontoTuristicoDTO(true, "PontoTuristico gravado com sucesso", tPontoTuristico);
    }

    // M�todo para recuperar um PontoTuristico
    public static PontoTuristicoDTO recuperar(Integer pIdPonto)
    {
        // Lendo o objeto
        PontoTuristicoDAO tDao = DaoFactory.getPontoTuristicoDAO();
        PontoTuristico tPontoTuristico = tDao.recovery(pIdPonto);

        // Verificando se houve erro de recupera��o
        if (tPontoTuristico == null)
            return new PontoTuristicoDTO(false, "PontoTuristico n�o existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto recuperado
        return new PontoTuristicoDTO(true, "PontoTuristico lido com sucesso", tPontoTuristico);
    }

    // M�todo para atualizar um PontoTuristico
    public static PontoTuristicoDTO atualizar(PontoTuristico pPontoTuristico)
    {
        if (pPontoTuristico == null)
            return new PontoTuristicoDTO(false, "Tentativa de atualizar um PontoTuristico nulo");

        // Chamando a camada de persist�ncia
        PontoTuristicoDAO tDao = DaoFactory.getPontoTuristicoDAO();
        PontoTuristico tPontoTuristico = tDao.update(pPontoTuristico);

        // Verificando se houve erro de atualiza��o
        if (tPontoTuristico == null)
            return new PontoTuristicoDTO(false, "PontoTuristico n�o existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto atualizado
        return new PontoTuristicoDTO(true, "PontoTuristico regravado com sucesso", tPontoTuristico);
    }

    // M�todo para deletar um PontoTuristico
    public static PontoTuristicoDTO remover(Integer pIdPonto)
    {
        // Removendo o PontoTuristico e verificando se houve erro de remo��o
        PontoTuristicoDAO tDao = DaoFactory.getPontoTuristicoDAO();
        if (! tDao.delete(pIdPonto))
            return new PontoTuristicoDTO(false, "PontoTuristico n�o existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto removido
        return new PontoTuristicoDTO(true, "PontoTuristico removido com sucesso");
    }

    // M�todo para pesquisar todos os PontoTuristicos
    public static PontoTuristicoDTO pesquisar()
    {
        // Obtendo a lista de PontoTuristicos
        PontoTuristicoDAO tDao = DaoFactory.getPontoTuristicoDAO();
        List<PontoTuristico> tLista = tDao.search();

        // Verificando se a lista est� vazia
        if (tLista.isEmpty())
            return new PontoTuristicoDTO(false, "Lista de PontoTuristicos vazia");

        // Retornando a lista obtida
        return new PontoTuristicoDTO(true, "Lista de PontoTuristicos recuperada", tLista);
    }

	public static PontoTuristicoDTO pesquisarPorID (Integer pIdPonto) {
        // Caso o email de pesquisa seja nulo, retorna a lista geral
        if (pIdPonto == null)
            return pesquisar();

        // Obtendo a lista de alunos
        PontoTuristicoDAO tDao = DaoFactory.getPontoTuristicoDAO();
        List<PontoTuristico> tLista = tDao.searchByID(pIdPonto);

        // Verificando se a lista est� vazia
        if (tLista.isEmpty())
            return new PontoTuristicoDTO(false, "Nenhum registro encontrado com email '" + pIdPonto + "'");

        // Retornando a lista obtida
        return new PontoTuristicoDTO(true, "Lista de alunos recuperada", tLista);
    }
}
