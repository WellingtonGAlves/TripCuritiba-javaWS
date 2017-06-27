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
public interface PessoaDAO {// Método para criar um Pessoa na base de dados (INSERT)
    Pessoa create(Pessoa pPessoa);

    // Método para recuperar uma Pessoa da base de dados (SELECT)
    Pessoa recovery(String pEmail);

    // Método para atualizar uma Pessoa na base de dados (UPDATE)
    Pessoa update(Pessoa pPessoa);

    // Método para deletar uma Pessoa na base de dados (DELETE)
    boolean delete(String pEmail);

    // Método para pesquisar todos as Pessoas da base de dados
    List<Pessoa> search();

    
    // Método para pesquisar por email todos as Pessoas da base de dados
    List<Pessoa> searchByEmail(String pEmail);}
