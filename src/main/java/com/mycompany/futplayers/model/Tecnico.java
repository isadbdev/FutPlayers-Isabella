package com.mycompany.futplayers.model;

public class Tecnico {
    private String nome;
    private int idade;
    private Clube clube;

    public Tecnico(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public Clube getClube() { return clube; }

    public void setClube(Clube clube) { this.clube = clube; }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos)" +
               (clube != null ? " - Técnico do " + clube.getNome() : " - Sem clube");
    }
}