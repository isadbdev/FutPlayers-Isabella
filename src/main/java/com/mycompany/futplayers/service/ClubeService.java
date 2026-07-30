package com.mycompany.futplayers.service;

import com.mycompany.futplayers.model.*;

public class ClubeService {

    public Clube criarClube(String nome, String presidente, Tecnico tecnico) {
        Clube clube = new Clube(nome, presidente);
        clube.setTecnico(tecnico);
        return clube;
    }

    public void adicionarJogador(Clube clube, Jogador jogador) {
        clube.adicionarJogador(jogador);
    }

    public void removerJogador(Clube clube, Jogador jogador) {
        clube.removerJogador(jogador);
    }

    public void adicionarCompeticao(Clube clube, Competicao competicao) {
        clube.adicionarCompeticao(competicao);
    }

    public void removerCompeticao(Clube clube, Competicao competicao) {
        clube.removerCompeticao(competicao);
    }

    public void listarJogadores(Clube clube) {
        System.out.println("Jogadores do clube " + clube.getNome() + ": " + clube.getJogadores());
    }

    public void listarCompeticoes(Clube clube) {
        System.out.println("Competições do clube " + clube.getNome() + ": " + clube.getCompeticoes());
    }
}