package controller;

import java.util.List;

import Dao.DaoFactory;
import Dao.EstabelecimentoComPontoDAO;
import dto.EstabelecimentoComPontoDTO;
import model.EstabelecimentoComPonto;




public class EstabelecimentoComPontoController {
    // Método para criar um EstabelecimentoComPonto
    public static EstabelecimentoComPontoDTO cadastrar(EstabelecimentoComPonto pEstabelecimentoComPonto)
    {
        if (pEstabelecimentoComPonto == null)
            return new EstabelecimentoComPontoDTO(false, "Tentativa de inserir um EstabelecimentoComPonto nulo");

        // Chamando a camada de persistência
        EstabelecimentoComPontoDAO tDao = DaoFactory.getEstabelecimentoComPontoDAO();
        EstabelecimentoComPonto tEstabelecimentoComPonto = tDao.create(pEstabelecimentoComPonto);

        // Verificando se houve erro de criação
        if (tEstabelecimentoComPonto == null)
            return new EstabelecimentoComPontoDTO(false, "Problemas na gravação do EstabelecimentoComPonto");

        // Retornando o indicativo de sucesso com o objeto criado
        return new EstabelecimentoComPontoDTO(true, "EstabelecimentoComPonto gravado com sucesso", tEstabelecimentoComPonto);
    }

    // Método para recuperar um EstabelecimentoComPonto
    public static EstabelecimentoComPontoDTO recuperar(Integer pIdEstabelecimentoComPonto)
    {
        // Lendo o objeto
        EstabelecimentoComPontoDAO tDao = DaoFactory.getEstabelecimentoComPontoDAO();
        EstabelecimentoComPonto tEstabelecimentoComPonto = tDao.recovery(pIdEstabelecimentoComPonto);

        // Verificando se houve erro de recuperação
        if (tEstabelecimentoComPonto == null)
            return new EstabelecimentoComPontoDTO(false, "EstabelecimentoComPonto não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto recuperado
        return new EstabelecimentoComPontoDTO(true, "EstabelecimentoComPonto lido com sucesso", tEstabelecimentoComPonto);
    }

    // Método para atualizar um EstabelecimentoComPonto
    public static EstabelecimentoComPontoDTO atualizar(EstabelecimentoComPonto pEstabelecimentoComPonto)
    {
        if (pEstabelecimentoComPonto == null)
            return new EstabelecimentoComPontoDTO(false, "Tentativa de atualizar um EstabelecimentoComPonto nulo");

        // Chamando a camada de persistência
        EstabelecimentoComPontoDAO tDao = DaoFactory.getEstabelecimentoComPontoDAO();
        EstabelecimentoComPonto tEstabelecimentoComPonto = tDao.update(pEstabelecimentoComPonto);

        // Verificando se houve erro de atualização
        if (tEstabelecimentoComPonto == null)
            return new EstabelecimentoComPontoDTO(false, "EstabelecimentoComPonto não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto atualizado
        return new EstabelecimentoComPontoDTO(true, "EstabelecimentoComPonto regravado com sucesso", tEstabelecimentoComPonto);
    }

    // Método para deletar um EstabelecimentoComPonto
    public static EstabelecimentoComPontoDTO remover(Integer pIdEstabelecimentoComPonto)
    {
        // Removendo o EstabelecimentoComPonto e verificando se houve erro de remoção
        EstabelecimentoComPontoDAO tDao = DaoFactory.getEstabelecimentoComPontoDAO();
        if (! tDao.delete(pIdEstabelecimentoComPonto))
            return new EstabelecimentoComPontoDTO(false, "EstabelecimentoComPonto não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto removido
        return new EstabelecimentoComPontoDTO(true, "EstabelecimentoComPonto removido com sucesso");
    }

    // Método para pesquisar todos os EstabelecimentoComPontos
    public static EstabelecimentoComPontoDTO pesquisar()
    {
        // Obtendo a lista de EstabelecimentoComPontos
        EstabelecimentoComPontoDAO tDao = DaoFactory.getEstabelecimentoComPontoDAO();
        List<EstabelecimentoComPonto> tLista = tDao.search();

        // Verificando se a lista está vazia
        if (tLista.isEmpty())
            return new EstabelecimentoComPontoDTO(false, "Lista de EstabelecimentoComPontos vazia");

        // Retornando a lista obtida
        return new EstabelecimentoComPontoDTO(true, "Lista de EstabelecimentoComPontos recuperada", tLista);
    }

	public static EstabelecimentoComPontoDTO pesquisarPorID(Integer pIdEstabelecimentoComPonto) {
        // Caso o email de pesquisa seja nulo, retorna a lista geral
        if (pIdEstabelecimentoComPonto == null)
            return pesquisar();

        // Obtendo a lista de alunos
        EstabelecimentoComPontoDAO tDao = DaoFactory.getEstabelecimentoComPontoDAO();
        List<EstabelecimentoComPonto> tLista = tDao.searchByID(pIdEstabelecimentoComPonto);

        // Verificando se a lista está vazia
        if (tLista.isEmpty())
            return new EstabelecimentoComPontoDTO(false, "Nenhum registro encontrado com email '" + pIdEstabelecimentoComPonto + "'");

        // Retornando a lista obtida
        return new EstabelecimentoComPontoDTO(true, "Lista de alunos recuperada", tLista);
    }
}
