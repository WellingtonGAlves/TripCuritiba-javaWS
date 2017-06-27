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
@Entity(name = "CATEGORIA")
public class Categoria implements Serializable,Cloneable,Comparable<Categoria> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7152385481390853679L;
	private Integer id_categoria;
	private String nome_categoria;
	private Set<Estabelecimento> mEstabelecimentos;
	
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the id_categoria
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDCATEGORIA")
    @SequenceGenerator(name = "IDCATEGORIA", sequenceName = "IDCATEGORIA", allocationSize = 1)
    @Column(name="IDCATEGORIA")
	public Integer getId_categoria() {
		return id_categoria;
	}



	/**
	 * @param id_categoria the id_categoria to set
	 */
	public void setId_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
	}



	/**
	 * @return the nome_categoria
	 */
    @Column(name="NOME_CATEGORIA")
	public String getNome_categoria() {
		return nome_categoria;
	}



	/**
	 * @param nome_categoria the nome_categoria to set
	 */
	public void setNome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}

	@OneToMany(mappedBy = "categoria", cascade=CascadeType.ALL)// Nome do atributo da outra classe
    @JsonManagedReference
	public Set<Estabelecimento> getEstabelecimentos()
    {
        return mEstabelecimentos == null ? new HashSet<>() : mEstabelecimentos;
    }

    public void setEstabelecimentos(Set<Estabelecimento> pEstabelecimentos)
    {
    	mEstabelecimentos = pEstabelecimentos;
    }

	



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", nome_categoria=" + nome_categoria + ", mEstabelecimentos="
				+ mEstabelecimentos + "]";
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_categoria == null) ? 0 : id_categoria.hashCode());
		result = prime * result + ((mEstabelecimentos == null) ? 0 : mEstabelecimentos.hashCode());
		result = prime * result + ((nome_categoria == null) ? 0 : nome_categoria.hashCode());
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
		Categoria other = (Categoria) obj;
		if (id_categoria == null) {
			if (other.id_categoria != null)
				return false;
		} else if (!id_categoria.equals(other.id_categoria))
			return false;
		if (mEstabelecimentos == null) {
			if (other.mEstabelecimentos != null)
				return false;
		} else if (!mEstabelecimentos.equals(other.mEstabelecimentos))
			return false;
		if (nome_categoria == null) {
			if (other.nome_categoria != null)
				return false;
		} else if (!nome_categoria.equals(other.nome_categoria))
			return false;
		return true;
	}



	@Override
	public int compareTo(Categoria o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
