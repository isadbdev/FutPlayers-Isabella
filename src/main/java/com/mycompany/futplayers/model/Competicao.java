package com.mycompany.futplayers.model;

import java.util.ArrayList;
import java.util.List;

public class Competicao {
    private String nome;
    private List<Clube> clubesParticipantes;
    private Confederacao confederacaoResponsavel;

    public Competicao(String nome, Confederacao confederacaoResponsavel) {
        this.nome = nome;
        this.confederacaoResponsavel = confederacaoResponsavel;
        this.clubesParticipantes = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Clube> getClubesParticipantes() { return new ArrayList<>(clubesParticipantes); }
    public Confederacao getConfederacaoResponsavel() { return confederacaoResponsavel; }

    public void adicionarClube(Clube clube) {
        if (clube != null) {
            clubesParticipantes.add(clube);
            clube.adicionarCompeticao(this);
        }
    }

    public void removerClube(Clube clube) {
        clubesParticipantes.remove(clube);
    }

    @Override
    public String toString() {
        return "Competição: " + nome + " | Confederacao: " + confederacaoResponsavel.getNome();
    }
}