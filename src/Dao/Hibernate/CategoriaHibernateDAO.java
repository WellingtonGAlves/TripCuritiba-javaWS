
package Dao.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import Dao.CategoriaDAO;
import Hibernate.ExceptionUtil;
import Hibernate.HibernateUtil;
import model.Categoria;



public class CategoriaHibernateDAO implements CategoriaDAO
{
    // M�todo para criar um Categoria na base de dados (INSERT)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.CategoriaDAO#create(br.edu.opet.model.Categoria)
     */
    @Override
    public Categoria create(Categoria pCategoria)
    {
        try
        {
            // Obtendo a sess�o hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // salvando o objeto via hibernate
            tSessao.save(pCategoria);
            tSessao.flush();

            // retornando o objeto atualizado
            return pCategoria;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no m�todo de cria��o do Categoria");
        }

        return null;
    }

    // M�todo para recuperar um Categoria da base de dados (SELECT)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.CategoriaDAO#recovery(int)
     */
    @Override
    public Categoria recovery(Integer pIdCategoria)
    {
        try
        {
            // Obtendo a sess�o hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Recuperando o objeto via hibernate
            Categoria tCategoria = (Categoria) tSessao.get(Categoria.class, pIdCategoria);

            // Retornando o objeto lido
            return tCategoria;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no m�todo de recupera��o da Categoria");
        }
        return null;
    }

    // M�todo para atualizar um Categoria na base de dados (UPDATE)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.CategoriaDAO#update(br.edu.opet.model.Categoria)
     */
    @Override
    public Categoria update(Categoria pCategoria)
    {
        try
        {
            // Obtendo a sess�o hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Ataulizando o objeto via hibernate
            tSessao.merge(pCategoria);
            tSessao.flush();

            // Retornando o objeto atualizado
            return pCategoria;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no m�todo de atualiza��o do Categoria");
        }
        return null;
    }

    // M�todo para deletar um Categoria na base de dados (DELETE)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.CategoriaDAO#delete(int)
     */
    @Override
    public boolean delete(Integer pIdCategoria)
    {
        try
        {
            // Obtendo a sess�o hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Removendo o objeto via hibernate
            tSessao.delete(tSessao.get(Categoria.class, pIdCategoria));
            tSessao.flush();

            // Retornando indicativo de sucesso
            return true;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no m�todo de atualiza��o do Categoria");
        }

        return false;
    }

    // M�todo para pesquisar todos os Categorias da base de dados
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.CategoriaDAO#search()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<Categoria> search()
    {
        // Criando a tLista de Categorias vazia
        List<Categoria> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sess�o hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o objeto para pesquisa
            Query tQuery = tSessao.createQuery("FROM CATEGORIA");

            // Recuperando a lista via hibernate
            tLista = tQuery.list();

        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no m�todo de recupera��o da lista de Categorias");
        }

        // Retornando a lista de Categorias
        return tLista;
    }

    

    @Override
    @SuppressWarnings("unchecked")
    public List<Categoria> searchByID(Integer pIdCategoria)
    {
       

        // Criando a tLista de Categorias vazia
        List<Categoria> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sess�o hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o crit�rio para pesquisa
            Criteria tCriterio = tSessao.createCriteria(Categoria.class)
                                          .add(Restrictions.idEq(pIdCategoria)) ;

            // Recuperando a lista via hibernate
            tLista = tCriterio.list();
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no m�todo de recupera��o da lista de Categorias");
        }

        // Retornando a lista de Categorias
        return tLista;
    }
}
