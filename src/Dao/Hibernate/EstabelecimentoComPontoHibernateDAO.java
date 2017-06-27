
package Dao.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import Dao.EstabelecimentoComPontoDAO;
import Hibernate.ExceptionUtil;
import Hibernate.HibernateUtil;
import model.EstabelecimentoComPonto;



public class EstabelecimentoComPontoHibernateDAO implements EstabelecimentoComPontoDAO
{
    // Método para criar um EstabelecimentoComPonto na base de dados (INSERT)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.EstabelecimentoComPontoDAO#create(br.edu.opet.model.EstabelecimentoComPonto)
     */
    @Override
    public EstabelecimentoComPonto create(EstabelecimentoComPonto pEstabelecimentoComPonto)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // salvando o objeto via hibernate
            tSessao.save(pEstabelecimentoComPonto);
            tSessao.flush();

            // retornando o objeto atualizado
            return pEstabelecimentoComPonto;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de criação do EstabelecimentoComPonto");
        }

        return null;
    }

    // Método para recuperar um EstabelecimentoComPonto da base de dados (SELECT)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.EstabelecimentoComPontoDAO#recovery(int)
     */
    @Override
    public EstabelecimentoComPonto recovery(Integer pIdEstabelecimentoComPonto)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Recuperando o objeto via hibernate
            EstabelecimentoComPonto tEstabelecimentoComPonto = (EstabelecimentoComPonto) tSessao.get(EstabelecimentoComPonto.class, pIdEstabelecimentoComPonto);

            // Retornando o objeto lido
            return tEstabelecimentoComPonto;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da EstabelecimentoComPonto");
        }
        return null;
    }

    // Método para atualizar um EstabelecimentoComPonto na base de dados (UPDATE)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.EstabelecimentoComPontoDAO#update(br.edu.opet.model.EstabelecimentoComPonto)
     */
    @Override
    public EstabelecimentoComPonto update(EstabelecimentoComPonto pEstabelecimentoComPonto)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Ataulizando o objeto via hibernate
            tSessao.merge(pEstabelecimentoComPonto);
            tSessao.flush();

            // Retornando o objeto atualizado
            return pEstabelecimentoComPonto;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de atualização do EstabelecimentoComPonto");
        }
        return null;
    }

    // Método para deletar um EstabelecimentoComPonto na base de dados (DELETE)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.EstabelecimentoComPontoDAO#delete(int)
     */
    @Override
    public boolean delete(Integer pIdEstabelecimentoComPonto)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Removendo o objeto via hibernate
            tSessao.delete(tSessao.get(EstabelecimentoComPonto.class, pIdEstabelecimentoComPonto));
            tSessao.flush();

            // Retornando indicativo de sucesso
            return true;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de atualização do EstabelecimentoComPonto");
        }

        return false;
    }

    // Método para pesquisar todos os EstabelecimentoComPontos da base de dados
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.EstabelecimentoComPontoDAO#search()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<EstabelecimentoComPonto> search()
    {
        // Criando a tLista de EstabelecimentoComPontos vazia
        List<EstabelecimentoComPonto> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o objeto para pesquisa
            Query tQuery = tSessao.createQuery("FROM ESTABELECIMENTO_COM_PONTO");

            // Recuperando a lista via hibernate
            tLista = tQuery.list();

        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da lista de EstabelecimentoComPontos");
        }

        // Retornando a lista de EstabelecimentoComPontos
        return tLista;
    }

    

    @Override
    @SuppressWarnings("unchecked")
    public List<EstabelecimentoComPonto> searchByID(Integer pIdEstabelecimentoComPonto)
    {
       

        // Criando a tLista de EstabelecimentoComPontos vazia
        List<EstabelecimentoComPonto> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o critério para pesquisa
            Criteria tCriterio = tSessao.createCriteria(EstabelecimentoComPonto.class)
                                          .add(Restrictions.idEq(pIdEstabelecimentoComPonto)) ;

            // Recuperando a lista via hibernate
            tLista = tCriterio.list();
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da lista de EstabelecimentoComPontos");
        }

        // Retornando a lista de EstabelecimentoComPontos
        return tLista;
    }
}
