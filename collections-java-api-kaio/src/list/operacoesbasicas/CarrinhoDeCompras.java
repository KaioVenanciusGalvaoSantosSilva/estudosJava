package list.operacoesbasicas;//Desafio 2. Carrinho de Compras: Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras
//online. O carrinho deve ser implementado
// como uma lista de itens. Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade.
//
// Implemente os seguintes métodos:
//
//adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
//removerItem(String nome): Remove um item do carrinho com base no seu nome.
//calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
//exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.*/

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    final private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {

        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
        System.out.println(quantidade + " item(s) " + nome + " no preço R$" + preco + " foi adicionado");
    }

    public void removerItem(String nome) {
        List<Item> removerItem = new ArrayList<>();

        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                removerItem.add(i);
            }
        }
        itemList.removeAll(removerItem);
    }

    public void calcularValorTotal() {

        double valorTotal = 0.00;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal = valorTotal + valorItem;

            }
            System.out.println("\nO carrinho está no valor de :R$ " + valorTotal);
        } else {
            //throw new RuntimeException("A lista está vazia!");
            System.out.println("\nO carrinho está no valor de :R$ " + valorTotal);
        }
    }

    public void exibirItens() {

        if (itemList.isEmpty()) {
            System.out.println("A lista esta vazia!");
        } else {
            System.out.println(itemList);
        }

    }


}
