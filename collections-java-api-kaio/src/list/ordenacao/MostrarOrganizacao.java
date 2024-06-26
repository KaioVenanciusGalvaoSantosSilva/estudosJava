package list.ordenacao;

public class MostrarOrganizacao {

    public static void main(String[] args) {
        //Pacote retificado
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(11);

        System.out.println("Os números presentes na lista são:");
        ordenacaoNumeros.exibirNumeros();
        System.out.println("\n");

        System.out.println("Os números em ordem decrescente são: " + ordenacaoNumeros.ordenarDescendente());
        System.out.println("Os números em ordem crescente são: " + ordenacaoNumeros.ordenarAscendente());

    }
}
