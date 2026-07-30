package com.mycompany.futplayers.model;

public class Jogador {
    private String nome;
    private int idade;
    private String clube;
    private double peso;
    private String nacionalidade;

    public Jogador(String nome, int idade, String clube, double peso, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.clube = clube;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getClube() {
        return clube;
    }

    public double getPeso() {
        return peso;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}