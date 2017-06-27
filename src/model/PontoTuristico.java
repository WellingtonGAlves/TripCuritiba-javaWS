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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
/**
 * @author wellclbo2
 *
 */
@Entity(name = "PONTO_TURISTICO")
public class PontoTuristico implements Comparable<PontoTuristico> ,Serializable{

	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5647130302435344810L;
	/**
	 * 
	 */
	
	
	private Integer id_ponto_turistico;
	private String imagem_ponto;
	private String imagem_historia;
	private String imagem_carrossel;
	private String  nome_ponto;
	private String  conteudo_ponto;
	private String  informacoes_ponto;
	private String  horarios_ponto;
	private String  dica_ponto;
	private String  titulo_historia;
	private String  conteudo_historia;  
	private Set<EstabelecimentoComPonto> mEstabelecimentoComPontos;	  
	private Set<Rota> mRotas;

	public PontoTuristico() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the id_ponto_uristico
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDPONTO_TURISTICO")
    @SequenceGenerator(name = "IDPONTO_TURISTICO", sequenceName = "IDPONTO_TURISTICO", allocationSize = 1)
    @Column(name="IDPONTO_TURISTICO")
	public Integer getId_ponto_turistico() {
		return id_ponto_turistico;
	}


	/**
	 * @param id_ponto_uristico the id_ponto_uristico to set
	 */
	public void setId_ponto_turistico(Integer id_ponto_uristico) {
		this.id_ponto_turistico = id_ponto_uristico;
	}


	/**
	 * @return the imagem_ponto
	 */
    @Column(name="IMAGEM_PONTO")
	public String getImagem_ponto() {
		return imagem_ponto;
	}


	/**
	 * @param imagem_ponto the imagem_ponto to set
	 */
    
	public void setImagem_ponto(String imagem_ponto) {
		this.imagem_ponto = imagem_ponto;
	}


	/**
	 * @return the imagem_historia
	 */
    @Column(name="IMAGEM_HISTORIA")
	public String getImagem_historia() {
		return imagem_historia;
	}


	/**
	 * @param imagem_historia the imagem_historia to set
	 */
	public void setImagem_historia(String imagem_historia) {
		this.imagem_historia = imagem_historia;
	}


	/**
	 * @return the imagem_carrosel
	 */
	@Column(name="IMAGEM_CARROSSEL")
	public String getImagem_carrossel() {
		return imagem_carrossel;
	}


	/**
	 * @param imagem_carrosel the imagem_carrosel to set
	 */
	public void setImagem_carrossel(String imagem_carrosel) {
		this.imagem_carrossel = imagem_carrosel;
	}


	/**
	 * @return the nome_ponto
	 */
	@Column(name="NOME_PONTO")
	public String getNome_ponto() {
		return nome_ponto;
	}


	/**
	 * @param nome_ponto the nome_ponto to set
	 */
	public void setNome_ponto(String nome_ponto) {
		this.nome_ponto = nome_ponto;
	}


	/**
	 * @return the conteudo_ponto
	 */
	@Column(name="CONTEUDO_PONTO")
	public String getConteudo_ponto() {
		return conteudo_ponto;
	}


	/**
	 * @param conteudo_ponto the conteudo_ponto to set
	 */
	public void setConteudo_ponto(String conteudo_ponto) {
		this.conteudo_ponto = conteudo_ponto;
	}


	/**
	 * @return the informacoes_ponto
	 */
	@Column(name="INFORMACOES_PONTO")
	public String getInformacoes_ponto() {
		return informacoes_ponto;
	}


	/**
	 * @param informacoes_ponto the informacoes_ponto to set
	 */
	public void setInformacoes_ponto(String informacoes_ponto) {
		this.informacoes_ponto = informacoes_ponto;
	}


	/**
	 * @return the horarios_ponto
	 */
	@Column(name="HORARIOS_PONTO")
	public String getHorarios_ponto() {
		return horarios_ponto;
	}


	/**
	 * @param horarios_ponto the horarios_ponto to set
	 */
	public void setHorarios_ponto(String horarios_ponto) {
		this.horarios_ponto = horarios_ponto;
	}


	/**
	 * @return the dica_ponto
	 */
	@Column(name="DICA_PONTO")
	public String getDica_ponto() {
		return dica_ponto;
	}


	/**
	 * @param dica_ponto the dica_ponto to set
	 */
	public void setDica_ponto(String dica_ponto) {
		this.dica_ponto = dica_ponto;
	}


	/**
	 * @return the titulo_historia
	 */
	@Column(name="TITULO_HISTORIA")
	public String getTitulo_historia() {
		return titulo_historia;
	}


	/**
	 * @param titulo_historia the titulo_historia to set
	 */
	public void setTitulo_historia(String titulo_historia) {
		this.titulo_historia = titulo_historia;
	}


	/**
	 * @return the conteudo_historia
	 */
	@Column(name="CONTEUDO_HISTORIA")
	public String getConteudo_historia() {
		return conteudo_historia;
	}


