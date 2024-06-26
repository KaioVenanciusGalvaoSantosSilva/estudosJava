package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private final Set<Tarefa> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        if (!listaTarefa.isEmpty()) {
            for (Tarefa t : listaTarefa) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover = t;
                    break;
                }
            }
            listaTarefa.remove(tarefaRemover);
        } else {
            System.out.println("O conjunto esta vazio!");
        }
        if (tarefaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {

        if (!listaTarefa.isEmpty()) {
            System.out.println(listaTarefa);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void contarTarefas() {

        System.out.println("O número total de tarefas na lista de tarefas é de " + listaTarefa.size() + " tarefa(s)");
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if (!listaTarefa.isEmpty()) {
            for (Tarefa t : listaTarefa) {
                if (t.isConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            System.out.println("Nenhuma Tarefa foi concluída!");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if (!listaTarefa.isEmpty()) {
            for (Tarefa t : listaTarefa) {
                if (!t.isConcluida()) {
                    tarefasPendentes.add(t);
                }
            }
        } else {
            System.out.println("Nenhuma Tarefa foi pendente!");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        Set<Tarefa> tarefaConcluida = new HashSet<>();

        if (!listaTarefa.isEmpty()) {
            for (Tarefa t : listaTarefa) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(true);
                }
            }
        } else {
            System.out.println("Nenhuma Tarefa encontrada!");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Set<Tarefa> tarefaPendente = new HashSet<>();

        if (!listaTarefa.isEmpty()) {
            for (Tarefa t : listaTarefa) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(false);
                }
            }
        } else {
            System.out.println("Nenhuma Tarefa encontrada!");
        }
    }

    public void limparListaTarefas() {


        if (!listaTarefa.isEmpty()) {
            listaTarefa.clear();
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
