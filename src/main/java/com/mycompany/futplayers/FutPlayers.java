package com.mycompany.futplayers;

import com.mycompany.futplayers.model.Tecnico;
import com.mycompany.futplayers.model.Jogador;
import com.mycompany.futplayers.model.Confederacao;

public class FutPlayers {
    public static void main(String[] args) {
        Tecnico t = new Tecnico("Filipe Luís", "Flamengo");
        Jogador j1 = new Jogador("Pedro Guilherme", 27, "Flamengo", 80.0, "Brasil");
        Jogador j2 = new Jogador("Arrascaeta", 30, "Flamengo", 72.0, "Uruguai");

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
        System.out.println("Jogador: " + j1.getNome() + " Idade: " + j1.getIdade() + " Peso: " + j1.getPeso() + " Nacionalidade: " + j1.getNacionalidade());
        System.out.println("Jogador: " + j2.getNome() + " Idade: " + j2.getIdade() + " Peso: " + j2.getPeso() + " Nacionalidade: " + j2.getNacionalidade());
        System.out.println("Competição: " + comp.nome);
    }
}