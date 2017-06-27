package controller;

import java.util.List;

import Dao.DaoFactory;
import Dao.EstabelecimentoDAO;
import dto.EstabelecimentoDTO;
import model.Estabelecimento;




public class EstabelecimentoController {
    // Método para criar um Estabelecimento
    public static EstabelecimentoDTO cadastrar(Estabelecimento pEstabelecimento)
    {
        if (pEstabelecimento == null)
            return new EstabelecimentoDTO(false, "Tentativa de inserir um Estabelecimento nulo");

        // Chamando a camada de persistência
        EstabelecimentoDAO tDao = DaoFactory.getEstabelecimentoDAO();
        Estabelecimento tEstabelecimento = tDao.create(pEstabelecimento);

        // Verificando se houve erro de criação
        if (tEstabelecimento == null)
            return new EstabelecimentoDTO(false, "Problemas na gravação do Estabelecimento");

        // Retornando o indicativo de sucesso com o objeto criado
        return new EstabelecimentoDTO(true, "Estabelecimento gravado com sucesso", tEstabelecimento);
    }

    // Método para recuperar um Estabelecimento
    public static EstabelecimentoDTO recuperar(Integer pIdEstabelecimento)
    {
        // Lendo o objeto
        EstabelecimentoDAO tDao = DaoFactory.getEstabelecimentoDAO();
        Estabelecimento tEstabelecimento = tDao.recovery(pIdEstabelecimento);

        // Verificando se houve erro de recuperação
        if (tEstabelecimento == null)
            return new EstabelecimentoDTO(false, "Estabelecimento não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto recuperado
        return new EstabelecimentoDTO(true, "Estabelecimento lido com sucesso", tEstabelecimento);
    }

    // Método para atualizar um Estabelecimento
    public static EstabelecimentoDTO atualizar(Estabelecimento pEstabelecimento)
    {
        if (pEstabelecimento == null)
            return new EstabelecimentoDTO(false, "Tentativa de atualizar um Estabelecimento nulo");

        // Chamando a camada de persistência
        EstabelecimentoDAO tDao = DaoFactory.getEstabelecimentoDAO();
        Estabelecimento tEstabelecimento = tDao.update(pEstabelecimento);

        // Verificando se houve erro de atualização
        if (tEstabelecimento == null)
            return new EstabelecimentoDTO(false, "Estabelecimento não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto atualizado
        return new EstabelecimentoDTO(true, "Estabelecimento regravado com sucesso", tEstabelecimento);
    }

    // Método para deletar um Estabelecimento
    public static EstabelecimentoDTO remover(Integer pIdEstabelecimento)
    {
        // Removendo o Estabelecimento e verificando se houve erro de remoção
        EstabelecimentoDAO tDao = DaoFactory.getEstabelecimentoDAO();
        if (! tDao.delete(pIdEstabelecimento))
            return new EstabelecimentoDTO(false, "Estabelecimento não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto removido
        return new EstabelecimentoDTO(true, "Estabelecimento removido com sucesso");
    }

    // Método para pesquisar todos os Estabelecimentos
    public static EstabelecimentoDTO pesquisar()
    {
        // Obtendo a lista de Estabelecimentos
        EstabelecimentoDAO tDao = DaoFactory.getEstabelecimentoDAO();
        List<Estabelecimento> tLista = tDao.search();

        // Verificando se a lista está vazia
        if (tLista.isEmpty())
            return new EstabelecimentoDTO(false, "Lista de Estabelecimentos vazia");

        // Retornando a lista obtida
        return new EstabelecimentoDTO(true, "Lista de Estabelecimentos recuperada", tLista);
    }

	public static EstabelecimentoDTO pesquisarPorID(Integer pIdEstabelecimento) {
        // Caso o email de pesquisa seja nulo, retorna a lista geral
        if (pIdEstabelecimento == null)
            return pesquisar();

        // Obtendo a lista de alunos
        EstabelecimentoDAO tDao = DaoFactory.getEstabelecimentoDAO();
        List<Estabelecimento> tLista = tDao.searchByID(pIdEstabelecimento);

        // Verificando se a lista está vazia
        if (tLista.isEmpty())
            return new EstabelecimentoDTO(false, "Nenhum registro encontrado com email '" + pIdEstabelecimento + "'");

        // Retornando a lista obtida
        return new EstabelecimentoDTO(true, "Lista de alunos recuperada", tLista);
    }
}
