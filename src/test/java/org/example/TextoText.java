package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextoTest {

    @Test
    void deveRetornarConteudoTexto() {
        Texto texto = new TextoSimples("Padrões de Projeto");

        assertEquals("Padrões de Projeto", texto.getConteudo());
    }

    @Test
    void deveRetornarConteudoTextoComNegrito() {
        Texto texto = new Negrito(new TextoSimples("Padrões de Projeto"));

        assertEquals("<b>Padrões de Projeto</b>", texto.getConteudo());
    }

    @Test
    void deveRetornarConteudoTextoComItalico() {
        Texto texto = new Italico(new TextoSimples("Padrões de Projeto"));

        assertEquals("<i>Padrões de Projeto</i>", texto.getConteudo());
    }

    @Test
    void deveRetornarConteudoTextoComSublinhado() {
        Texto texto = new Sublinhado(new TextoSimples("Padrões de Projeto"));

        assertEquals("<u>Padrões de Projeto</u>", texto.getConteudo());
    }

    @Test
    void deveRetornarConteudoTextoComNegritoMaisItalico() {
        Texto texto = new Negrito(new Italico(new TextoSimples("Padrões de Projeto")));

        assertEquals("<b><i>Padrões de Projeto</i></b>", texto.getConteudo());
    }

    @Test
    void deveRetornarConteudoTextoComNegritoMaisSublinhado() {
        Texto texto = new Negrito(new Sublinhado(new TextoSimples("Padrões de Projeto")));

        assertEquals("<b><u>Padrões de Projeto</u></b>", texto.getConteudo());
    }

    @Test
    void deveRetornarConteudoTextoComItalicoMaisSublinhado() {
        Texto texto = new Italico(new Sublinhado(new TextoSimples("Padrões de Projeto")));

        assertEquals("<i><u>Padrões de Projeto</u></i>", texto.getConteudo());
    }

    @Test
    void deveRetornarConteudoTextoComNegritoMaisItalicoMaisSublinhado() {
        Texto texto = new Negrito(new Italico(new Sublinhado(new TextoSimples("Padrões de Projeto"))));

        assertEquals("<b><i><u>Padrões de Projeto</u></i></b>", texto.getConteudo());
    }

    @Test
    void deveRetornarEstruturaTexto() {
        Texto texto = new TextoSimples();

        assertEquals("Texto Base", texto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTextoComNegrito() {
        Texto texto = new Negrito(new TextoSimples());

        assertEquals("Texto Base/Negrito", texto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTextoComItalico() {
        Texto texto = new Italico(new TextoSimples());

        assertEquals("Texto Base/Itálico", texto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTextoComSublinhado() {
        Texto texto = new Sublinhado(new TextoSimples());

        assertEquals("Texto Base/Sublinhado", texto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTextoComNegritoMaisItalico() {
        Texto texto = new Negrito(new Italico(new TextoSimples()));

        assertEquals("Texto Base/Itálico/Negrito", texto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTextoComNegritoMaisSublinhado() {
        Texto texto = new Negrito(new Sublinhado(new TextoSimples()));

        assertEquals("Texto Base/Sublinhado/Negrito", texto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTextoComItalicoMaisSublinhado() {
        Texto texto = new Italico(new Sublinhado(new TextoSimples()));

        assertEquals("Texto Base/Sublinhado/Itálico", texto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTextoComNegritoMaisItalicoMaisSublinhado() {
        Texto texto = new Negrito(new Italico(new Sublinhado(new TextoSimples())));

        assertEquals("Texto Base/Sublinhado/Itálico/Negrito", texto.getEstrutura());
    }

}