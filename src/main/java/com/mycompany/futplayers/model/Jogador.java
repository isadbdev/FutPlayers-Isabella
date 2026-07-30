package com.mycompany.futplayers.model;

public class Jogador {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String nacionalidade;
    private Clube clube;

    public Jogador(String nome, int idade, double altura, double peso, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getAltura() { return altura; }
    public double getPeso() { return peso; }
    public String getNacionalidade() { return nacionalidade; }
    public Clube getClube() { return clube; }

    public void setClube(Clube clube) { this.clube = clube; }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos, " + altura + "m, " + peso + "kg, " + nacionalidade + ")" +
               (clube != null ? " - Clube: " + clube.getNome() : " - Sem clube");
    }
}