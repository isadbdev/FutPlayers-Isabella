package com.mycompany.futplayers.model;

public class Clube {
    private String nome;
    private String sigla;
    private String tecnico;

    public Clube(String nome, String sigla, String tecnico) {
        this.nome = nome;
        this.sigla = sigla;
        this.tecnico = tecnico;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        if (tecnico != null && !tecnico.isEmpty()) {
            this.tecnico = tecnico;
        }
    }
}