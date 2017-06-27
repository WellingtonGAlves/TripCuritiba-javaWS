
package Dao.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import Dao.PessoaDAO;
import Hibernate.ExceptionUtil;
import Hibernate.HibernateUtil;
import model.Pessoa;



public class PessoaHibernateDAO implements PessoaDAO
{
    // Método para criar um Pessoa na base de dados (INSERT)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.PessoaDAO#create(br.edu.opet.model.Pessoa)
     */
    @Override
    public Pessoa create(Pessoa pPessoa)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // salvando o objeto via hibernate
            tSessao.save(pPessoa);
            tSessao.flush();

            // retornando o objeto atualizado
            return pPessoa;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de criação do Pessoa");
        }

        return null;
    }

    // Método para recuperar um Pessoa da base de dados (SELECT)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.PessoaDAO#recovery(int)
     */
    @Override
    public Pessoa recovery(String pEmail)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Recuperando o objeto via hibernate
            Pessoa tPessoa = (Pessoa) tSessao.get(Pessoa.class, pEmail);

            // Retornando o objeto lido
            return tPessoa;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da Pessoa");
        }
        return null;
    }

    // Método para atualizar um Pessoa na base de dados (UPDATE)
    /*
     * (non-Javadoc)
     *
     * @see
     * br.edu.opet.dao.jdbc.PessoaDAO#update(br.edu.opet.model.Pessoa)
     */
    @Override
    public Pessoa update(Pessoa pPessoa)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Ataulizando o objeto via hibernate
            tSessao.merge(pPessoa);
            tSessao.flush();

            // Retornando o objeto atualizado
            return pPessoa;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de atualização do Pessoa");
        }
        return null;
    }

    // Método para deletar um Pessoa na base de dados (DELETE)
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.PessoaDAO#delete(int)
     */
    @Override
    public boolean delete(String pEmail)
    {
        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();
            int idPessoa = Integer.parseInt(pEmail);
            // Removendo o objeto via hibernate
            tSessao.delete(tSessao.get(Pessoa.class, idPessoa));
            tSessao.flush();

            // Retornando indicativo de sucesso
            return true;
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de atualização do Pessoa");
        }

        return false;
    }

    // Método para pesquisar todos os Pessoas da base de dados
    /*
     * (non-Javadoc)
     *
     * @see br.edu.opet.dao.jdbc.PessoaDAO#search()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<Pessoa> search()
    {
        // Criando a tLista de Pessoas vazia
        List<Pessoa> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o objeto para pesquisa
            Query tQuery = tSessao.createQuery("FROM PESSOA");

            // Recuperando a lista via hibernate
            tLista = tQuery.list();

        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da lista de Pessoas");
        }

        // Retornando a lista de Pessoas
        return tLista;
    }

    

    @Override
    @SuppressWarnings("unchecked")
    public List<Pessoa> searchByEmail(String pEmail)
    {
        // Acertando o critério de pesquisa
        String tEmailPesquisa = "%" + pEmail + "%";

        // Criando a tLista de Pessoas vazia
        List<Pessoa> tLista = new ArrayList<>();

        try
        {
            // Obtendo a sessão hibernate
            SessionFactory tFactory = HibernateUtil.getSessionFactory();
            Session tSessao = tFactory.getCurrentSession();

            // Criando o critério para pesquisa
            Criteria tCriterio = tSessao.createCriteria(Pessoa.class)
                                          .add(Restrictions.like("email", tEmailPesquisa).ignoreCase());

            // Recuperando a lista via hibernate
            tLista = tCriterio.list();
        }
        catch (HibernateException tExcept)
        {
            ExceptionUtil.mostrarErro(tExcept, "Erro no método de recuperação da lista de Pessoas");
        }

        // Retornando a lista de Pessoas
        return tLista;
    }
}
