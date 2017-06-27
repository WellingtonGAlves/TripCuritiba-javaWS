
package Dao.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import Dao.GaleriaDAO;
import Hibernate.ExceptionUtil;
import Hibernate.HibernateUtil;
import model.Galeria;



public class GaleriaHibernateDAO implements GaleriaDAO
{
    // Método para criar um Galeria na base de dados (INSERT)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.GaleriaDAO#create(br.edu.opet.model.Galeria)
     */
    @Override
    public Galeria create(Galeria pGaleria)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // salvando o objeto via hibernate
            tSessao.save(pGaleria);
            tSessao.flush();

            // retornando o objeto atualizado
            return pGaleria;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de criação do Galeria");
        }

        return null;
    }

    // Método para recuperar um Galeria da base de dados (SELECT)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.GaleriaDAO#recovery(int)
     */
    @Override
    public Galeria recovery(Integer pIdGaleria)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Recuperando o objeto via hibernate
            Galeria tGaleria = (Galeria) tSessao.get(Galeria.class, pIdGaleria);

            // Retornando o objeto lido
            return tGaleria;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da Galeria");
        }
        return null;
    }

    // Método para atualizar um Galeria na base de dados (UPDATE)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.GaleriaDAO#update(br.edu.opet.model.Galeria)
     */
    @Override
    public Galeria update(Galeria pGaleria)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Ataulizando o objeto via hibernate
            tSessao.merge(pGaleria);
            tSessao.flush();

            // Retornando o objeto atualizado
            return pGaleria;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de atualização do Galeria");
        }
        return null;
    }

    // Método para deletar um Galeria na base de dados (DELETE)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.GaleriaDAO#delete(int)
     */
    @Override
    public boolean delete(Integer pIdGaleria)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Removendo o objeto via hibernate
            tSessao.delete(tSessao.get(Galeria.class, pIdGaleria));
            tSessao.flush();

            // Retornando indicativo de sucesso
            return true;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de atualização do Galeria");
        }

        return false;
    }

    // Método para pesquisar todos os Galerias da base de dados
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.GaleriaDAO#search()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<Galeria> search()
    {
        // Criando a tLista de Galerias vazia
        List<Galeria> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o objeto para pesquisa
            Query tQuery = tSessao.createQuery("FROM GALERIA");

            // Recuperando a lista via hibernate
            tLista = tQuery.list();

        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da lista de Galerias");
        }

        // Retornando a lista de Galerias
        return tLista;
    }

    

    @Override
    @SuppressWarnings("unchecked")
    public List<Galeria> searchByID(Integer pIdGaleria)
    {
       

        // Criando a tLista de Galerias vazia
        List<Galeria> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o critério para pesquisa
            Criteria tCriterio = tSessao.createCriteria(Galeria.class)
                                          .add(Restrictions.idEq(pIdGaleria)) ;

            // Recuperando a lista via hibernate
            tLista = tCriterio.list();
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da lista de Galerias");
        }

        // Retornando a lista de Galerias
        return tLista;
    }
}
