package set.ordenacao;

public class ListaDeAlunos {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Ana", 3L, 8.2);
        gerenciadorAlunos.adicionarAluno("Bruna", 4L, 9.2);
        gerenciadorAlunos.adicionarAluno("Agatha", 3L, 5.2);
        gerenciadorAlunos.adicionarAluno("Laura", 2L, 7.2);
        gerenciadorAlunos.adicionarAluno("José", 1L, 10.0);

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(4);
        gerenciadorAlunos.exibirAlunos();

        System.out.println("Alunos por nome (A-Z):      " + gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("Alunos por nota crescente:  " + gerenciadorAlunos.exibirAlunosPorNota());
    }
}
