
package Dao.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import Dao.EstabelecimentoDAO;
import Hibernate.ExceptionUtil;
import Hibernate.HibernateUtil;
import model.Estabelecimento;



public class EstabelecimentoHibernateDAO implements EstabelecimentoDAO
{
    // M�todo para criar um Estabelecimento na base de dados (INSERT)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.EstabelecimentoDAO#create(br.edu.opet.model.Estabelecimento)
     */
    @Override
    public Estabelecimento create(Estabelecimento pEstabelecimento)
    {
        try
        {
            // Obtendo a sess�o hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // salvando o objeto via hibernate
            tSessao.save(pEstabelecimento);
            tSessao.flush();

            // retornando o objeto atualizado
            return pEstabelecimento;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no m�todo de cria��o do Estabelecimento");
        }

        return null;
    }

    // M�todo para recuperar um Estabelecimento da base de dados (SELECT)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.EstabelecimentoDAO#recovery(int)
     */
    @Override
    public Estabelecimento recovery(Integer pIdEstabelecimento)
    {
        try
        {
            // Obtendo a sess�o hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Recuperando o objeto via hibernate
            Estabelecimento tEstabelecimento = (Estabelecimento) tSessao.get(Estabelecimento.class, pIdEstabelecimento);

            // Retornando o objeto lido
            return tEstabelecimento;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no m�todo de recupera��o da Estabelecimento");
        }
        return null;
    }

    // M�todo para atualizar um Estabelecimento na base de dados (UPDATE)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.EstabelecimentoDAO#update(br.edu.opet.model.Estabelecimento)
     */
    @Override
    public Estabelecimento update(Estabelecimento pEstabelecimento)
    {
        try
        {
            // Obtendo a sess�o hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Ataulizando o objeto via hibernate
            tSessao.merge(pEstabelecimento);
            tSessao.flush();

            // Retornando o objeto atualizado
            return pEstabelecimento;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no m�todo de atualiza��o do Estabelecimento");
        }
        return null;
    }

    // M�todo para deletar um Estabelecimento na base de dados (DELETE)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.EstabelecimentoDAO#delete(int)
     */
    @Override
    public boolean delete(Integer pIdEstabelecimento)
    {
        try
        {
            // Obtendo a sess�o hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Removendo o objeto via hibernate
            tSessao.delete(tSessao.get(Estabelecimento.class, pIdEstabelecimento));
            tSessao.flush();

            // Retornando indicativo de sucesso
            return true;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no m�todo de atualiza��o do Estabelecimento");
        }

        return false;
    }

    // M�todo para pesquisar todos os Estabelecimentos da base de dados
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.EstabelecimentoDAO#search()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<Estabelecimento> search()
    {
        // Criando a tLista de Estabelecimentos vazia
        List<Estabelecimento> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sess�o hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o objeto para pesquisa
            Query tQuery = tSessao.createQuery("FROM ESTABELECIMENTO");

            // Recuperando a lista via hibernate
            tLista = tQuery.list();

        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no m�todo de recupera��o da lista de Estabelecimentos");
        }

        // Retornando a lista de Estabelecimentos
        return tLista;
    }

    

    @Override
    @SuppressWarnings("unchecked")
    public List<Estabelecimento> searchByID(Integer pIdEstabelecimento)
    {
       

        // Criando a tLista de Estabelecimentos vazia
        List<Estabelecimento> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sess�o hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o crit�rio para pesquisa
            Criteria tCriterio = tSessao.createCriteria(Estabelecimento.class)
                                          .add(Restrictions.idEq(pIdEstabelecimento)) ;

            // Recuperando a lista via hibernate
            tLista = tCriterio.list();
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no m�todo de recupera��o da lista de Estabelecimentos");
        }

        // Retornando a lista de Estabelecimentos
        return tLista;
    }
}
