package dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import model.Estabelecimento;






@XmlRootElement(name = "EstabelecimentoDTO")
public class EstabelecimentoDTO extends AbstractDTO<Estabelecimento> {
    /* Construtores da classe */
    public EstabelecimentoDTO()
    {
        super();
    }

    public EstabelecimentoDTO(boolean pOk, String pMensagem)
    {
        super(pOk, pMensagem);
    }

    public EstabelecimentoDTO(boolean pOk, String pMensagem, Estabelecimento pEstabelecimento)
    {
        super(pOk, pMensagem, pEstabelecimento);
    }

    public EstabelecimentoDTO(boolean pOk, String pMensagem, List<Estabelecimento> pLista)
    {
        super(pOk, pMensagem, pLista);
    }

    /* Métodos de acesso */
    public Estabelecimento getEstabelecimento()
    {
        return getObjeto();
    }

    public void setEstabelecimento(Estabelecimento pEstabelecimento)
    {
        setObjeto(pEstabelecimento);
    }
}