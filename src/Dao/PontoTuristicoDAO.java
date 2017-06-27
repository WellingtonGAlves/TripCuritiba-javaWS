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
public interface PontoTuristicoDAO {// Método para criar um PontoTuristico na base de dados (INSERT)
    PontoTuristico create(PontoTuristico pPontoTuristico);

    // Método para recuperar uma PontoTuristico da base de dados (SELECT)
    PontoTuristico recovery(Integer idPonto);

    // Método para atualizar uma PontoTuristico na base de dados (UPDATE)
    PontoTuristico update(PontoTuristico pPontoTuristico);

    // Método para deletar uma PontoTuristico na base de dados (DELETE)
    boolean delete(Integer idPonto);

    // Método para pesquisar todos as PontoTuristicos da base de dados
    List<PontoTuristico> search();

    
    // Método para pesquisar por email todos as PontoTuristicos da base de dados
    List<PontoTuristico> searchByID(Integer idPonto);}
