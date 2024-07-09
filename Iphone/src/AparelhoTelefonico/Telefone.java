package AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{

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
}
