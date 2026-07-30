package com.mycompany.futplayers.model;

public class Confederacao {
    private String nome;
    private String presidente;
    private String continente;

    public Confederacao(String nome, String presidente, String continente) {
        this.nome = nome;
        this.presidente = presidente;
        this.continente = continente;
    }

    public String getNome() {
        return nome;
    }

    public String getPresidente() {
        return presidente;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        if (continente != null && !continente.isEmpty()) {
            this.continente = continente;
        }
    }
}
