package org.example;

public class TextoSimples implements Texto {

    public String conteudo;

    public TextoSimples() {
    }

    public TextoSimples(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getEstrutura() {
        return "Texto Base";
    }
}