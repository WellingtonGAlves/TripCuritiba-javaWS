/**
 * 
 */
package Dao;


import java.util.List;

import model.Estabelecimento;

/**
 * @author wellclbo2
 *
 */
public interface EstabelecimentoDAO {// Método para criar um Estabelecimento na base de dados (INSERT)
    Estabelecimento create(Estabelecimento pEstabelecimento);

    // Método para recuperar uma Estabelecimento da base de dados (SELECT)
    Estabelecimento recovery(Integer pIdEstabelecimento);

    // Método para atualizar uma Estabelecimento na base de dados (UPDATE)
    Estabelecimento update(Estabelecimento pEstabelecimento);

    // Método para deletar uma Estabelecimento na base de dados (DELETE)
    boolean delete(Integer pIdEstabelecimento);

    // Método para pesquisar todos as Estabelecimentos da base de dados
    List<Estabelecimento> search();

    
    // Método para pesquisar por email todos as Estabelecimentos da base de dados
    List<Estabelecimento> searchByID(Integer pIdEstabelecimento);}
