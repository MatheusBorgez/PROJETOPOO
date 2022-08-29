package com.poo.biblioteca.entidades;

import java.util.ArrayList;

import com.poo.biblioteca.enumerator.TipoTrabalho;

public class Dissertacao extends Trabalho {

    private String curso;

    public Dissertacao(String curso, String titulo, ArrayList<Autor> autores) {
        super(titulo, autores);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String getTipoDocumento() {
        return TipoTrabalho.DISSERTACAO.getTipoTrabalho();
    }
    
}
