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
public interface RotaDAO {// Método para criar um Rota na base de dados (INSERT)
    Rota create(Rota pRota);

    // Método para recuperar uma Rota da base de dados (SELECT)
    Rota recovery(Integer pIdRota);

    // Método para atualizar uma Rota na base de dados (UPDATE)
    Rota update(Rota pRota);

    // Método para deletar uma Rota na base de dados (DELETE)
    boolean delete(Integer pIdRota);

    // Método para pesquisar todos as Rotas da base de dados
    List<Rota> search();

    
    // Método para pesquisar por email todos as Rotas da base de dados
    List<Rota> searchByID(Integer pIdRota);}
