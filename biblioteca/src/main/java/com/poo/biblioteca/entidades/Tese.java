package com.poo.biblioteca.entidades;

import java.util.ArrayList;

import com.poo.biblioteca.enumerator.TipoTrabalho;

public class Tese extends Trabalho {

    private String areaDeContribuicao;

    public Tese(String titulo, ArrayList<Autor> autores, String areaDeContribuicao) {
        super(titulo, autores, TipoTrabalho.TESE);
        this.areaDeContribuicao = areaDeContribuicao;
    }

    public String getAreaDeContribuicao() {
        return areaDeContribuicao;
    }

    public void setAreaDeContribuicao(String areaDeContribuicao) {
        this.areaDeContribuicao = areaDeContribuicao;
    }

    @Override
    public String getTipoDocumento() {        
        return TipoTrabalho.TESE.getTipoTrabalho();
    }
    
}
