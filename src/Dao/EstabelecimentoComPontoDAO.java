/**
 * 
 */
package Dao;


import java.util.List;

import model.EstabelecimentoComPonto;

/**
 * @author wellclbo2
 *
 */
public interface EstabelecimentoComPontoDAO {// Método para criar um EstabelecimentoComPonto na base de dados (INSERT)
    EstabelecimentoComPonto create(EstabelecimentoComPonto pEstabelecimentoComPonto);

    // Método para recuperar uma EstabelecimentoComPonto da base de dados (SELECT)
    EstabelecimentoComPonto recovery(Integer pIdEstabelecimentoComPonto);

    // Método para atualizar uma EstabelecimentoComPonto na base de dados (UPDATE)
    EstabelecimentoComPonto update(EstabelecimentoComPonto pEstabelecimentoComPonto);

    // Método para deletar uma EstabelecimentoComPonto na base de dados (DELETE)
    boolean delete(Integer pIdEstabelecimentoComPonto);

    // Método para pesquisar todos as EstabelecimentoComPontos da base de dados
    List<EstabelecimentoComPonto> search();

    
    // Método para pesquisar por email todos as EstabelecimentoComPontos da base de dados
    List<EstabelecimentoComPonto> searchByID(Integer pIdEstabelecimentoComPonto);}
