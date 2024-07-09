package Iphone;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada");
    }

    @Override
    public void rejeitarChamada() {
        System.out.println("Chamada rejeitada");

    }

    public void abrirNavegador() {
        System.out.println("Abrindo navegador");
    }

    @Override
    public void abrirPaginaInicial() {
        System.out.println("Abrindo pagina inicial");
    }

    @Override
    public void verificarInternet() {
        System.out.println("Verificando conexao com a internet");
    }

    @Override
    public void adiantarMusica() {
        System.out.println("Adiantando musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada");
    }

    @Override
    public void pularFaixa() {
        System.out.println("Tocando proxima musica");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo musica");
    }

    @Override
    public void voltarFaixa() {
        System.out.println("Reproduzindo musica anterior");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Voltando musica");
    }


}

