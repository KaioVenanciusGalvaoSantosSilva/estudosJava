// Arquivo: CalculoSalarialKt.kt

import java.util.Scanner

fun main() {
    val leitorDeEntradas = Scanner(System.`in`)

    print("Digite o salário: ")
    val valorSalario = leitorDeEntradas.nextFloat()

    print("Digite o benefício: ")
    val valorBeneficio = leitorDeEntradas.nextFloat()

    var valorImposto = 0f

    when {
        valorSalario >= 0 && valorSalario <= 1100 -> {
            valorImposto = 0.05f * valorSalario
        }
        valorSalario > 1100 && valorSalario <= 2500 -> {
            valorImposto = 0.10f * valorSalario
        }
        valorSalario > 2500 -> {
            valorImposto = 0.15f * valorSalario
        }
    }

    val saida = valorSalario - valorImposto + valorBeneficio

    println("O salário líquido é: %.2f".format(saida))

    leitorDeEntradas.close()
}
