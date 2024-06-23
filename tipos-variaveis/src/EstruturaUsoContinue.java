public class EstruturaUsoContinue {
    public static void main(String[] args) {
        /*
         * while (condição) {
         * // Algum código...
         * if (condição_para_pular) {
         * continue;
         * }
         * // Mais código...
         * }
         */

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Pula a impressão de números pares
            }
            System.out.print(i + " ");
        }
        System.out.println("\nLoop encerrado.");
    }
}
