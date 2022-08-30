package com.poo.biblioteca.entidades;

import java.util.ArrayList;
import java.util.Date;
import com.poo.biblioteca.enumerator.TipoTrabalho;

public class ArtigoCientifico extends Trabalho {

    private Date dataPublicacao;

    public ArtigoCientifico(String titulo, ArrayList<Autor> autores, Date dataPublicacao) {
        super(titulo, autores, TipoTrabalho.ARTIGO_CIENTIFICO);
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
