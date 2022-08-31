package com.poo.biblioteca.entidades;

import java.util.ArrayList;
import java.util.Date;
import com.poo.biblioteca.enumerator.TipoTrabalho;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "artigo_cientifico")
public class ArtigoCientifico extends Trabalho {

    @Column(name = "data_publicacao")
    @Temporal(TemporalType.DATE)
    private Date dataPublicacao;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artigo_trabalho_fk")
    private int id;

    @Column(name = "titulo")
    private String titulo;

    public ArtigoCientifico(int id, String titulo, ArrayList<Autor> autores, Date dataPublicacao) {
        super(autores, TipoTrabalho.ARTIGO_CIENTIFICO);
        this.titulo = titulo;
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
