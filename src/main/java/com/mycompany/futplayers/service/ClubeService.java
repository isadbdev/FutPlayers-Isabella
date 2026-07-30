package com.mycompany.futplayers.service;

import com.mycompany.futplayers.model.Clube;
import java.util.ArrayList;
import java.util.List;

public class ClubeService {
    private List<Clube> clubes = new ArrayList<>();

    public void adicionarClube(Clube clube) {
        clubes.add(clube);
    }

    public void removerClube(Clube clube) {
        clubes.remove(clube);
    }

    public void listarClubes() {
        for (Clube c : clubes) {
            System.out.println("Clube: " + c.getNome() +
                               " | Sigla: " + c.getSigla() +
                               " | Técnico: " + c.getTecnico());
        }
    }
}
