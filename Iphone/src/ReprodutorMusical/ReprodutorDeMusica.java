package ReprodutorMusical;

public class ReprodutorDeMusica implements ReprodutorMusical{
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
