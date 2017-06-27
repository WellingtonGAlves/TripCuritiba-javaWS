/**
 * 
 */
package Dao;


import java.util.List;

import model.Rota;

/**
 * @author wellclbo2
 *
 */
public interface RotaDAO {// M�todo para criar um Rota na base de dados (INSERT)
    Rota create(Rota pRota);

    // M�todo para recuperar uma Rota da base de dados (SELECT)
    Rota recovery(Integer pIdRota);

    // M�todo para atualizar uma Rota na base de dados (UPDATE)
    Rota update(Rota pRota);

    // M�todo para deletar uma Rota na base de dados (DELETE)
    boolean delete(Integer pIdRota);

    // M�todo para pesquisar todos as Rotas da base de dados
    List<Rota> search();

    
    // M�todo para pesquisar por email todos as Rotas da base de dados
    List<Rota> searchByID(Integer pIdRota);}
