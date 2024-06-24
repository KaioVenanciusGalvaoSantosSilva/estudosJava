package dispositivo.apps;

import dispositivo.sistema.Reprodutor;

//simboliza o implements de biblioteca nativa do dispositivo para usar no app de terceiros (meu app)
public class ReprodutorMusical implements Reprodutor {
    private String musica;

    @Override
    public void tocar() {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada: " + musica);
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Música selecionada: " + musica);
    }
}
