package org.example;

public class Negrito extends TextoDecorator {

    public Negrito(Texto texto) {
        super(texto);
    }

    public String getTagFormatacao() {
        return "b";
    }

    public String getNomeEstrutura() {
        return "Negrito";
    }
}