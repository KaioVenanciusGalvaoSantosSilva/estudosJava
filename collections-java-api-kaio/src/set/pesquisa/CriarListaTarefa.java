package set.pesquisa;

public class CriarListaTarefa {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tirar o lixo");
        listaTarefas.adicionarTarefa("Lavar o carro");
        listaTarefas.adicionarTarefa("Comprar BTC");
        listaTarefas.adicionarTarefa("Encontrar com amigos");

        listaTarefas.contarTarefas();
        listaTarefas.removerTarefa("Lavar o carro");
        listaTarefas.exibirTarefas();
        listaTarefas.marcarTarefaConcluida("Comprar BTC");
        listaTarefas.obterTarefasConcluidas();
        listaTarefas.exibirTarefas();
        listaTarefas.obterTarefasPendentes();


        listaTarefas.marcarTarefaPendente("Comprar BTC");
        listaTarefas.exibirTarefas();
        listaTarefas.limparListaTarefas();

    }
}
