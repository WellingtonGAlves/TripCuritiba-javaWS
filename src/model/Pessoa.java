/**
 * 
 */
package model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author wellclbo2
 *
 */
@Entity(name = "PESSOA")
public class Pessoa implements Serializable,Cloneable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3796799144560430687L;
	/**
	 * Atributos  de Pessoa
	 */
	
	private int idPessoa;
	private String nome;
	private String email;
	private Set<Rota> mRotas;
	
	
	

	/**
	 * Construtor padrao de Pessoa
	 */
	
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @return the idPessoa

	 */
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDPESSOA")
    @SequenceGenerator(name = "IDPESSOA", sequenceName = "IDPESSOA", allocationSize = 1)
    @Column(name="IDPESSOA")
	public Integer getIdPessoa() {
		return idPessoa;
	}


	/**
	 * @param idPessoa the idPessoa to set
	 */
	
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	@Column(name="NOME")
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}


	/**
	 * @return the email
	 */
	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email.toUpperCase();
	}
	
	@OneToMany(mappedBy = "pessoa", cascade=CascadeType.ALL)// Nome do atributo da outra classe
	@JsonManagedReference(value="pessoa-rota")
	public Set<Rota> getRotas()
    {
        return mRotas == null ? new HashSet<>() : mRotas;
    }

    public void setRotas(Set<Rota> pRotas)
    {
    	mRotas = pRotas;
    }
}
