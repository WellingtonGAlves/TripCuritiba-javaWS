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
public interface CategoriaDAO {// Método para criar um Categoria na base de dados (INSERT)
    Categoria create(Categoria pCategoria);

    // Método para recuperar uma Categoria da base de dados (SELECT)
    Categoria recovery(Integer pIdCategoria);

    // Método para atualizar uma Categoria na base de dados (UPDATE)
    Categoria update(Categoria pCategoria);

    // Método para deletar uma Categoria na base de dados (DELETE)
    boolean delete(Integer pIdCategoria);

    // Método para pesquisar todos as Categorias da base de dados
    List<Categoria> search();

    
    // Método para pesquisar por email todos as Categorias da base de dados
    List<Categoria> searchByID(Integer pIdCategoria);}
