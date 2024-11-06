import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        LocalDate dataAtual = LocalDate.now();
        String dataFormatada = formatDateBr(dataAtual);

        mentoria.setData(dataAtual);

        System.out.println(mentoria);
        //System.out.println(formatDateBr(mentoria.getData()));

        Conteudo conteudo1 = new Curso();//POLIMORFISMO
        Conteudo conteudo2 = new Mentoria();//POLIMORFISMO

        System.out.println("CONTEUDO: "+conteudo1);

    }

    public static String formatDateBr(LocalDate dataAtual){

        // Definindo o formato brasileiro
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formatando a data
        return dataAtual.format(formatoBrasileiro);
    }
}