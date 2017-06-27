package dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import model.Galeria;






@XmlRootElement(name = "GaleriaDTO")
public class GaleriaDTO extends AbstractDTO<Galeria> {
    /* Construtores da classe */
    public GaleriaDTO()
    {
        super();
    }

    public GaleriaDTO(boolean pOk, String pMensagem)
    {
        super(pOk, pMensagem);
    }

    public GaleriaDTO(boolean pOk, String pMensagem, Galeria pGaleria)
    {
        super(pOk, pMensagem, pGaleria);
    }

    public GaleriaDTO(boolean pOk, String pMensagem, List<Galeria> pLista)
    {
        super(pOk, pMensagem, pLista);
    }

    /* Métodos de acesso */
    public Galeria getGaleria()
    {
        return getObjeto();
    }

    public void setGaleria(Galeria pGaleria)
    {
        setObjeto(pGaleria);
    }
}