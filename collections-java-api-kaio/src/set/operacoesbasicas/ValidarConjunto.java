package set.operacoesbasicas;

public class ValidarConjunto {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPilaresPOO = new ConjuntoPalavrasUnicas();

        conjuntoPilaresPOO.exibirPalavrasUnicas();
        System.out.print("\n");
        //Existem 4 pilares do POO, adicionaremos Interface apenas para remove-lo

        conjuntoPilaresPOO.adicionarPalavra("Encapsulamento");
        conjuntoPilaresPOO.adicionarPalavra("Herança");
        conjuntoPilaresPOO.adicionarPalavra("Abstração");
        conjuntoPilaresPOO.adicionarPalavra("Polimorfismo");
        conjuntoPilaresPOO.adicionarPalavra("Interface");


        System.out.println("Conjunto completo: ");
        conjuntoPilaresPOO.exibirPalavrasUnicas();

        System.out.println("\nPalavra removida. Conjunto atualizado: ");
        conjuntoPilaresPOO.removerPalavra("Interface");
        conjuntoPilaresPOO.exibirPalavrasUnicas();

        System.out.println("\nA palavra 'Interface' está no conjunto? " + conjuntoPilaresPOO.verificarPalavra("Interface"));
        System.out.println("A palavra 'Polimorfismo' está no conjunto? " + conjuntoPilaresPOO.verificarPalavra("Polimorfismo"));

    }
}
