package controller;

import java.util.List;

import Dao.DaoFactory;
import Dao.GaleriaDAO;
import dto.GaleriaDTO;
import model.Galeria;




public class GaleriaController {
    // Método para criar um Galeria
    public static GaleriaDTO cadastrar(Galeria pGaleria)
    {
        if (pGaleria == null)
            return new GaleriaDTO(false, "Tentativa de inserir um Galeria nulo");

        // Chamando a camada de persistência
        GaleriaDAO tDao = DaoFactory.getGaleriaDAO();
        Galeria tGaleria = tDao.create(pGaleria);

        // Verificando se houve erro de criação
        if (tGaleria == null)
            return new GaleriaDTO(false, "Problemas na gravação do Galeria");

        // Retornando o indicativo de sucesso com o objeto criado
        return new GaleriaDTO(true, "Galeria gravado com sucesso", tGaleria);
    }

    // Método para recuperar um Galeria
    public static GaleriaDTO recuperar(Integer pIdGaleria)
    {
        // Lendo o objeto
        GaleriaDAO tDao = DaoFactory.getGaleriaDAO();
        Galeria tGaleria = tDao.recovery(pIdGaleria);

        // Verificando se houve erro de recuperação
        if (tGaleria == null)
            return new GaleriaDTO(false, "Galeria não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto recuperado
        return new GaleriaDTO(true, "Galeria lido com sucesso", tGaleria);
    }

    // Método para atualizar um Galeria
    public static GaleriaDTO atualizar(Galeria pGaleria)
    {
        if (pGaleria == null)
            return new GaleriaDTO(false, "Tentativa de atualizar um Galeria nulo");

        // Chamando a camada de persistência
        GaleriaDAO tDao = DaoFactory.getGaleriaDAO();
        Galeria tGaleria = tDao.update(pGaleria);

        // Verificando se houve erro de atualização
        if (tGaleria == null)
            return new GaleriaDTO(false, "Galeria não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto atualizado
        return new GaleriaDTO(true, "Galeria regravado com sucesso", tGaleria);
    }

    // Método para deletar um Galeria
    public static GaleriaDTO remover(Integer pIdGaleria)
    {
        // Removendo o Galeria e verificando se houve erro de remoção
        GaleriaDAO tDao = DaoFactory.getGaleriaDAO();
        if (! tDao.delete(pIdGaleria))
            return new GaleriaDTO(false, "Galeria não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto removido
        return new GaleriaDTO(true, "Galeria removido com sucesso");
    }

    // Método para pesquisar todos os Galerias
    public static GaleriaDTO pesquisar()
    {
        // Obtendo a lista de Galerias
        GaleriaDAO tDao = DaoFactory.getGaleriaDAO();
        List<Galeria> tLista = tDao.search();

        // Verificando se a lista está vazia
        if (tLista.isEmpty())
            return new GaleriaDTO(false, "Lista de Galerias vazia");

        // Retornando a lista obtida
        return new GaleriaDTO(true, "Lista de Galerias recuperada", tLista);
    }

	public static GaleriaDTO pesquisarPorID(Integer pIdGaleria) {
        // Caso o email de pesquisa seja nulo, retorna a lista geral
        if (pIdGaleria == null)
            return pesquisar();

        // Obtendo a lista de alunos
        GaleriaDAO tDao = DaoFactory.getGaleriaDAO();
        List<Galeria> tLista = tDao.searchByID(pIdGaleria);

        // Verificando se a lista está vazia
        if (tLista.isEmpty())
            return new GaleriaDTO(false, "Nenhum registro encontrado com email '" + pIdGaleria + "'");

        // Retornando a lista obtida
        return new GaleriaDTO(true, "Lista de alunos recuperada", tLista);
    }
}
