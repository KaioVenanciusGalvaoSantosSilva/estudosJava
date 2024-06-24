package dispositivo.apps;

import dispositivo.sistema.Navegavel;

//simboliza o implements de biblioteca nativa do dispositivo para usar no app de terceiros (meu app)
public class NavegadorInternet implements Navegavel {

    private String url;

    @Override
    public void exibirPagina(String url) {
        this.url = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: " + url);
    }
}
