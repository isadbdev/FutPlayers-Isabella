package com.mycompany.futplayers.service;

import com.mycompany.futplayers.model.Confederacao;
import java.util.ArrayList;
import java.util.List;

public class ConfederacaoService {
    private List<Confederacao> confederacoes = new ArrayList<>();

    public void adicionarConfederacao(Confederacao confederacao) {
        confederacoes.add(confederacao);
    }

    public void removerConfederacao(Confederacao confederacao) {
        confederacoes.remove(confederacao);
    }

    public void listarConfederacoes() {
        for (Confederacao conf : confederacoes) {
            System.out.println("Confederação: " + conf.getNome() +
                               " | Presidente: " + conf.getPresidente() +
                               " | Continente: " + conf.getContinente());
        }
    }
}