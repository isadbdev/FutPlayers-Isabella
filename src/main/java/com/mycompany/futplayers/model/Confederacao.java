package com.mycompany.futplayers.model;

import java.util.ArrayList;
import java.util.List;

public class Confederacao {
    private String nome;
    private String pais;
    private String continente;
    private String presidente;
    private List<Competicao> competicoesOrganizadas;

    public Confederacao(String nome, String pais, String continente, String presidente) {
        this.nome = nome;
        this.pais = pais;
        this.continente = continente;
        this.presidente = presidente;
        this.competicoesOrganizadas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public String getPais() { return pais; }
    public String getContinente() { return continente; }
    public String getPresidente() { return presidente; }
    public List<Competicao> getCompeticoesOrganizadas() { return new ArrayList<>(competicoesOrganizadas); }

    public void adicionarCompeticao(Competicao competicao) {
        if (competicao != null) {
            competicoesOrganizadas.add(competicao);
        }
    }

    public void removerCompeticao(Competicao competicao) {
        competicoesOrganizadas.remove(competicao);
    }

    @Override
    public String toString() {
        return "Confederação: " + nome + " | País: " + pais + " | Continente: " + continente +
               " | Presidente: " + presidente;
    }
}