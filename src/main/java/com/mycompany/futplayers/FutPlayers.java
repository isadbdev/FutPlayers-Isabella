package com.mycompany.futplayers;

import com.mycompany.futplayers.model.Tecnico;

public class FutPlayers {
    public static void main(String[] args) {
        Tecnico t = new Tecnico("Filipe Luís", "Flamengo");
        Jogador j1 = new Jogador("Pedro Guilherme", 27, "Flamengo");
        Jogador j2 = new Jogador("Arrascaeta", 30, "Flamengo");

        Clube clube = new Clube("Flamengo", "BAP", "Filipe Luís");
        Confederacao conf = new Confederacao("CBF", "Ednaldo Rodrigues", "América do Sul");
        Competicao comp = new Competicao("Brasileirão");

        ClubeService clubeService = new ClubeService();
        clubeService.adicionarClube(clube);
        clubeService.listarClubes();

        ConfederacaoService confService = new ConfederacaoService();
        confService.adicionarConfederacao(conf);
        confService.listarConfederacoes();

        System.out.println("Técnico: " + t.getNome() + " Clube: " + t.getClube());
        System.out.println("Jogador: " + j1.nome + " Idade: " + j1.idade);
        System.out.println("Jogador: " + j2.nome + " Idade: " + j2.idade);
        System.out.println("Competição: " + comp.nome);
    }
}