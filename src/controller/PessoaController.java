package controller;

import java.util.List;

import Dao.DaoFactory;
import Dao.PessoaDAO;
import dto.PessoaDTO;
import model.Pessoa;




public class PessoaController {
    // Método para criar um Pessoa
    public static PessoaDTO cadastrar(Pessoa pPessoa)
    {
        if (pPessoa == null)
            return new PessoaDTO(false, "Tentativa de inserir um Pessoa nulo");

        // Chamando a camada de persistência
        PessoaDAO tDao = DaoFactory.getPessoaDAO();
        Pessoa tPessoa = tDao.create(pPessoa);

        // Verificando se houve erro de criação
        if (tPessoa == null)
            return new PessoaDTO(false, "Problemas na gravação do Pessoa");

        // Retornando o indicativo de sucesso com o objeto criado
        return new PessoaDTO(true, "Pessoa gravado com sucesso", tPessoa);
    }

    // Método para recuperar um Pessoa
    public static PessoaDTO recuperar(String pEmail)
    {
        // Lendo o objeto
        PessoaDAO tDao = DaoFactory.getPessoaDAO();
        Pessoa tPessoa = tDao.recovery(pEmail);

        // Verificando se houve erro de recuperação
        if (tPessoa == null)
            return new PessoaDTO(false, "Pessoa não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto recuperado
        return new PessoaDTO(true, "Pessoa lido com sucesso", tPessoa);
    }

    // Método para atualizar um Pessoa
    public static PessoaDTO atualizar(Pessoa pPessoa)
    {
        if (pPessoa == null)
            return new PessoaDTO(false, "Tentativa de atualizar um Pessoa nulo");

        // Chamando a camada de persistência
        PessoaDAO tDao = DaoFactory.getPessoaDAO();
        Pessoa tPessoa = tDao.update(pPessoa);

        // Verificando se houve erro de atualização
        if (tPessoa == null)
            return new PessoaDTO(false, "Pessoa não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto atualizado
        return new PessoaDTO(true, "Pessoa regravado com sucesso", tPessoa);
    }

    // Método para deletar um Pessoa
    public static PessoaDTO remover(String pEmail)
    {
        // Removendo o Pessoa e verificando se houve erro de remoção
        PessoaDAO tDao = DaoFactory.getPessoaDAO();
        if (! tDao.delete(pEmail))
            return new PessoaDTO(false, "Pessoa não existe no cadastro");

        // Retornando o indicativo de sucesso com o objeto removido
        return new PessoaDTO(true, "Pessoa removido com sucesso");
    }

    // Método para pesquisar todos os Pessoas
    public static PessoaDTO pesquisar()
    {
        // Obtendo a lista de Pessoas
        PessoaDAO tDao = DaoFactory.getPessoaDAO();
        List<Pessoa> tLista = tDao.search();

        // Verificando se a lista está vazia
        if (tLista.isEmpty())
            return new PessoaDTO(false, "Lista de Pessoas vazia");

        // Retornando a lista obtida
        return new PessoaDTO(true, "Lista de Pessoas recuperada", tLista);
    }

	public static PessoaDTO pesquisarPorEmail(String pEmail) {
        // Caso o email de pesquisa seja nulo, retorna a lista geral
        if (pEmail == null)
            return pesquisar();

        // Obtendo a lista de alunos
        PessoaDAO tDao = DaoFactory.getPessoaDAO();
        List<Pessoa> tLista = tDao.searchByEmail(pEmail);

        // Verificando se a lista está vazia
        if (tLista.isEmpty())
            return new PessoaDTO(false, "Nenhum registro encontrado com email '" + pEmail + "'");

        // Retornando a lista obtida
        return new PessoaDTO(true, "Lista de alunos recuperada", tLista);
    }
}
