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
public interface GaleriaDAO {// M�todo para criar um Galeria na base de dados (INSERT)
    Galeria create(Galeria pGaleria);

    // M�todo para recuperar uma Galeria da base de dados (SELECT)
    Galeria recovery(Integer pIdGaleria);

    // M�todo para atualizar uma Galeria na base de dados (UPDATE)
    Galeria update(Galeria pGaleria);

    // M�todo para deletar uma Galeria na base de dados (DELETE)
    boolean delete(Integer pIdGaleria);

    // M�todo para pesquisar todos as Galerias da base de dados
    List<Galeria> search();

    
    // M�todo para pesquisar por email todos as Galerias da base de dados
    List<Galeria> searchByID(Integer pIdGaleria);}
