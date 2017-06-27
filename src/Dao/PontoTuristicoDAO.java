/**
 * 
 */
package Dao;


import java.util.List;

import model.PontoTuristico;

/**
 * @author wellclbo2
 *
 */
public interface PontoTuristicoDAO {// M�todo para criar um PontoTuristico na base de dados (INSERT)
    PontoTuristico create(PontoTuristico pPontoTuristico);

    // M�todo para recuperar uma PontoTuristico da base de dados (SELECT)
    PontoTuristico recovery(Integer idPonto);

    // M�todo para atualizar uma PontoTuristico na base de dados (UPDATE)
    PontoTuristico update(PontoTuristico pPontoTuristico);

    // M�todo para deletar uma PontoTuristico na base de dados (DELETE)
    boolean delete(Integer idPonto);

    // M�todo para pesquisar todos as PontoTuristicos da base de dados
    List<PontoTuristico> search();

    
    // M�todo para pesquisar por email todos as PontoTuristicos da base de dados
    List<PontoTuristico> searchByID(Integer idPonto);}
