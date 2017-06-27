package controller;

import java.util.List;

import Dao.DaoFactory;
import Dao.EstabelecimentoComPontoDAO;
import dto.EstabelecimentoComPontoDTO;
import model.EstabelecimentoComPonto;




public class EstabelecimentoComPontoController {
    // M�todo para criar um EstabelecimentoComPonto
    public static EstabelecimentoComPontoDTO cadastrar(EstabelecimentoComPonto pEstabelecimentoComPonto)
    {
        if (pEstabelecimentoComPonto == null)
            return new EstabelecimentoComPontoDTO(false, "Tentativa de inserir um EstabelecimentoComPonto nulo");

        // Chamando a camada de persist�ncia
        EstabelecimentoComPontoDAO tDao = DaoFactory.getEstabelecimentoComPontoDAO();
        EstabelecimentoComPonto tEstabelecimentoComPonto = tDao.create(pEstabelecimentoComPonto);

        // Verificando se houve erro de cria��o
        if (tEstabelecimentoComPonto == null)
            return new EstabelecimentoComPontoDTO(false, "Problemas na grava��o do EstabelecimentoComPonto");

        // Retornando o indicativo de sucesso com o objeto criado
        return new EstabelecimentoComPontoDTO(true, "EstabelecimentoComPonto gravado com sucesso", tEstabelecimentoComPonto);
    }

    // M�todo para recuperar um EstabelecimentoComPonto
    public static EstabelecimentoComPontoDTO recuperar(Integer pIdEstabelecimentoComPonto)
    {
        // Lendo o objeto
        EstabelecimentoComPontoDAO tDao = DaoFactory.getEstabelecimentoComPontoDAO();
        EstabelecimentoComPonto tEstabelecimentoComPonto = tDao.recovery(pIdEstabelecimentoComPonto);

        // Verificando se houve erro de recupera��o
        if (tEstabelecimentoComPonto == null)
            return new EstabelecimentoComPontoDTO(false, "EstabelecimentoComPonto n�o existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto recuperado
        return new EstabelecimentoComPontoDTO(true, "EstabelecimentoComPonto lido com sucesso", tEstabelecimentoComPonto);
    }

    // M�todo para atualizar um EstabelecimentoComPonto
    public static EstabelecimentoComPontoDTO atualizar(EstabelecimentoComPonto pEstabelecimentoComPonto)
    {
        if (pEstabelecimentoComPonto == null)
            return new EstabelecimentoComPontoDTO(false, "Tentativa de atualizar um EstabelecimentoComPonto nulo");

        // Chamando a camada de persist�ncia
        EstabelecimentoComPontoDAO tDao = DaoFactory.getEstabelecimentoComPontoDAO();
        EstabelecimentoComPonto tEstabelecimentoComPonto = tDao.update(pEstabelecimentoComPonto);

        // Verificando se houve erro de atualiza��o
        if (tEstabelecimentoComPonto == null)
            return new EstabelecimentoComPontoDTO(false, "EstabelecimentoComPonto n�o existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto atualizado
        return new EstabelecimentoComPontoDTO(true, "EstabelecimentoComPonto regravado com sucesso", tEstabelecimentoComPonto);
    }

    // M�todo para deletar um EstabelecimentoComPonto
    public static EstabelecimentoComPontoDTO remover(Integer pIdEstabelecimentoComPonto)
    {
        // Removendo o EstabelecimentoComPonto e verificando se houve erro de remo��o
        EstabelecimentoComPontoDAO tDao = DaoFactory.getEstabelecimentoComPontoDAO();
        if (! tDao.delete(pIdEstabelecimentoComPonto))
            return new EstabelecimentoComPontoDTO(false, "EstabelecimentoComPonto n�o existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto removido
        return new EstabelecimentoComPontoDTO(true, "EstabelecimentoComPonto removido com sucesso");
    }

    // M�todo para pesquisar todos os EstabelecimentoComPontos
    public static EstabelecimentoComPontoDTO pesquisar()
    {
        // Obtendo a lista de EstabelecimentoComPontos
        EstabelecimentoComPontoDAO tDao = DaoFactory.getEstabelecimentoComPontoDAO();
        List<EstabelecimentoComPonto> tLista = tDao.search();

        // Verificando se a lista est� vazia
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

        // Verificando se a lista est� vazia
        if (tLista.isEmpty())
            return new EstabelecimentoComPontoDTO(false, "Nenhum registro encontrado com email '" + pIdEstabelecimentoComPonto + "'");

        // Retornando a lista obtida
        return new EstabelecimentoComPontoDTO(true, "Lista de alunos recuperada", tLista);
    }
}
