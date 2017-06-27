package dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import model.Rota;






@XmlRootElement(name = "RotaDTO")
public class RotaDTO extends AbstractDTO<Rota> {
    /* Construtores da classe */
    public RotaDTO()
    {
        super();
    }

    public RotaDTO(boolean pOk, String pMensagem)
    {
        super(pOk, pMensagem);
    }

    public RotaDTO(boolean pOk, String pMensagem, Rota pRota)
    {
        super(pOk, pMensagem, pRota);
    }

    public RotaDTO(boolean pOk, String pMensagem, List<Rota> pLista)
    {
        super(pOk, pMensagem, pLista);
    }

    /* Métodos de acesso */
    public Rota getRota()
    {
        return getObjeto();
    }

    public void setRota(Rota pRota)
    {
        setObjeto(pRota);
    }
}