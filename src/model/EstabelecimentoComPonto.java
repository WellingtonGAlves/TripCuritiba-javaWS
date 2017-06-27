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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author wellclbo2
 *
 */
@Entity(name = "ESTABELECIMENTO_COM_PONTO")
public class EstabelecimentoComPonto implements Serializable,Cloneable,Comparable<EstabelecimentoComPonto> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8990581293665403745L;
 
	private Integer      mId;
	private Estabelecimento   mEstabelecimento;
    private PontoTuristico   mPontoTuristico;
	private Integer distancia;
	
	public EstabelecimentoComPonto() {
		// TODO Auto-generated constructor stub
	}

	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDESTAB_COM_PONTO")
    @SequenceGenerator(name = "IDESTAB_COM_PONTO", sequenceName = "IDESTAB_COM_PONTO", allocationSize = 1)
    @Column(name="IDESTAB_COM_PONTO")
    public Integer getId()
    {
        return mId;
    }

   /**
	 * @param mId the mId to set
	 */
	public void setId(Integer mId) {
		this.mId = mId;
	}

	/**
	 * @return the distancia
	 */
	@Column(name="DISTANCIA")
	public Integer getDistancia() {
		return distancia;
	}

	/**
	 * @param distancia the distancia to set
	 */
	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}

	@ManyToOne()
    @JoinColumn(name = "ESTAB_IDESTABELECIMENTO")// Nome da chave estrangeira na tabela
    @JsonBackReference
	public Estabelecimento getEstabelecimento()
    {
        return mEstabelecimento;
    }

    public void setEstabelecimento(Estabelecimento pEstabelecimento)
    {
        mEstabelecimento = pEstabelecimento;
    }
	
    @ManyToOne()
    @JoinColumn(name = "PONTO_IDPONTO_TURISTICO")// Nome da chave estrangeira na tabela
    @JsonBackReference
    public PontoTuristico getPontoTuristico()
    {
        return mPontoTuristico;
    }

    public void setPontoTuristico(PontoTuristico pPontoTuristico)
    {
        mPontoTuristico = pPontoTuristico;
    }
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EstabelecimentoComPonto [mId=" + mId + ", mEstabelecimento=" + mEstabelecimento + ", mPontoTuristico="
				+ mPontoTuristico + ", distancia=" + distancia + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((distancia == null) ? 0 : distancia.hashCode());
		result = prime * result + ((mEstabelecimento == null) ? 0 : mEstabelecimento.hashCode());
		result = prime * result + ((mId == null) ? 0 : mId.hashCode());
		result = prime * result + ((mPontoTuristico == null) ? 0 : mPontoTuristico.hashCode());
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
		EstabelecimentoComPonto other = (EstabelecimentoComPonto) obj;
		if (distancia == null) {
			if (other.distancia != null)
				return false;
		} else if (!distancia.equals(other.distancia))
			return false;
		if (mEstabelecimento == null) {
			if (other.mEstabelecimento != null)
				return false;
		} else if (!mEstabelecimento.equals(other.mEstabelecimento))
			return false;
		if (mId == null) {
			if (other.mId != null)
				return false;
		} else if (!mId.equals(other.mId))
			return false;
		if (mPontoTuristico == null) {
			if (other.mPontoTuristico != null)
				return false;
		} else if (!mPontoTuristico.equals(other.mPontoTuristico))
			return false;
		return true;
	}


	@Override
	public int compareTo(EstabelecimentoComPonto o) {
		// TODO Auto-generated method stub
		return 0;
	}



	
	
	
}
