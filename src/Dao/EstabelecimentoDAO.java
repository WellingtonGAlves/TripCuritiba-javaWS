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
public interface EstabelecimentoDAO {// M�todo para criar um Estabelecimento na base de dados (INSERT)
    Estabelecimento create(Estabelecimento pEstabelecimento);

    // M�todo para recuperar uma Estabelecimento da base de dados (SELECT)
    Estabelecimento recovery(Integer pIdEstabelecimento);

    // M�todo para atualizar uma Estabelecimento na base de dados (UPDATE)
    Estabelecimento update(Estabelecimento pEstabelecimento);

    // M�todo para deletar uma Estabelecimento na base de dados (DELETE)
    boolean delete(Integer pIdEstabelecimento);

    // M�todo para pesquisar todos as Estabelecimentos da base de dados
    List<Estabelecimento> search();

    
    // M�todo para pesquisar por email todos as Estabelecimentos da base de dados
    List<Estabelecimento> searchByID(Integer pIdEstabelecimento);}
