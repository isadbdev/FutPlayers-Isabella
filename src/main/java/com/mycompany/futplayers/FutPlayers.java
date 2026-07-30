package com.mycompany.futplayers;

public class FutPlayers {
    public static void main(String[] args) {
        Tecnico t = new Tecnico("Filipe Luís", "Flamengo");
        Jogador j1 = new Jogador("Pedro Guilherme", 27, "Flamengo");
        Jogador j2 = new Jogador("Arrascaeta", 30, "Flamengo");

        Clube clube = new Clube("Flamengo", "BAP", "Filipe Luís");
        Confederacao conf = new Confederacao("CBF", "Ednaldo Rodrigues", "América do Sul");
        Competicao comp = new Competicao("Brasileirão");

        System.out.println("Técnico: " + t.nome + " Clube: " + t.clube);
        System.out.println("Jogador: " + j1.nome + " Idade: " + j1.idade);
        System.out.println("Jogador: " + j2.nome + " Idade: " + j2.idade);
        System.out.println("Clube: " + clube.nome + " Presidente: " + clube.presidente + " Técnico: " + clube.tecnico);
        System.out.println("Confederação: " + conf.nome + " Presidente: " + conf.presidente + " Continente: " + conf.continente);
        System.out.println("Competição: " + comp.nome);
    }
}