	/**
	 * @param conteudo_historia the conteudo_historia to set
	 */
	public void setConteudo_historia(String conteudo_historia) {
		this.conteudo_historia = conteudo_historia;
	}


	@ManyToMany(mappedBy = "mPontoTuristicos")
	@JsonIgnore
	//@JsonManagedReference(value="rota-ponto")
    public Set<Rota> getRotas()
    {
        return mRotas == null ? new HashSet<>() : mRotas;
    }

    public void setRotas(Set<Rota> pRotas)
    {
        mRotas = pRotas;
    }
	
	
    @OneToMany(mappedBy = "estabelecimento", cascade=CascadeType.ALL)// Nome do atributo da outra classe
    @JsonManagedReference(value="pontoTuristico-estabelecimentoComPonto")
    public Set<EstabelecimentoComPonto> getEstabelecimentoComPontos()
    {
        return mEstabelecimentoComPontos == null ? new HashSet<>() : mEstabelecimentoComPontos;
    }

    public void setEstabelecimentoComPontos(Set<EstabelecimentoComPonto> pEstabelecimentoComPontos)
    {
        mEstabelecimentoComPontos = pEstabelecimentoComPontos;
    }


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conteudo_historia == null) ? 0 : conteudo_historia.hashCode());
		result = prime * result + ((conteudo_ponto == null) ? 0 : conteudo_ponto.hashCode());
		result = prime * result + ((dica_ponto == null) ? 0 : dica_ponto.hashCode());
		result = prime * result + ((horarios_ponto == null) ? 0 : horarios_ponto.hashCode());
		result = prime * result + ((id_ponto_turistico == null) ? 0 : id_ponto_turistico.hashCode());
		result = prime * result + ((imagem_carrossel == null) ? 0 : imagem_carrossel.hashCode());
		result = prime * result + ((imagem_historia == null) ? 0 : imagem_historia.hashCode());
		result = prime * result + ((imagem_ponto == null) ? 0 : imagem_ponto.hashCode());
		result = prime * result + ((informacoes_ponto == null) ? 0 : informacoes_ponto.hashCode());
		result = prime * result + ((mEstabelecimentoComPontos == null) ? 0 : mEstabelecimentoComPontos.hashCode());
		result = prime * result + ((mRotas == null) ? 0 : mRotas.hashCode());
		result = prime * result + ((nome_ponto == null) ? 0 : nome_ponto.hashCode());
		result = prime * result + ((titulo_historia == null) ? 0 : titulo_historia.hashCode());
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
		PontoTuristico other = (PontoTuristico) obj;
		if (conteudo_historia == null) {
			if (other.conteudo_historia != null)
				return false;
		} else if (!conteudo_historia.equals(other.conteudo_historia))
			return false;
		if (conteudo_ponto == null) {
			if (other.conteudo_ponto != null)
				return false;
		} else if (!conteudo_ponto.equals(other.conteudo_ponto))
			return false;
		if (dica_ponto == null) {
			if (other.dica_ponto != null)
				return false;
		} else if (!dica_ponto.equals(other.dica_ponto))
			return false;
		if (horarios_ponto == null) {
			if (other.horarios_ponto != null)
				return false;
		} else if (!horarios_ponto.equals(other.horarios_ponto))
			return false;
		if (id_ponto_turistico == null) {
			if (other.id_ponto_turistico != null)
				return false;
		} else if (!id_ponto_turistico.equals(other.id_ponto_turistico))
			return false;
		if (imagem_carrossel == null) {
			if (other.imagem_carrossel != null)
				return false;
		} else if (!imagem_carrossel.equals(other.imagem_carrossel))
			return false;
		if (imagem_historia == null) {
			if (other.imagem_historia != null)
				return false;
		} else if (!imagem_historia.equals(other.imagem_historia))
			return false;
		if (imagem_ponto == null) {
			if (other.imagem_ponto != null)
				return false;
		} else if (!imagem_ponto.equals(other.imagem_ponto))
			return false;
		if (informacoes_ponto == null) {
			if (other.informacoes_ponto != null)
				return false;
		} else if (!informacoes_ponto.equals(other.informacoes_ponto))
			return false;
		if (mEstabelecimentoComPontos == null) {
			if (other.mEstabelecimentoComPontos != null)
				return false;
		} else if (!mEstabelecimentoComPontos.equals(other.mEstabelecimentoComPontos))
			return false;
		if (mRotas == null) {
			if (other.mRotas != null)
				return false;
		} else if (!mRotas.equals(other.mRotas))
			return false;
		if (nome_ponto == null) {
			if (other.nome_ponto != null)
				return false;
		} else if (!nome_ponto.equals(other.nome_ponto))
			return false;
		if (titulo_historia == null) {
			if (other.titulo_historia != null)
				return false;
		} else if (!titulo_historia.equals(other.titulo_historia))
			return false;
		return true;
	}


	@Override
	public int compareTo(PontoTuristico o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
	
	
}
