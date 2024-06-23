public class Operadores {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String nomeCompleto = "Linguagem " + "JAVA";
        System.out.println(nomeCompleto);
                
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

    }

}
