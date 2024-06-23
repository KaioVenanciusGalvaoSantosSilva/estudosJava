public class EstruturaDecisaoSwitchCase {

public static void main(String[] args) {
    //Estrutura de decisão switch case


        //switch (expressão) {
            //case valor1:
                // Bloco de código a ser executado se expressão == valor1
                //break;
            //case valor2:
                // Bloco de código a ser executado se expressão == valor2
                //break;
            // mais casos...
            //default:
                // Bloco de código a ser executado se nenhum dos casos acima for verdadeiro
        //}

        //Exemplo:

            int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            // mais casos...
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
