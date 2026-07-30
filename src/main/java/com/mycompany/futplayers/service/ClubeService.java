package com.mycompany.futplayers;

import java.util.ArrayList;

public class ClubeService {
    public ArrayList<Clube> clubes = new ArrayList<>();

    public void adicionarClube(Clube c) {
        clubes.add(c);
    }

    public void listarClubes() {
        for (Clube c : clubes) {
            System.out.println("Clube: " + c.nome + " Presidente: " + c.presidente + " Técnico: " + c.tecnico);
        }
    }
}
