package entidades;

import java.util.Date;

public class Autor {
    private String nome;
    private String nacionalidade;
    private String formacao;
    private Date dataNascimento;

    public Autor(String nome, String nacionalidade, String formacao, Date dataNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.formacao = formacao;
        this.dataNascimento = dataNascimento;
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
