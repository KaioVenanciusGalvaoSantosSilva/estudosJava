package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private final List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;

        if (!numerosList.isEmpty()) {
            for (Integer numero : numerosList) {
                soma = soma + numero;
            }
        } else {
            return 0;
        }

        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;

        if (!numerosList.isEmpty()) {
            maiorNumero = numerosList.getFirst();

            for (Integer numero : numerosList) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }

            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = 0;

        if (!numerosList.isEmpty()) {
            menorNumero = numerosList.getFirst();

            for (Integer numero : numerosList) {

                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {

        if (numerosList.isEmpty()) {
            System.out.println("A lista está vazia!");
        }
        return numerosList;
    }

}
