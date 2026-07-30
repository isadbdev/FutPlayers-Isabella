package com.mycompany.futplayers.service;

import com.mycompany.futplayers.model.*;

public class ConfederacaoService {

    public Confederacao criarConfederacao(String nome, String pais, String continente, String presidente) {
        return new Confederacao(nome, pais, continente, presidente);
    }

    public Competicao criarCompeticao(Confederacao confederacao, String nome) {
        Competicao competicao = new Competicao(nome, confederacao);
        confederacao.adicionarCompeticao(competicao);
        return competicao;
    }

    public void inscreverClubeEmCompeticao(Clube clube, Competicao competicao) {
        competicao.adicionarClube(clube);
    }

    public void removerCompeticao(Confederacao confederacao, Competicao competicao) {
        confederacao.removerCompeticao(competicao);
    }

    public void listarCompeticoes(Confederacao confederacao) {
        System.out.println("Competições da confederação " + confederacao.getNome() + ": " + confederacao.getCompeticoesOrganizadas());
    }
}