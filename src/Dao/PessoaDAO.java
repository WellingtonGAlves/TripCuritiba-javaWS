/**
 * 
 */
package Dao;


import java.util.List;

import model.Pessoa;

/**
 * @author wellclbo2
 *
 */
public interface PessoaDAO {// M�todo para criar um Pessoa na base de dados (INSERT)
    Pessoa create(Pessoa pPessoa);

    // M�todo para recuperar uma Pessoa da base de dados (SELECT)
    Pessoa recovery(String pEmail);

    // M�todo para atualizar uma Pessoa na base de dados (UPDATE)
    Pessoa update(Pessoa pPessoa);

    // M�todo para deletar uma Pessoa na base de dados (DELETE)
    boolean delete(String pEmail);

    // M�todo para pesquisar todos as Pessoas da base de dados
    List<Pessoa> search();

    
    // M�todo para pesquisar por email todos as Pessoas da base de dados
    List<Pessoa> searchByEmail(String pEmail);}
