package list.operacoesbasicas;

public class Item {
    //Classe para construir os itens do carrinho
    //Pacote retificado
    final private String nome;
    final private double preco;
    final private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" + "nome='" + nome + '\'' + ", preco=" + preco + ", quantidade=" + quantidade + "}";
    }
}
