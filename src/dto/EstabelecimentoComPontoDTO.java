package dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import model.EstabelecimentoComPonto;






@XmlRootElement(name = "EstabelecimentoComPontoDTO")
public class EstabelecimentoComPontoDTO extends AbstractDTO<EstabelecimentoComPonto> {
    /* Construtores da classe */
    public EstabelecimentoComPontoDTO()
    {
        super();
    }

    public EstabelecimentoComPontoDTO(boolean pOk, String pMensagem)
    {
        super(pOk, pMensagem);
    }

    public EstabelecimentoComPontoDTO(boolean pOk, String pMensagem, EstabelecimentoComPonto pEstabelecimentoComPonto)
    {
        super(pOk, pMensagem, pEstabelecimentoComPonto);
    }

    public EstabelecimentoComPontoDTO(boolean pOk, String pMensagem, List<EstabelecimentoComPonto> pLista)
    {
        super(pOk, pMensagem, pLista);
    }

    /* Métodos de acesso */
    public EstabelecimentoComPonto getEstabelecimentoComPonto()
    {
        return getObjeto();
    }

    public void setEstabelecimentoComPonto(EstabelecimentoComPonto pEstabelecimentoComPonto)
    {
        setObjeto(pEstabelecimentoComPonto);
    }
}