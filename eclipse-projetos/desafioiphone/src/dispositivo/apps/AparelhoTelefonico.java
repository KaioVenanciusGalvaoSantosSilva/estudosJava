package dispositivo.apps;

import dispositivo.sistema.Telefonia;

//simboliza o implements de biblioteca nativa do dispositivo para usar no app de terceiros (meu app)
public class AparelhoTelefonico implements Telefonia {
    private String numero;

    @Override
    public void ligar(String numero) {
        this.numero = numero;
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
    public void desligar() {
        System.out.println("Encerrando chamada");

    }
}
