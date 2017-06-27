
package Dao.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import Dao.PontoTuristicoDAO;
import Hibernate.ExceptionUtil;
import Hibernate.HibernateUtil;
import model.PontoTuristico;



public class PontoTuristicoHibernateDAO implements PontoTuristicoDAO
{
    // Método para criar um PontoTuristico na base de dados (INSERT)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.PontoTuristicoDAO#create(br.edu.opet.model.PontoTuristico)
     */
    @Override
    public PontoTuristico create(PontoTuristico pPontoTuristico)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // salvando o objeto via hibernate
            tSessao.save(pPontoTuristico);
            tSessao.flush();

            // retornando o objeto atualizado
            return pPontoTuristico;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de criação do PontoTuristico");
        }

        return null;
    }

    // Método para recuperar um PontoTuristico da base de dados (SELECT)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.PontoTuristicoDAO#recovery(int)
     */
    @Override
    public PontoTuristico recovery(Integer pIdPonto)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Recuperando o objeto via hibernate
            PontoTuristico tPontoTuristico = (PontoTuristico) tSessao.get(PontoTuristico.class, pIdPonto);

            // Retornando o objeto lido
            return tPontoTuristico;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da PontoTuristico");
        }
        return null;
    }

    // Método para atualizar um PontoTuristico na base de dados (UPDATE)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.PontoTuristicoDAO#update(br.edu.opet.model.PontoTuristico)
     */
    @Override
    public PontoTuristico update(PontoTuristico pPontoTuristico)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Ataulizando o objeto via hibernate
            tSessao.merge(pPontoTuristico);
            tSessao.flush();

            // Retornando o objeto atualizado
            return pPontoTuristico;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de atualização do PontoTuristico");
        }
        return null;
    }

    // Método para deletar um PontoTuristico na base de dados (DELETE)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.PontoTuristicoDAO#delete(int)
     */
    @Override
    public boolean delete(Integer pIdPonto)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Removendo o objeto via hibernate
            tSessao.delete(tSessao.get(PontoTuristico.class, pIdPonto));
            tSessao.flush();

            // Retornando indicativo de sucesso
            return true;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de atualização do PontoTuristico");
        }

        return false;
    }

    // Método para pesquisar todos os PontoTuristicos da base de dados
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.PontoTuristicoDAO#search()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<PontoTuristico> search()
    {
        // Criando a tLista de PontoTuristicos vazia
        List<PontoTuristico> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o objeto para pesquisa
            Query tQuery = tSessao.createQuery("FROM PONTO_TURISTICO");

            // Recuperando a lista via hibernate
            tLista = tQuery.list();

        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da lista de PontoTuristicos");
        }

        // Retornando a lista de PontoTuristicos
        return tLista;
    }

    

    @Override
    @SuppressWarnings("unchecked")
    public List<PontoTuristico> searchByID(Integer pIdPonto)
    {
        
        // Criando a tLista de PontoTuristicos vazia
        List<PontoTuristico> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o critério para pesquisa
            Criteria tCriterio = tSessao.createCriteria(PontoTuristico.class)
                                          .add(Restrictions.idEq(pIdPonto));

            // Recuperando a lista via hibernate
            tLista = tCriterio.list();
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da lista de PontoTuristicos");
        }

        // Retornando a lista de PontoTuristicos
        return tLista;
    }
}
