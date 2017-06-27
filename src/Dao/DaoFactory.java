package Dao;

import Dao.Hibernate.CategoriaHibernateDAO;
import Dao.Hibernate.EstabelecimentoComPontoHibernateDAO;
import Dao.Hibernate.EstabelecimentoHibernateDAO;
import Dao.Hibernate.GaleriaHibernateDAO;
import Dao.Hibernate.PessoaHibernateDAO;

import Dao.Hibernate.PontoTuristicoHibernateDAO;
import Dao.Hibernate.RotaHibernateDAO;


public class DaoFactory
{
    public static PessoaDAO getPessoaDAO()
    {
        return new PessoaHibernateDAO();
    }

	public static RotaDAO getRotaDAO() {
		// TODO Auto-generated method stub
		return new RotaHibernateDAO();
	}

	public static PontoTuristicoDAO getPontoTuristicoDAO() {
		// TODO Auto-generated method stub
		return new PontoTuristicoHibernateDAO();
	}

	public static GaleriaDAO getGaleriaDAO() {
		// TODO Auto-generated method stub
		return new GaleriaHibernateDAO(); 
	}

	public static EstabelecimentoDAO getEstabelecimentoDAO() {
		// TODO Auto-generated method stub
		return new EstabelecimentoHibernateDAO(); 
	}

	public static CategoriaDAO getCategoriaDAO() {
		// TODO Auto-generated method stub
		return new CategoriaHibernateDAO(); 
		}

	public static EstabelecimentoComPontoDAO getEstabelecimentoComPontoDAO() {
		// TODO Auto-generated method stub
		return new EstabelecimentoComPontoHibernateDAO(); 

	}

    
}
