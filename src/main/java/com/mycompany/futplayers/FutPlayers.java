package com.mycompany.futplayers;

import com.mycompany.futplayers.model.*;
import com.mycompany.futplayers.service.*;

public class FutPlayers {

    public static void main(String[] args) {
        ClubeService clubeService = new ClubeService();
        ConfederacaoService confederacaoService = new ConfederacaoService();

        Tecnico tecnico = new Tecnico("Filipe Luís", 39);
        Clube flamengo = clubeService.criarClube("Flamengo", "BAP", tecnico);

        Jogador j1 = new Jogador("Pedro Guilherme", 27, 1.85, 80, "Brasil");
        Jogador j2 = new Jogador("Giorgian de Arrascaeta", 30, 1.76, 72, "Uruguai");

        clubeService.adicionarJogador(flamengo, j1);
        clubeService.adicionarJogador(flamengo, j2);

        Confederacao cbf = confederacaoService.criarConfederacao("CBF", "Brasil", "América do Sul", "Ednaldo Rodrigues");
        Competicao brasileirao = confederacaoService.criarCompeticao(cbf, "Brasileirão");

        confederacaoService.inscreverClubeEmCompeticao(flamengo, brasileirao);

        System.out.println("=== TESTE SISTEMA FUTPLAYERS ===");
        System.out.println(flamengo);
        clubeService.listarJogadores(flamengo);
        clubeService.listarCompeticoes(flamengo);
        System.out.println(cbf);
        confederacaoService.listarCompeticoes(cbf);

        clubeService.removerJogador(flamengo, j1);
        System.out.println("Após remover Pedro Guilherme:");
        clubeService.listarJogadores(flamengo);
    }
}