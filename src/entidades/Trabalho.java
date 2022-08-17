package entidades;

import java.io.File;
import java.util.ArrayList;

public abstract class Trabalho implements IDocumento {

    private String titulo;
    private ArrayList<Autor> autores = new ArrayList<>();

    public Trabalho(String titulo, ArrayList<Autor> autores) {
        this.titulo = titulo;
        this.autores = autores;
    }

    @Override
    public byte[] toByteArray(File conteudo) {
        return null;
    }

    @Override
    public File toFile(byte[] conteudo) {
        return null;
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
