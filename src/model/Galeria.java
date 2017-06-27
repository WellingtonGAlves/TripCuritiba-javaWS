/**
 * 
 */
package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author wellclbo2
 *
 */
@Entity(name = "GALERIA")
public class Galeria implements Serializable,Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8006435382156003745L;

	
	private Integer id_galeria;
	private String nome_imagem;
	private String autor;
	private String descricao;
	
	
	public Galeria() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the id_galeria
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDGALERIA")
    @SequenceGenerator(name = "IDGALERIA", sequenceName = "IDGALERIA", allocationSize = 1)
    @Column(name="IDGALERIA")
	public Integer getId_galeria() {
		return id_galeria;
	}


	/**
	 * @param id_galeria the id_galeria to set
	 */
	public void setId_galeria(Integer id_galeria) {
		this.id_galeria = id_galeria;
	}


	/**
	 * @return the nome_imagem
	 */
	@Column(name="NOME_IMAGEM")
	public String getNome_imagem() {
		return nome_imagem;
	}


	/**
	 * @param nome_imagem the nome_imagem to set
	 */
	public void setNome_imagem(String nome_imagem) {
		this.nome_imagem = nome_imagem;
	}


	/**
	 * @return the autor
	 */
	@Column(name="AUTOR")
	public String getAutor() {
		return autor;
	}


	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}


	/**
	 * @return the descricao
	 */
	@Column(name="DESCRICAO")
	public String getDescricao() {
		return descricao;
	}


	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Galeria [id_galeria=" + id_galeria + ", nome_imagem=" + nome_imagem + ", autor=" + autor
				+ ", descricao=" + descricao + "]";
	}
	
	
}
