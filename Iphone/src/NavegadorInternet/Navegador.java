package NavegadorInternet;

public class Navegador implements NavegadorInternet{
    @Override
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
}
