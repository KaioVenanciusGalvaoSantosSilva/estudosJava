# Desafio Cálculo Salarial com Python

def main():
    # Solicita o salário ao usuário
    valor_salario = float(input("Digite o salário: "))
    
    # Solicita o benefício ao usuário
    valor_beneficio = float(input("Digite o benefício: "))

    valor_imposto = 0.0

    # Calcula o imposto com base nas faixas salariais
    if valor_salario >= 0 and valor_salario <= 1100:
        valor_imposto = 0.05 * valor_salario
    elif valor_salario > 1100 and valor_salario <= 2500:
        valor_imposto = 0.10 * valor_salario
    elif valor_salario > 2500:
        valor_imposto = 0.15 * valor_salario

    # Calcula o salário líquido
    saida = valor_salario - valor_imposto + valor_beneficio

    # Imprime a saída formatada com duas casas decimais
    print(f"O salário líquido é: {saida:.2f}")

if __name__ == "__main__":
    main()
