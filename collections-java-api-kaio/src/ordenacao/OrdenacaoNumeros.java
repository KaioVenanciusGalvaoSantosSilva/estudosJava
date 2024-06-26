package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {

        this.integerList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numeroAscendente = new ArrayList<>(this.integerList);
        if (!integerList.isEmpty()) {
            Collections.sort(numeroAscendente);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        return numeroAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numeroAscendente = new ArrayList<>(this.integerList);
        if (!integerList.isEmpty()) {
            numeroAscendente.sort(Collections.reverseOrder());
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        return numeroAscendente;
    }

    public void exibirNumeros() {

        if (!integerList.isEmpty()) {
            System.out.println(this.integerList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
