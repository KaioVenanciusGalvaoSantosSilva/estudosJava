package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private final Set<Aluno> listAlunos;

    public GerenciadorAlunos() {
        this.listAlunos = new HashSet<>();
        //Caso use TreeSet irá ignorar a chave primária/hash permitindo que o usuario crie 2 individuos com a mesma matricula
        //Lembre-se sempre de implementar o Equals and HashCode no Objeto que passará na Lista ou Conjunto
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        listAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!listAlunos.isEmpty()) {
            for (Aluno a : listAlunos) {
                if (a.getMatricula() == matricula) {

                    alunoParaRemover = a;
                    System.out.println("Matricula " + matricula + " foi removida.");
                    break;
                }
            }
            listAlunos.remove(alunoParaRemover);
        } else {
            System.out.println("Lista vazia.");
        }
        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(listAlunos);
        if (!listAlunos.isEmpty()) {
            return alunoPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!listAlunos.isEmpty()) {
            alunoPorNota.addAll(listAlunos);
            return alunoPorNota;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirAlunos() {
        if (!listAlunos.isEmpty()) {
            for (Aluno aluno : listAlunos) {
                System.out.println(aluno);
            }
        } else {
            System.out.println("Lista de alunos está vazia.");
        }
    }
}
