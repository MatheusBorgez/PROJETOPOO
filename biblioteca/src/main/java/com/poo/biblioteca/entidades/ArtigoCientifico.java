package com.poo.biblioteca.entidades;

import java.util.ArrayList;
import java.util.Date;
import com.poo.biblioteca.enumerator.TipoTrabalho;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "artigos_cientificos")
public class ArtigoCientifico extends Trabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date dataPublicacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
