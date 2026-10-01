package org.example;

public abstract class TextoDecorator implements Texto {

    private Texto texto;
    public String estrutura;

    public TextoDecorator(Texto texto) {
        this.texto = texto;
    }

    public Texto getTexto() {
        return texto;
    }

    public void setTexto(Texto texto) {
        this.texto = texto;
    }

    public abstract String getTagFormatacao();

    public String getConteudo() {
        return "<" + this.getTagFormatacao() + ">" + this.texto.getConteudo() + "</" + this.getTagFormatacao() + ">";
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.texto.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}