/**
 * 
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



/**
 * @author wellclbo2
 *
 */
@Entity(name = "PONTOS_MAIS_VISITADOS")
public class PontosMaisVisitados implements Serializable,Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2741681910388345703L;

	
	private Integer ID ;
	private Integer PRACA_TIRADENTES ;
	private Integer RUA_DAS_FLORES ;
	private Integer RUA_24_HORAS ;
	private Integer MUSEU_FERROVIARIO ;
	private Integer TEATRO_PAIOL ;
	private Integer JARDIM_BOTANICO ;
	private Integer ESTACAO_RODOFERROVIARIA ;
	private Integer TEATRO_GUAIRA ;
	private Integer PACO_DA_LIBERDADE ;
	private Integer MEMORIAL_ARABE_PASSEIO_PUBLICO ;
	private Integer CENTRO_CIVICO ;
	private Integer MUSEU_OSCAR_NIEMEYER ;
	private Integer BOSQUE_DO_PAPA ;
	private Integer BOSQUE_ALEMAO ;
	private Integer UNIVERSIDADE_LIVRE_DO_M_AMB ;
	private Integer PARQUE_SAO_LOURENCO ;
	private Integer OPERA_DE_ARAME ;
	private Integer PARQUE_TANGUA ;
	private Integer PARQUE_TINGUI ;
	private Integer MEMORIAL_UCRANIANO ;
	private Integer PORTAL_ITALIANO ;
	private Integer SANTA_FELICIDADE ;
	private Integer PARQUE_BARIGUI ;
	private Integer TORRE_PANORAMICA ;
	private Integer SETOR_HISToRICO ;
	
	public PontosMaisVisitados() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the iD
	 */
	@Id
    @Column(name="ID")
	public Integer getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(Integer iD) {
		ID = iD;
	}

	/**
	 * @return the pRACA_TIRADENTES
	 */
	@Column(name="PRACA_TIRADENTES")
	public Integer getPRACA_TIRADENTES() {
		return PRACA_TIRADENTES;
	}

	/**
	 * @param pRACA_TIRADENTES the pRACA_TIRADENTES to set
	 */
	public void setPRACA_TIRADENTES(Integer pRACA_TIRADENTES) {
		PRACA_TIRADENTES = pRACA_TIRADENTES;
	}

	/**
	 * @return the rUA_DAS_FLORES
	 */
	@Column(name="RUA_DAS_FLORES")
	public Integer getRUA_DAS_FLORES() {
		return RUA_DAS_FLORES;
	}

	/**
	 * @param rUA_DAS_FLORES the rUA_DAS_FLORES to set
	 */
	public void setRUA_DAS_FLORES(Integer rUA_DAS_FLORES) {
		RUA_DAS_FLORES = rUA_DAS_FLORES;
	}

	/**
	 * @return the rUA_24_HORAS
	 */
	@Column(name="RUA_24_HORAS")
	public Integer getRUA_24_HORAS() {
		return RUA_24_HORAS;
	}

	/**
	 * @param rUA_24_HORAS the rUA_24_HORAS to set
	 */
	public void setRUA_24_HORAS(Integer rUA_24_HORAS) {
		RUA_24_HORAS = rUA_24_HORAS;
	}

	/**
	 * @return the mUSEU_FERROVIARIO
	 */
	@Column(name="MUSEU_FERROVIARIO")
	public Integer getMUSEU_FERROVIARIO() {
		return MUSEU_FERROVIARIO;
	}

	/**
	 * @param mUSEU_FERROVIARIO the mUSEU_FERROVIARIO to set
	 */
	public void setMUSEU_FERROVIARIO(Integer mUSEU_FERROVIARIO) {
		MUSEU_FERROVIARIO = mUSEU_FERROVIARIO;
	}

	/**
	 * @return the tEATRO_PAIOL
	 */
	@Column(name="TEATRO_PAIOL")
	public Integer getTEATRO_PAIOL() {
		return TEATRO_PAIOL;
	}

	/**
	 * @param tEATRO_PAIOL the tEATRO_PAIOL to set
	 */
	public void setTEATRO_PAIOL(Integer tEATRO_PAIOL) {
		TEATRO_PAIOL = tEATRO_PAIOL;
	}

	/**
	 * @return the jARDIM_BOTANICO
	 */
	@Column(name="JARDIM_BOTANICO")
	public Integer getJARDIM_BOTANICO() {
		return JARDIM_BOTANICO;
	}

	/**
	 * @param jARDIM_BOTANICO the jARDIM_BOTANICO to set
	 */
	public void setJARDIM_BOTANICO(Integer jARDIM_BOTANICO) {
		JARDIM_BOTANICO = jARDIM_BOTANICO;
	}

	/**
	 * @return the eSTACAO_RODOFERROVIARIA
	 */
	@Column(name="ESTACAO_RODOFERROVIARIA")
	public Integer getESTACAO_RODOFERROVIARIA() {
		return ESTACAO_RODOFERROVIARIA;
	}

	/**
	 * @param eSTACAO_RODOFERROVIARIA the eSTACAO_RODOFERROVIARIA to set
	 */
	public void setESTACAO_RODOFERROVIARIA(Integer eSTACAO_RODOFERROVIARIA) {
		ESTACAO_RODOFERROVIARIA = eSTACAO_RODOFERROVIARIA;
	}

	/**
	 * @return the tEATRO_GUAIRA
	 */@Column(name="TEATRO_GUAIRA")
	public Integer getTEATRO_GUAIRA() {
		return TEATRO_GUAIRA;
	}

	/**
	 * @param tEATRO_GUAIRA the tEATRO_GUAIRA to set
	 */
	public void setTEATRO_GUAIRA(Integer tEATRO_GUAIRA) {
		TEATRO_GUAIRA = tEATRO_GUAIRA;
	}

	/**
	 * @return the pACO_DA_LIBERDADE
	 */@Column(name="PACO_DA_LIBERDADE")
	public Integer getPACO_DA_LIBERDADE() {
		return PACO_DA_LIBERDADE;
	}

	/**
	 * @param pACO_DA_LIBERDADE the pACO_DA_LIBERDADE to set
	 */
	public void setPACO_DA_LIBERDADE(Integer pACO_DA_LIBERDADE) {
		PACO_DA_LIBERDADE = pACO_DA_LIBERDADE;
	}

	/**
	 * @return the mEMORIAL_ARABE_PASSEIO_PUBLICO
	 */@Column(name="MEMORIAL_ARABE_PASSEIO_PUBLICO")
	public Integer getMEMORIAL_ARABE_PASSEIO_PUBLICO() {
		return MEMORIAL_ARABE_PASSEIO_PUBLICO;
	}

	/**
	 * @param mEMORIAL_ARABE_PASSEIO_PUBLICO the mEMORIAL_ARABE_PASSEIO_PUBLICO to set
	 */
	public void setMEMORIAL_ARABE_PASSEIO_PUBLICO(Integer mEMORIAL_ARABE_PASSEIO_PUBLICO) {
		MEMORIAL_ARABE_PASSEIO_PUBLICO = mEMORIAL_ARABE_PASSEIO_PUBLICO;
	}

	/**
	 * @return the cENTRO_CIVICO
	 */@Column(name="CENTRO_CIVICO")
	public Integer getCENTRO_CIVICO() {
		return CENTRO_CIVICO;
	}

	/**
	 * @param cENTRO_CIVICO the cENTRO_CIVICO to set
	 */
	public void setCENTRO_CIVICO(Integer cENTRO_CIVICO) {
		CENTRO_CIVICO = cENTRO_CIVICO;
	}

	/**
	 * @return the mUSEU_OSCAR_NIEMEYER
	 */@Column(name="MUSEU_OSCAR_NIEMEYER")
	public Integer getMUSEU_OSCAR_NIEMEYER() {
		return MUSEU_OSCAR_NIEMEYER;
	}

	/**
	 * @param mUSEU_OSCAR_NIEMEYER the mUSEU_OSCAR_NIEMEYER to set
	 */
	public void setMUSEU_OSCAR_NIEMEYER(Integer mUSEU_OSCAR_NIEMEYER) {
		MUSEU_OSCAR_NIEMEYER = mUSEU_OSCAR_NIEMEYER;
	}

	/**
	 * @return the bOSQUE_DO_PAPA
	 */@Column(name="BOSQUE_DO_PAPA")
	public Integer getBOSQUE_DO_PAPA() {
		return BOSQUE_DO_PAPA;
	}

	/**
	 * @param bOSQUE_DO_PAPA the bOSQUE_DO_PAPA to set
	 */
	public void setBOSQUE_DO_PAPA(Integer bOSQUE_DO_PAPA) {
		BOSQUE_DO_PAPA = bOSQUE_DO_PAPA;
	}

	/**
	 * @return the bOSQUE_ALEMAO
	 */@Column(name="BOSQUE_ALEMAO")
	public Integer getBOSQUE_ALEMAO() {
		return BOSQUE_ALEMAO;
	}

	/**
	 * @param bOSQUE_ALEMAO the bOSQUE_ALEMAO to set
	 */
	public void setBOSQUE_ALEMAO(Integer bOSQUE_ALEMAO) {
		BOSQUE_ALEMAO = bOSQUE_ALEMAO;
	}

	/**
	 * @return the uNIVERSIDADE_LIVRE_DO_M_AMB
	 */@Column(name="UNIVERSIDADE_LIVRE_DO_M_AMB")
	public Integer getUNIVERSIDADE_LIVRE_DO_M_AMB() {
		return UNIVERSIDADE_LIVRE_DO_M_AMB;
	}

	/**
	 * @param uNIVERSIDADE_LIVRE_DO_M_AMB the uNIVERSIDADE_LIVRE_DO_M_AMB to set
	 */
	public void setUNIVERSIDADE_LIVRE_DO_M_AMB(Integer uNIVERSIDADE_LIVRE_DO_M_AMB) {
		UNIVERSIDADE_LIVRE_DO_M_AMB = uNIVERSIDADE_LIVRE_DO_M_AMB;
	}

	/**
	 * @return the pARQUE_SAO_LOURENCO
	 */@Column(name="PARQUE_SAO_LOURENCO")
	public Integer getPARQUE_SAO_LOURENCO() {
		return PARQUE_SAO_LOURENCO;
	}

	/**
	 * @param pARQUE_SAO_LOURENCO the pARQUE_SAO_LOURENCO to set
	 */
	public void setPARQUE_SAO_LOURENCO(Integer pARQUE_SAO_LOURENCO) {
		PARQUE_SAO_LOURENCO = pARQUE_SAO_LOURENCO;
	}

	/**
	 * @return the oPERA_DE_ARAME
	 */@Column(name="OPERA_DE_ARAME")
	public Integer getOPERA_DE_ARAME() {
		return OPERA_DE_ARAME;
	}

	/**
	 * @param oPERA_DE_ARAME the oPERA_DE_ARAME to set
	 */
	public void setOPERA_DE_ARAME(Integer oPERA_DE_ARAME) {
		OPERA_DE_ARAME = oPERA_DE_ARAME;
	}

	/**
	 * @return the pARQUE_TANGUA
	 */@Column(name="PARQUE_TANGUA")
	public Integer getPARQUE_TANGUA() {
		return PARQUE_TANGUA;
	}

	/**
	 * @param pARQUE_TANGUA the pARQUE_TANGUA to set
	 */
	public void setPARQUE_TANGUA(Integer pARQUE_TANGUA) {
		PARQUE_TANGUA = pARQUE_TANGUA;
	}

	/**
	 * @return the pARQUE_TINGUI
	 */@Column(name="PARQUE_TINGUI")
	public Integer getPARQUE_TINGUI() {
		return PARQUE_TINGUI;
	}

	/**
	 * @param pARQUE_TINGUI the pARQUE_TINGUI to set
	 */
	public void setPARQUE_TINGUI(Integer pARQUE_TINGUI) {
		PARQUE_TINGUI = pARQUE_TINGUI;
	}

	/**
	 * @return the mEMORIAL_UCRANIANO
	 */@Column(name="MEMORIAL_UCRANIANO")
	public Integer getMEMORIAL_UCRANIANO() {
		return MEMORIAL_UCRANIANO;
	}

	/**
	 * @param mEMORIAL_UCRANIANO the mEMORIAL_UCRANIANO to set
	 */
	public void setMEMORIAL_UCRANIANO(Integer mEMORIAL_UCRANIANO) {
		MEMORIAL_UCRANIANO = mEMORIAL_UCRANIANO;
	}

	/**
	 * @return the pORTAL_ITALIANO
	 */@Column(name="PORTAL_ITALIANO")
	public Integer getPORTAL_ITALIANO() {
		return PORTAL_ITALIANO;
	}

	/**
	 * @param pORTAL_ITALIANO the pORTAL_ITALIANO to set
	 */
	public void setPORTAL_ITALIANO(Integer pORTAL_ITALIANO) {
		PORTAL_ITALIANO = pORTAL_ITALIANO;
	}

	/**
	 * @return the sANTA_FELICIDADE
	 */@Column(name="SANTA_FELICIDADE")
	public Integer getSANTA_FELICIDADE() {
		return SANTA_FELICIDADE;
	}

	/**
	 * @param sANTA_FELICIDADE the sANTA_FELICIDADE to set
	 */
	public void setSANTA_FELICIDADE(Integer sANTA_FELICIDADE) {
		SANTA_FELICIDADE = sANTA_FELICIDADE;
	}

	/**
	 * @return the pARQUE_BARIGUI
	 */@Column(name="PARQUE_BARIGUI")
	public Integer getPARQUE_BARIGUI() {
		return PARQUE_BARIGUI;
	}

	/**
	 * @param pARQUE_BARIGUI the pARQUE_BARIGUI to set
	 */
	public void setPARQUE_BARIGUI(Integer pARQUE_BARIGUI) {
		PARQUE_BARIGUI = pARQUE_BARIGUI;
	}

	/**
	 * @return the tORRE_PANORAMICA
	 */@Column(name="TORRE_PANORAMICA")
	public Integer getTORRE_PANORAMICA() {
		return TORRE_PANORAMICA;
	}

	/**
	 * @param tORRE_PANORAMICA the tORRE_PANORAMICA to set
	 */
	public void setTORRE_PANORAMICA(Integer tORRE_PANORAMICA) {
		TORRE_PANORAMICA = tORRE_PANORAMICA;
	}

	/**
	 * @return the sETOR_HISToRICO
	 */@Column(name="SETOR_HISToRICO")
	public Integer getSETOR_HISToRICO() {
		return SETOR_HISToRICO;
	}

	/**
	 * @param sETOR_HISToRICO the sETOR_HISToRICO to set
	 */
	public void setSETOR_HISToRICO(Integer sETOR_HISToRICO) {
		SETOR_HISToRICO = sETOR_HISToRICO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PontosMaisVisitados [PRACA_TIRADENTES=" + PRACA_TIRADENTES + ", RUA_DAS_FLORES=" + RUA_DAS_FLORES
				+ ", RUA_24_HORAS=" + RUA_24_HORAS + ", MUSEU_FERROVIARIO=" + MUSEU_FERROVIARIO + ", TEATRO_PAIOL="
				+ TEATRO_PAIOL + ", JARDIM_BOTANICO=" + JARDIM_BOTANICO + ", ESTACAO_RODOFERROVIARIA="
				+ ESTACAO_RODOFERROVIARIA + ", TEATRO_GUAIRA=" + TEATRO_GUAIRA + ", PACO_DA_LIBERDADE="
				+ PACO_DA_LIBERDADE + ", MEMORIAL_ARABE_PASSEIO_PUBLICO=" + MEMORIAL_ARABE_PASSEIO_PUBLICO
				+ ", CENTRO_CIVICO=" + CENTRO_CIVICO + ", MUSEU_OSCAR_NIEMEYER=" + MUSEU_OSCAR_NIEMEYER
				+ ", BOSQUE_DO_PAPA=" + BOSQUE_DO_PAPA + ", BOSQUE_ALEMAO=" + BOSQUE_ALEMAO
				+ ", UNIVERSIDADE_LIVRE_DO_M_AMB=" + UNIVERSIDADE_LIVRE_DO_M_AMB + ", PARQUE_SAO_LOURENCO="
				+ PARQUE_SAO_LOURENCO + ", OPERA_DE_ARAME=" + OPERA_DE_ARAME + ", PARQUE_TANGUA=" + PARQUE_TANGUA
				+ ", PARQUE_TINGUI=" + PARQUE_TINGUI + ", MEMORIAL_UCRANIANO=" + MEMORIAL_UCRANIANO
				+ ", PORTAL_ITALIANO=" + PORTAL_ITALIANO + ", SANTA_FELICIDADE=" + SANTA_FELICIDADE
				+ ", PARQUE_BARIGUI=" + PARQUE_BARIGUI + ", TORRE_PANORAMICA=" + TORRE_PANORAMICA + ", SETOR_HISToRICO="
				+ SETOR_HISToRICO + "]";
	}
	
}
