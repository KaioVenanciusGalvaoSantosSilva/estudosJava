public class EstruturaUsoBreak {
    public static void main(String[] args) {
        //Break
        //switch (expressão) {
        //    case valor1:
                // Código para o caso valor1
        //        break;
        //    case valor2:
                // Código para o caso valor2
        //        break;
            // Mais casos...
        //    default:
                // Código para o caso padrão
         //       break;
        //}

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break; // Interrompe o loop quando i for igual a 5
            }
        }
        System.out.println("\nLoop encerrado.");
         
        
    }

}
