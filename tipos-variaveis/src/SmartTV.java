public class SmartTV {
    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTV() {
        this.ligada = false;
        this.canal = 1;
        this.volume = 10;
    }

    public void ligarDesligar() {
        this.ligada = !this.ligada;
        String estado = this.ligada ? "ligada" : "desligada";
        System.out.println("A TV está " + estado + ".");
    }

    public void aumentarVolume() {
        if (this.ligada) {
            if (this.volume < 100) { // Supondo que o volume máximo seja 100
                this.volume++;
            }
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void diminuirVolume() {
        if (this.ligada) {
            if (this.volume > 0) { // Supondo que o volume mínimo seja 0
                this.volume--;
            }
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (this.ligada) {
            this.canal = novoCanal;
            System.out.println("Canal: " + this.canal);
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void aumentarCanal() {
        if (this.ligada) {
            this.canal++;
            System.out.println("Canal: " + this.canal);
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void diminuirCanal() {
        if (this.ligada) {
            if (this.canal > 1) {
                this.canal--;
            }
            System.out.println("Canal: " + this.canal);
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        tv.ligarDesligar();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.mudarCanal(5);
        tv.aumentarCanal();
        tv.diminuirCanal();
        tv.ligarDesligar();
    }
}
