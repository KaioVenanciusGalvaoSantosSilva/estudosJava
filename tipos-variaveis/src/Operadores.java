public class Operadores {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Concatenação
        String nomeCompleto = "Linguagem " + "JAVA";
        System.out.println(nomeCompleto);

        // Operadores aritméticos + - * / % ()

        // qual o resultado das expressoes abaixo?
        // Debug para melhor compreensão F10 para rodar linha a linha
        String concatenacao = "?"; // break point para debug aqui
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // Operador unário + ++ - -- !
        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        numero++;// incremento

        System.out.println(numero);

        System.out.println(--numero);// decremento

        boolean variavel = true;
        System.out.println(!variavel); // negação

        // Operador ternário

        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado);

        // Operador relacional
        // == Quando desejamos verificar se uma variável é IGUAL A outra.

        // != Quando desejamos verificar se uma variável é DIFERENTE da outra.

        // > Quando desejamos verificar se uma variável é MAIOR QUE a outra.

        // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

        // < Quando desejamos verificar se uma variável é MENOR QUE outra.

        // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");

        String nome1 = "Jose";
        String nome2 = "Jose";

        System.out.println(nome1.equals(nome2)); // correto para comparação de strings
        

        // Operadores lógicos
        boolean condicao1 = true;

        boolean condicao2 = false;

        /*
         * Aqui estamos utilizando o operador lógico E para fazer a união de duas
         * expressões.
         * É como se estivesse escrito:
         * "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
         */

        if (condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");
        ;

        // Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

    }

}
