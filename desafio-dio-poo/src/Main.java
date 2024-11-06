import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

//        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

//        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        LocalDate dataAtual = LocalDate.now();
        String dataFormatada = formatDateBr(dataAtual);

        mentoria.setData(dataAtual);

//        System.out.println(mentoria);
        //System.out.println(formatDateBr(mentoria.getData()));

        Conteudo conteudo1 = new Curso();//POLIMORFISMO
        Conteudo conteudo2 = new Mentoria();//POLIMORFISMO

//        System.out.println("CONTEUDO: "+conteudo1);

        Bootcamp bootcampJava2024 = new Bootcamp();
        bootcampJava2024.setNome("BootCamp Java Developer 2024");
        bootcampJava2024.setDescricacao("Descrição do BootCamp Java Developer 2024");
        bootcampJava2024.getConteudos().add(curso1);
        bootcampJava2024.getConteudos().add(curso2);
        bootcampJava2024.getConteudos().add(mentoria);

        Dev devKaio = new Dev();
        devKaio.setNome("Kaio");
        devKaio.inscreverBootcamp(bootcampJava2024);
        devKaio.progredir();//Ao progredir os cursos inscritos são concluidos (remove de inscritos e insere no concluido
        devKaio.progredir();


        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcampJava2024);
        devLucas.progredir();

        System.out.println("\n");
        System.out.println("Desenvolvedor: " + devKaio.getNome());
        System.out.println("Conteúdos Inscritos: " + devKaio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devKaio.getConteudosConcluidos());
        System.out.println("XP: " + devKaio.calcularXp());
        System.out.println("\n");

        System.out.println("Desenvolvedor: " + devLucas.getNome());
        System.out.println("Conteúdos Inscritos: " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularXp());
    }

    public static String formatDateBr(LocalDate dataAtual) {

        // Definindo o formato brasileiro
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formatando a data
        return dataAtual.format(formatoBrasileiro);
    }
}