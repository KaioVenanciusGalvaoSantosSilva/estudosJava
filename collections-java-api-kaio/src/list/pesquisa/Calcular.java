package list.pesquisa;

public class Calcular {
    public static void main(String[] args) {
        //Pacote retificado
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(-10);
        somaNumeros.adicionarNumero(19);

        System.out.println("A soma número da soma é: " + somaNumeros.calcularSoma());
        System.out.println("O maior número da soma é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número da soma é: " + somaNumeros.encontrarMenorNumero());
        System.out.println("A lista é composta por: " + somaNumeros.exibirNumeros());
    }
}
