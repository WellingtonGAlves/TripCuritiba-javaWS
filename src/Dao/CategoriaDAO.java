/**
 * 
 */
package Dao;


import java.util.List;

import model.Categoria;

/**
 * @author wellclbo2
 *
 */
public interface CategoriaDAO {// M�todo para criar um Categoria na base de dados (INSERT)
    Categoria create(Categoria pCategoria);

    // M�todo para recuperar uma Categoria da base de dados (SELECT)
    Categoria recovery(Integer pIdCategoria);

    // M�todo para atualizar uma Categoria na base de dados (UPDATE)
    Categoria update(Categoria pCategoria);

    // M�todo para deletar uma Categoria na base de dados (DELETE)
    boolean delete(Integer pIdCategoria);

    // M�todo para pesquisar todos as Categorias da base de dados
    List<Categoria> search();

    
    // M�todo para pesquisar por email todos as Categorias da base de dados
    List<Categoria> searchByID(Integer pIdCategoria);}
