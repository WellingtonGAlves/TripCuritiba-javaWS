package controller;

import java.util.List;

import Dao.DaoFactory;
import Dao.CategoriaDAO;
import dto.CategoriaDTO;
import model.Categoria;




public class CategoriaController {
    // M�todo para criar um Categoria
    public static CategoriaDTO cadastrar(Categoria pCategoria)
    {
        if (pCategoria == null)
            return new CategoriaDTO(false, "Tentativa de inserir um Categoria nulo");

        // Chamando a camada de persist�ncia
        CategoriaDAO tDao = DaoFactory.getCategoriaDAO();
        Categoria tCategoria = tDao.create(pCategoria);

        // Verificando se houve erro de cria��o
        if (tCategoria == null)
            return new CategoriaDTO(false, "Problemas na grava��o do Categoria");

        // Retornando o indicativo de sucesso com o objeto criado
        return new CategoriaDTO(true, "Categoria gravado com sucesso", tCategoria);
    }

    // M�todo para recuperar um Categoria
    public static CategoriaDTO recuperar(Integer pIdCategoria)
    {
        // Lendo o objeto
        CategoriaDAO tDao = DaoFactory.getCategoriaDAO();
        Categoria tCategoria = tDao.recovery(pIdCategoria);

        // Verificando se houve erro de recupera��o
        if (tCategoria == null)
            return new CategoriaDTO(false, "Categoria n�o existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto recuperado
        return new CategoriaDTO(true, "Categoria lido com sucesso", tCategoria);
    }

    // M�todo para atualizar um Categoria
    public static CategoriaDTO atualizar(Categoria pCategoria)
    {
        if (pCategoria == null)
            return new CategoriaDTO(false, "Tentativa de atualizar um Categoria nulo");

        // Chamando a camada de persist�ncia
        CategoriaDAO tDao = DaoFactory.getCategoriaDAO();
        Categoria tCategoria = tDao.update(pCategoria);

        // Verificando se houve erro de atualiza��o
        if (tCategoria == null)
            return new CategoriaDTO(false, "Categoria n�o existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto atualizado
        return new CategoriaDTO(true, "Categoria regravado com sucesso", tCategoria);
    }

    // M�todo para deletar um Categoria
    public static CategoriaDTO remover(Integer pIdCategoria)
    {
        // Removendo o Categoria e verificando se houve erro de remo��o
        CategoriaDAO tDao = DaoFactory.getCategoriaDAO();
        if (! tDao.delete(pIdCategoria))
            return new CategoriaDTO(false, "Categoria n�o existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto removido
        return new CategoriaDTO(true, "Categoria removido com sucesso");
    }

    // M�todo para pesquisar todos os Categorias
    public static CategoriaDTO pesquisar()
    {
        // Obtendo a lista de Categorias
        CategoriaDAO tDao = DaoFactory.getCategoriaDAO();
        List<Categoria> tLista = tDao.search();

        // Verificando se a lista est� vazia
        if (tLista.isEmpty())
            return new CategoriaDTO(false, "Lista de Categorias vazia");

        // Retornando a lista obtida
        return new CategoriaDTO(true, "Lista de Categorias recuperada", tLista);
    }

	public static CategoriaDTO pesquisarPorID(Integer pIdCategoria) {
        // Caso o email de pesquisa seja nulo, retorna a lista geral
        if (pIdCategoria == null)
            return pesquisar();

        // Obtendo a lista de alunos
        CategoriaDAO tDao = DaoFactory.getCategoriaDAO();
        List<Categoria> tLista = tDao.searchByID(pIdCategoria);

        // Verificando se a lista est� vazia
        if (tLista.isEmpty())
            return new CategoriaDTO(false, "Nenhum registro encontrado com email '" + pIdCategoria + "'");

        // Retornando a lista obtida
        return new CategoriaDTO(true, "Lista de alunos recuperada", tLista);
    }
}
