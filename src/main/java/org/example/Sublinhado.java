package org.example;

public class Sublinhado extends TextoDecorator {

    public Sublinhado(Texto texto) {
        super(texto);
    }

    public String getTagFormatacao() {
        return "u";
    }

    public String getNomeEstrutura() {
        return "Sublinhado";
    }
}