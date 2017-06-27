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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author wellclbo2
 *
 */
@Entity(name = "ESTABELECIMENTO")
public class Estabelecimento implements Serializable,Cloneable,Comparable<Estabelecimento>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6514536495520006818L;
	
	private Integer id_estabelecimento;
	private Integer categoria_idcategoria;
	private String nome;
	private String telefone;
	private String link_externo;
	private String informacoes_adicionais;
	private Categoria mCategoria;
	private Set<EstabelecimentoComPonto> mEstabelecimentoComPontos;
	
	 public Estabelecimento() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id_estabelecimento
	 */
	 @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDESTABELECIMENTO")
	    @SequenceGenerator(name = "IDESTABELECIMENTO", sequenceName = "IDESTABELECIMENTO", allocationSize = 1)
	    @Column(name="IDESTABELECIMENTO")
	public Integer getId_estabelecimento() {
		return id_estabelecimento;
	}

	/**
	 * @param id_estabelecimento the id_estabelecimento to set
	 */
	public void setId_estabelecimento(Integer id_estabelecimento) {
		this.id_estabelecimento = id_estabelecimento;
	}

	/**
	 

	

	/**
	 * @return the nome
	 */
	@Column(name="NOME")
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
	 * @return the telefone
	 */
	@Column(name="TELEFONE")
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the link_externo
	 */
	@Column(name="LINK_EXTERNO")
	public String getLink_externo() {
		return link_externo;
	}

	/**
	 * @param link_externo the link_externo to set
	 */
	public void setLink_externo(String link_externo) {
		this.link_externo = link_externo;
	}

	/**
	 * @return the informacoes_adicionais
	 */
	@Column(name="INFORMACOES_ADICIONAIS")
	public String getInformacoes_adicionais() {
		return informacoes_adicionais;
	}

	/**
	 * @param informacoes_adicionais the informacoes_adicionais to set
	 */
	public void setInformacoes_adicionais(String informacoes_adicionais) {
		this.informacoes_adicionais = informacoes_adicionais;
	}

	
	@ManyToOne()
    @JoinColumn(name = "CATEGORIA_IDCATEGORIA")// Nome da chave estrangeira na tabela
    @JsonBackReference
	public Categoria getCategoria()
    {
        return mCategoria;
    }

    public void setCategoria(Categoria pCategoria)
    {
        mCategoria= pCategoria;
    }
    
    
    @OneToMany(mappedBy = "estabelecimento", cascade=CascadeType.ALL)// Nome do atributo da outra classe
    @JsonManagedReference
    public Set<EstabelecimentoComPonto> getEstabelecimentoComPontos()
    {
        return mEstabelecimentoComPontos == null ? new HashSet<>() : mEstabelecimentoComPontos;
    }

    public void setEstabelecimentoComPontos(Set<EstabelecimentoComPonto> pEstabelecimentoComPontos)
    {
        mEstabelecimentoComPontos = pEstabelecimentoComPontos;
    }
	

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Estabelecimento [id_estabelecimento=" + id_estabelecimento + ", categoria_idcategoria="
				+ categoria_idcategoria + ", nome=" + nome + ", telefone=" + telefone + ", link_externo=" + link_externo
				+ ", informacoes_adicionais=" + informacoes_adicionais + ", mCategoria=" + mCategoria
				+ ", mEstabelecimentoComPontos=" + mEstabelecimentoComPontos + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria_idcategoria == null) ? 0 : categoria_idcategoria.hashCode());
		result = prime * result + ((id_estabelecimento == null) ? 0 : id_estabelecimento.hashCode());
		result = prime * result + ((informacoes_adicionais == null) ? 0 : informacoes_adicionais.hashCode());
		result = prime * result + ((link_externo == null) ? 0 : link_externo.hashCode());
		result = prime * result + ((mCategoria == null) ? 0 : mCategoria.hashCode());
		result = prime * result + ((mEstabelecimentoComPontos == null) ? 0 : mEstabelecimentoComPontos.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estabelecimento other = (Estabelecimento) obj;
		if (categoria_idcategoria == null) {
			if (other.categoria_idcategoria != null)
				return false;
		} else if (!categoria_idcategoria.equals(other.categoria_idcategoria))
			return false;
		if (id_estabelecimento == null) {
			if (other.id_estabelecimento != null)
				return false;
		} else if (!id_estabelecimento.equals(other.id_estabelecimento))
			return false;
		if (informacoes_adicionais == null) {
			if (other.informacoes_adicionais != null)
				return false;
		} else if (!informacoes_adicionais.equals(other.informacoes_adicionais))
			return false;
		if (link_externo == null) {
			if (other.link_externo != null)
				return false;
		} else if (!link_externo.equals(other.link_externo))
			return false;
		if (mCategoria == null) {
			if (other.mCategoria != null)
				return false;
		} else if (!mCategoria.equals(other.mCategoria))
			return false;
		if (mEstabelecimentoComPontos == null) {
			if (other.mEstabelecimentoComPontos != null)
				return false;
		} else if (!mEstabelecimentoComPontos.equals(other.mEstabelecimentoComPontos))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

	@Override
	public int compareTo(Estabelecimento o) {
		// TODO Auto-generated method stub
		return 0;
	}
	 
}
