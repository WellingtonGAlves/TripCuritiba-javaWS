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
public interface EstabelecimentoComPontoDAO {// M�todo para criar um EstabelecimentoComPonto na base de dados (INSERT)
    EstabelecimentoComPonto create(EstabelecimentoComPonto pEstabelecimentoComPonto);

    // M�todo para recuperar uma EstabelecimentoComPonto da base de dados (SELECT)
    EstabelecimentoComPonto recovery(Integer pIdEstabelecimentoComPonto);

    // M�todo para atualizar uma EstabelecimentoComPonto na base de dados (UPDATE)
    EstabelecimentoComPonto update(EstabelecimentoComPonto pEstabelecimentoComPonto);

    // M�todo para deletar uma EstabelecimentoComPonto na base de dados (DELETE)
    boolean delete(Integer pIdEstabelecimentoComPonto);

    // M�todo para pesquisar todos as EstabelecimentoComPontos da base de dados
    List<EstabelecimentoComPonto> search();

    
    // M�todo para pesquisar por email todos as EstabelecimentoComPontos da base de dados
    List<EstabelecimentoComPonto> searchByID(Integer pIdEstabelecimentoComPonto);}
