public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        //<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
        short numeroCurto = 2;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // casting

        int age; // Tipo "int", nome "idade", com nenhum valor atribuído.
        int anoFabricacao = 2021; // tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2500.33; // o . deve ser representado para casas decimais
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser String
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser String
        float pi = 3.14F;
        double salario = 1275.33;

    }
}
