package com.poo.biblioteca.entidades;

import java.util.ArrayList;

import com.poo.biblioteca.enumerator.TipoTrabalho;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "dissetacao")
public class Dissertacao extends Trabalho {

    @Column(name = "curso")
    private String curso;

    public Dissertacao(String curso, String titulo, ArrayList<Autor> autores) {
        super(titulo, autores,TipoTrabalho.DISSERTACAO);
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
