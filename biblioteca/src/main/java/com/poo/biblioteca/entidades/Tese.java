package com.poo.biblioteca.entidades;

import java.util.ArrayList;

import com.poo.biblioteca.enumerator.TipoTrabalho;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tese")
public class Tese extends Trabalho {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tese_trabalho_fk")
    private int id;

    @Column(name = "area_contribuicao")
    private String areaDeContribuicao;
    
    @Column(name = "titulo")
    private String titulo;

    public Tese(int id, String titulo, ArrayList<Autor> autores, String areaDeContribuicao) {
        super(autores, TipoTrabalho.TESE);
        this.id = id;
        this.titulo = titulo;
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
