package com.mycompany.futplayers.model;

import java.util.ArrayList;
import java.util.List;

public class Clube {
    private String nome;
    private String presidente;
    private Tecnico tecnico;
    private List<Jogador> jogadores;
    private List<Competicao> competicoes;

    public Clube(String nome, String presidente) {
        this.nome = nome;
        this.presidente = presidente;
        this.jogadores = new ArrayList<>();
        this.competicoes = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public String getPresidente() { return presidente; }
    public Tecnico getTecnico() { return tecnico; }
    public List<Jogador> getJogadores() { return new ArrayList<>(jogadores); }
    public List<Competicao> getCompeticoes() { return new ArrayList<>(competicoes); }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
        if (tecnico != null) {
            tecnico.setClube(this);
        }
    }

    public void adicionarJogador(Jogador jogador) {
        if (jogador != null) {
            jogadores.add(jogador);
            jogador.setClube(this);
        }
    }

    public void adicionarCompeticao(Competicao competicao) {
        if (competicao != null) {
            competicoes.add(competicao);
        }
    }

    public void removerJogador(Jogador jogador) {
        jogadores.remove(jogador);
    }

    public void removerCompeticao(Competicao competicao) {
        competicoes.remove(competicao);
    }

    @Override
    public String toString() {
        return "Clube: " + nome + " | Presidente: " + presidente +
               " | Técnico: " + (tecnico != null ? tecnico.getNome() : "Sem técnico");
    }
}