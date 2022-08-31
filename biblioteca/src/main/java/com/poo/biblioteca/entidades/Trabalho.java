package com.poo.biblioteca.entidades;

import java.io.File;
import java.util.ArrayList;
import com.poo.biblioteca.enumerator.TipoTrabalho;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;

@Inheritance(strategy=InheritanceType.JOINED)
@Entity
public abstract class Trabalho implements IDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipo_trabalho")
    private int tipoTrabalho;

    @ManyToMany
    @JoinTable(name = "autor_trabalho", 
        joinColumns = {@JoinColumn(name = "fk_trabalho")}, 
        inverseJoinColumns = {@JoinColumn(name = "fk_autor")})
    private ArrayList<Autor> autores = new ArrayList<>();

    public Trabalho(ArrayList<Autor> autores, TipoTrabalho tipoTrabalho) {
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

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void addAutor(Autor autor) {
        this.autores.add(autor);
    }
}
