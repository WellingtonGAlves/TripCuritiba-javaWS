package dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import model.Pessoa;






@XmlRootElement(name = "PessoaDTO")
public class PessoaDTO extends AbstractDTO<Pessoa> {
    /* Construtores da classe */
    public PessoaDTO()
    {
        super();
    }

    public PessoaDTO(boolean pOk, String pMensagem)
    {
        super(pOk, pMensagem);
    }

    public PessoaDTO(boolean pOk, String pMensagem, Pessoa pPessoa)
    {
        super(pOk, pMensagem, pPessoa);
    }

    public PessoaDTO(boolean pOk, String pMensagem, List<Pessoa> pLista)
    {
        super(pOk, pMensagem, pLista);
    }

    /* Métodos de acesso */
    public Pessoa getPessoa()
    {
        return getObjeto();
    }

    public void setPessoa(Pessoa pPessoa)
    {
        setObjeto(pPessoa);
    }
}
