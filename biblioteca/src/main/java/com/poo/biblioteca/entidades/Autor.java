package com.poo.biblioteca.entidades;

import java.util.ArrayList;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @Column(name = "formacao")
    private String formacao;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @ManyToMany(mappedBy = "autores")
    private ArrayList<Trabalho> trabalhos = new ArrayList<>();

    public Autor(String nome, String nacionalidade, String formacao, Date dataNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.formacao = formacao;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public String getFormacao() {
        return formacao;
    }
    
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
