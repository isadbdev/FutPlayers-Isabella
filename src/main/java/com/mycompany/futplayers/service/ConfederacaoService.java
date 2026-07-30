package com.mycompany.futplayers;

import java.util.ArrayList;

public class ConfederacaoService {
    public ArrayList<Confederacao> confederacoes = new ArrayList<>();

    public void adicionarConfederacao(Confederacao c) {
        confederacoes.add(c);
    }

    public void listarConfederacoes() {
        for (Confederacao c : confederacoes) {
            System.out.println("Confederação: " + c.nome + " Presidente: " + c.presidente + " Continente: " + c.continente);
        }
    }
}
