
package Dao.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import Dao.RotaDAO;
import Hibernate.ExceptionUtil;
import Hibernate.HibernateUtil;
import model.Rota;



public class RotaHibernateDAO implements RotaDAO
{
    // Método para criar um Rota na base de dados (INSERT)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.RotaDAO#create(br.edu.opet.model.Rota)
     */
    @Override
    public Rota create(Rota pRota)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // salvando o objeto via hibernate
            tSessao.save(pRota);
            tSessao.flush();

            // retornando o objeto atualizado
            return pRota;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de criação do Rota");
        }

        return null;
    }

    // Método para recuperar um Rota da base de dados (SELECT)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.RotaDAO#recovery(int)
     */
    @Override
    public Rota recovery(Integer pIdRota)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Recuperando o objeto via hibernate
            Rota tRota = (Rota) tSessao.get(Rota.class, pIdRota);

            // Retornando o objeto lido
            return tRota;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da Rota");
        }
        return null;
    }

    // Método para atualizar um Rota na base de dados (UPDATE)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.RotaDAO#update(br.edu.opet.model.Rota)
     */
    @Override
    public Rota update(Rota pRota)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Ataulizando o objeto via hibernate
            tSessao.merge(pRota);
            tSessao.flush();

            // Retornando o objeto atualizado
            return pRota;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de atualização do Rota");
        }
        return null;
    }

    // Método para deletar um Rota na base de dados (DELETE)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.RotaDAO#delete(int)
     */
    @Override
    public boolean delete(Integer pIdRota)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Removendo o objeto via hibernate
            tSessao.delete(tSessao.get(Rota.class, pIdRota));
            tSessao.flush();

            // Retornando indicativo de sucesso
            return true;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de atualização do Rota");
        }

        return false;
    }

    // Método para pesquisar todos os Rotas da base de dados
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.RotaDAO#search()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<Rota> search()
    {
        // Criando a tLista de Rotas vazia
        List<Rota> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o objeto para pesquisa
            Query tQuery = tSessao.createQuery("FROM ROTA");

            // Recuperando a lista via hibernate
            tLista = tQuery.list();

        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da lista de Rotas");
        }

        // Retornando a lista de Rotas
        return tLista;
    }

    

    @Override
    @SuppressWarnings("unchecked")
    public List<Rota> searchByID(Integer pIdRota)
    {
       

        // Criando a tLista de Rotas vazia
        List<Rota> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o critério para pesquisa
            Criteria tCriterio = tSessao.createCriteria(Rota.class)
                                          .add(Restrictions.idEq(pIdRota)) ;

            // Recuperando a lista via hibernate
            tLista = tCriterio.list();
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da lista de Rotas");
        }

        // Retornando a lista de Rotas
        return tLista;
    }
}
