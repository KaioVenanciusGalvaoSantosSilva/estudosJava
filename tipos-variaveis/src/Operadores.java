public class Operadores {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //Concatenação
        String nomeCompleto = "Linguagem " + "JAVA";
        System.out.println(nomeCompleto);

        //Operadores aritméticos + - * / % ()
                
        //qual o resultado das expressoes abaixo?
        //Debug para melhor compreensão F10 para rodar linha a linha 
        String concatenacao ="?"; //break point para debug aqui
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);


        //Operador unário + ++ - -- !
        int numero =5;
        numero = -numero;
        System.out.println(numero);

        numero++;//incremento

        System.out.println(numero);

        System.out.println(--numero);//decremento

        boolean variavel = true;
        System.out.println(!variavel); //negação

        
        //Operador ternário

        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);


    }

}
