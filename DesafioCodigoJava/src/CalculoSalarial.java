import java.util.Scanner;

public class CalculoSalarial {
    public static void main(String[] args)   {
        //Desafio Calculo Salarial com Java
        Scanner leitorDeEntradas = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        float valorSalario = leitorDeEntradas.nextFloat();
        System.out.print("Digite o benefício: ");
        float valorBeneficio = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if(valorImposto >= 0 && valorSalario <= 1100){
            //Atribuiu a aliquopta de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        }
        //TODO Criar as demais condições para aliquotas de 10% e de 15%
        else if(valorSalario > 1100 && valorSalario <= 2500){
            valorImposto = 0.10F * valorSalario;
        }
        else if(valorSalario > 2500){
            valorImposto = 0.15F * valorSalario;
        }

        // Calcula e imprime a Saída ( com 2 casas decimais):
        float saida = valorSalario - valorImposto +valorBeneficio;
        System.out.println(String.format("%.2f", saida));

        leitorDeEntradas.close();
    }
}
