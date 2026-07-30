package com.mycompany.futplayers;

import com.mycompany.futplayers.model.Tecnico;
import com.mycompany.futplayers.model.Jogador;
import com.mycompany.futplayers.model.Clube;
import com.mycompany.futplayers.model.Confederacao;
import com.mycompany.futplayers.service.ClubeService;
import com.mycompany.futplayers.service.ConfederacaoService;

public class FutPlayers {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico("Filipe Luís", "Flamengo");
        Jogador j1 = new Jogador("Pedro Guilherme", 27, "Flamengo", 80.0, "Brasil");
        Jogador j2 = new Jogador("Arrascaeta", 30, "Flamengo", 72.0, "Uruguai");

        Clube clube = new Clube("Flamengo", "BAP", "Filipe Luís");
        Confederacao conf = new Confederacao("CBF", "Ednaldo Rodrigues", "América do Sul");
        Competicao comp = new Competicao("Brasileirão");

        ClubeService clubeService = new ClubeService();
        ConfederacaoService confService = new ConfederacaoService();

        clubeService.adicionarClube(clube);
        System.out.println("\n--- Lista de Clubes ---");
        clubeService.listarClubes();

        clubeService.removerClube(clube);
        System.out.println("\n--- Lista de Clubes após remoção ---");
        clubeService.listarClubes();

        confService.adicionarConfederacao(conf);
        System.out.println("\n--- Lista de Confederações ---");
        confService.listarConfederacoes();

        confService.removerConfederacao(conf);
        System.out.println("\n--- Lista de Confederações após remoção ---");
        confService.listarConfederacoes();

        System.out.println("\n---Informações Gerais ---");
        System.out.println("Técnico: " + tecnico.getNome() + " | Clube: " + tecnico.getClube());
        System.out.println("Jogador: " + j1.getNome() + " | Idade: " + j1.getIdade() + " | Peso: " + j1.getPeso() + " | Nacionalidade: " + j1.getNacionalidade());
        System.out.println("Jogador: " + j2.getNome() + " | Idade: " + j2.getIdade() + " | Peso: " + j2.getPeso() + " | Nacionalidade: " + j2.getNacionalidade());
        System.out.println("Competição: " + comp.nome);
    }
}
