using System;

public class CalculoSalarialC
{
    public static void Main(string[] args)
    {
        // Desafio Cálculo Salarial com C#
        Console.WriteLine("Digite o salário: ");
        float valorSalario = float.Parse(Console.ReadLine());

        Console.WriteLine("Digite o benefício: ");
        float valorBeneficio = float.Parse(Console.ReadLine());

        float valorImposto = 0;

        if (valorSalario >= 0 && valorSalario <= 1100)
        {
            valorImposto = 0.05F * valorSalario;
        }
        else if (valorSalario > 1100 && valorSalario <= 2500)
        {
            valorImposto = 0.10F * valorSalario;
        }
        else if (valorSalario > 2500)
        {
            valorImposto = 0.15F * valorSalario;
        }

        // Calcula o salário líquido
        float saida = valorSalario - valorImposto + valorBeneficio;

        // Imprime a saída formatada com duas casas decimais
        Console.WriteLine(saida.ToString("0.00"));

        // Aguarda o usuário pressionar uma tecla antes de fechar o console
        Console.ReadKey();
    }
}
