package org.example;

public class Italico extends TextoDecorator {

    public Italico(Texto texto) {
        super(texto);
    }

    public String getTagFormatacao() {
        return "i";
    }

    public String getNomeEstrutura() {
        return "Itálico";
    }
}