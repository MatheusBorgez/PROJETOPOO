package com.poo.biblioteca.entidades;

import java.io.File;
import java.util.ArrayList;

import com.poo.biblioteca.enumerator.TipoTrabalho;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;

@MappedSuperclass
public abstract class Trabalho implements IDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipo_trabalho")
    private int tipoTrabalho;

    @Column(name = "titulo")
    private String titulo;

    private ArrayList<Autor> autores = new ArrayList<>();

    public Trabalho(String titulo, ArrayList<Autor> autores, TipoTrabalho tipoTrabalho) {
        this.titulo = titulo;
        this.autores = autores;
        this.tipoTrabalho = tipoTrabalho.getValue();
    }

    public int getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(TipoTrabalho tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho.getValue();
    }

    @Override
    public byte[] toByteArray(File conteudo) {
        return null;
    }

    @Override
    public File toFile(byte[] conteudo) {
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract String getTipoDocumento();    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void addAutor(Autor autor) {
        this.autores.add(autor);
    }
}
