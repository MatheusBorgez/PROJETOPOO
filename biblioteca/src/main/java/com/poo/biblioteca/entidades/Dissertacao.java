package com.poo.biblioteca.entidades;

import java.util.ArrayList;

import com.poo.biblioteca.enumerator.TipoTrabalho;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "dissetacao")
public class Dissertacao extends Trabalho {

    @Column(name = "curso")
    private String curso;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "dissertacao_trabalho_fk")
    private int id;

    @Column(name = "titulo")
    private String titulo;

    public Dissertacao(int id, String curso, String titulo, ArrayList<Autor> autores) {
        super(autores,TipoTrabalho.DISSERTACAO);
        this.id = id;
        this.curso = curso;
        this.titulo = titulo;
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
