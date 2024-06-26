package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavraUnicaSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraUnicaSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraUnicaSet.add(palavra);
    }

    public void removerPalavra(String palavra) {

        if (!palavraUnicaSet.isEmpty()) {
            if (palavraUnicaSet.contains(palavra)) {
                palavraUnicaSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada!");
            }
        } else {
            System.out.println("Conjunto vazio");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavraUnicaSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavraUnicaSet.isEmpty()) {
            System.out.println(palavraUnicaSet);
        } else {
            System.out.println("Conjunto vazio");
        }
    }

}
