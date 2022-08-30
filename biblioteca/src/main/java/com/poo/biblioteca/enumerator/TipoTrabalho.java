package com.poo.biblioteca.enumerator;

public enum TipoTrabalho {
    ARTIGO_CIENTIFICO(1, "Artigo científico"),
    TESE(2, "Tese"),
    DISSERTACAO(3, "Dissertação");

    private String tipoTrabalho;
    private int value;

    TipoTrabalho(int value, String descricao) {
        this.tipoTrabalho = descricao;
    }

    public String getTipoTrabalho() {
        return this.tipoTrabalho;
    }

    public int getValue() {
        return this.value;
    }

    public static TipoTrabalho getFromId(int value) {
        if (value == 1) {
            return ARTIGO_CIENTIFICO;
        }
        else if (value == 2) {
            return TESE;
        }

        return DISSERTACAO;
    }

    public static TipoTrabalho getFromDescricao(String descricao) {
        if (descricao.equals("Artigo científico")) {
            return ARTIGO_CIENTIFICO;
        }
        else if (descricao.equals("Tese")) {
            return TESE;
        }

        return DISSERTACAO;
    }
}
