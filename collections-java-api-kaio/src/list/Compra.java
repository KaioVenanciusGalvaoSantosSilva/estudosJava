package list;

public class Compra {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();

        carrinhoDeCompras.adicionarItem("God of War", 250.00,2);
        carrinhoDeCompras.adicionarItem("God of War 2", 100.00,5);

        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.exibirItens();
    }
}
