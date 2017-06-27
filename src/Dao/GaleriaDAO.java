/**
 * 
 */
package Dao;


import java.util.List;

import model.Galeria;

/**
 * @author wellclbo2
 *
 */
public interface GaleriaDAO {// Método para criar um Galeria na base de dados (INSERT)
    Galeria create(Galeria pGaleria);

    // Método para recuperar uma Galeria da base de dados (SELECT)
    Galeria recovery(Integer pIdGaleria);

    // Método para atualizar uma Galeria na base de dados (UPDATE)
    Galeria update(Galeria pGaleria);

    // Método para deletar uma Galeria na base de dados (DELETE)
    boolean delete(Integer pIdGaleria);

    // Método para pesquisar todos as Galerias da base de dados
    List<Galeria> search();

    
    // Método para pesquisar por email todos as Galerias da base de dados
    List<Galeria> searchByID(Integer pIdGaleria);}
