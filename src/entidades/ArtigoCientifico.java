package entidades;

import java.util.ArrayList;
import java.util.Date;

import enumerator.TipoTrabalho;

public class ArtigoCientifico extends Trabalho {

    private Date dataPublicacao;

    public ArtigoCientifico(String titulo, ArrayList<Autor> autores, Date dataPublicacao) {
        super(titulo, autores);
        this.dataPublicacao = dataPublicacao;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public String getTipoDocumento() {
        return TipoTrabalho.ARTIGO_CIENTIFICO.getTipoTrabalho();
    }
    
}
