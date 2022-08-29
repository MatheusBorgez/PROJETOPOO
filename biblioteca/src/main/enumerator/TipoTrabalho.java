package enumerator;

public enum TipoTrabalho {
    ARTIGO_CIENTIFICO("Artigo científico"),
    TESE("Tese"),
    DISSERTACAO("Dissertação");

    private String tipoTrabalho;

    TipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public String getTipoTrabalho() {
        return this.tipoTrabalho;
    }
}
