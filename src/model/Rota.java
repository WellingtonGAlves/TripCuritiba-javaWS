package model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "ROTA")
public class Rota implements Comparable<Rota>{
	
	
	/**
	 * 
	 */
	
	/**
	 * Atributos da classe Rota
	 */
	private Integer idRota;
	//private Integer idPessoa;
	private String nome;
	private Integer status;
	private Date data;
	private Set<PontoTuristico> mPontoTuristicos;
	private Pessoa   mPessoa;
	// TODO - Ver no AVA Usuario Perfil sendo que a rota deve ser o woner da associacao (perfil no exemplo)
	
	
	
	/**
	 * Construtor Padrão da classe Rota
	 */
	public Rota() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the idRota

	 */
	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDROTA")
    @SequenceGenerator(name = "IDROTA", sequenceName = "IDROTA", allocationSize = 1)
    @Column(name="IDROTA")
	public Integer getIdRota() {
		return idRota;
	}



	/**
	 * @param idRota the idRota to set
	 */
	public void setIdRota(Integer idRota) {
		this.idRota = idRota;
	}



	


	



	



	/**
	 * @return the nome
	 */
	@Column(name = "NOME")
	public String getNome() {
		return nome;
	}



	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}



	/**
	 * @return the status
	 */
	@Column(name = "STATUS")
	public Integer getStatus() {
		return status;
	}



	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}



	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}



	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}


	@ManyToMany(cascade = CascadeType.DETACH)
	@JsonIgnore
	//@JsonBackReference(value="rota-ponto")
    @JoinTable(name = "ROTA_COM_PONTO",
               joinColumns = { @JoinColumn(name = "IDROTA_PONTO", nullable = false, updatable = false) },
               inverseJoinColumns = { @JoinColumn(name = "PONTO_IDPONTO_TURISTICO", nullable = false, updatable = false) })
    public Set<PontoTuristico> getmPontoTuristicos()
    {
        return mPontoTuristicos;
    }

    public void setmPontoTuristicos(Set<PontoTuristico> pPontoTuristicos)
    {
        mPontoTuristicos = pPontoTuristicos;
    }
	

    @ManyToOne()
    @JoinColumn(name = "IDPESSOA")// Nome da chave estrangeira na tabela
    @JsonBackReference(value="pessoa-rota")
    public Pessoa getPessoa()
    {
        return mPessoa;
    }
    
    public void setPessoa(Pessoa pPessoa)
    {
        mPessoa = pPessoa;
    }

	@Override
	public int compareTo(Rota arg0) {
		// TODO Auto-generated method stub
		return 0;
	}



	

}
