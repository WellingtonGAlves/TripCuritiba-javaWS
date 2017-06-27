package dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import model.PontoTuristico;






@XmlRootElement(name = "PontoTuristicoDTO")
public class PontoTuristicoDTO extends AbstractDTO<PontoTuristico> {
    /* Construtores da classe */
    public PontoTuristicoDTO()
    {
        super();
    }

    public PontoTuristicoDTO(boolean pOk, String pMensagem)
    {
        super(pOk, pMensagem);
    }

    public PontoTuristicoDTO(boolean pOk, String pMensagem, PontoTuristico pPontoTuristico)
    {
        super(pOk, pMensagem, pPontoTuristico);
    }

    public PontoTuristicoDTO(boolean pOk, String pMensagem, List<PontoTuristico> pLista)
    {
        super(pOk, pMensagem, pLista);
    }

    /* Métodos de acesso */
    public PontoTuristico getPontoTuristico()
    {
        return getObjeto();
    }

    public void setPontoTuristico(PontoTuristico pPontoTuristico)
    {
        setObjeto(pPontoTuristico);
    }
}
