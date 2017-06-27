package controller;

import java.util.List;

import Dao.DaoFactory;
import Dao.RotaDAO;
import dto.RotaDTO;
import model.Rota;




public class RotaController {
    // Método para criar um Rota
    public static RotaDTO cadastrar(Rota pRota)
    {
        if (pRota == null)
            return new RotaDTO(false, "Tentativa de inserir um Rota nulo");

        // Chamando a camada de persistência
        RotaDAO tDao = DaoFactory.getRotaDAO();
        Rota tRota = tDao.create(pRota);

        // Verificando se houve erro de criação
        if (tRota == null)
            return new RotaDTO(false, "Problemas na gravação do Rota");

        // Retornando o indicativo de sucesso com o objeto criado
        return new RotaDTO(true, "Rota gravado com sucesso", tRota);
    }

    // Método para recuperar um Rota
    public static RotaDTO recuperar(Integer pIdRota)
    {
        // Lendo o objeto
        RotaDAO tDao = DaoFactory.getRotaDAO();
        Rota tRota = tDao.recovery(pIdRota);

        // Verificando se houve erro de recuperação
        if (tRota == null)
            return new RotaDTO(false, "Rota não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto recuperado
        return new RotaDTO(true, "Rota lido com sucesso", tRota);
    }

    // Método para atualizar um Rota
    public static RotaDTO atualizar(Rota pRota)
    {
        if (pRota == null)
            return new RotaDTO(false, "Tentativa de atualizar um Rota nulo");

        // Chamando a camada de persistência
        RotaDAO tDao = DaoFactory.getRotaDAO();
        Rota tRota = tDao.update(pRota);

        // Verificando se houve erro de atualização
        if (tRota == null)
            return new RotaDTO(false, "Rota não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto atualizado
        return new RotaDTO(true, "Rota regravado com sucesso", tRota);
    }

    // Método para deletar um Rota
    public static RotaDTO remover(Integer pIdRota)
    {
        // Removendo o Rota e verificando se houve erro de remoção
        RotaDAO tDao = DaoFactory.getRotaDAO();
        if (! tDao.delete(pIdRota))
            return new RotaDTO(false, "Rota não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto removido
        return new RotaDTO(true, "Rota removido com sucesso");
    }

    // Método para pesquisar todos os Rotas
    public static RotaDTO pesquisar()
    {
        // Obtendo a lista de Rotas
        RotaDAO tDao = DaoFactory.getRotaDAO();
        List<Rota> tLista = tDao.search();

        // Verificando se a lista está vazia
        if (tLista.isEmpty())
            return new RotaDTO(false, "Lista de Rotas vazia");

        // Retornando a lista obtida
        return new RotaDTO(true, "Lista de Rotas recuperada", tLista);
    }

	public static RotaDTO pesquisarPorID(Integer pIdRota) {
        // Caso o email de pesquisa seja nulo, retorna a lista geral
        if (pIdRota == null)
            return pesquisar();

        // Obtendo a lista de alunos
        RotaDAO tDao = DaoFactory.getRotaDAO();
        List<Rota> tLista = tDao.searchByID(pIdRota);

        // Verificando se a lista está vazia
        if (tLista.isEmpty())
            return new RotaDTO(false, "Nenhum registro encontrado com email '" + pIdRota + "'");

        // Retornando a lista obtida
        return new RotaDTO(true, "Lista de alunos recuperada", tLista);
    }
}
