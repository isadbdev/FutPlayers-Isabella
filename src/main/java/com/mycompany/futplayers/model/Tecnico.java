package com.mycompany.futplayers.model;

public class Tecnico {
    private String nome;
    private String clube;

    public Tecnico(String nome, String clube) {
        this.nome = nome;
        this.clube = clube;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        if (clube != null && !clube.isEmpty()) {
            this.clube = clube;
        }
    }
}