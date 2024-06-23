function calculoSalarialJs() {
    // Desafio Cálculo Salarial com JavaScript
    const readline = require('readline');
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question('Digite o salário: ', (valorSalario) => {
        rl.question('Digite o benefício: ', (valorBeneficio) => {
            valorSalario = parseFloat(valorSalario);
            valorBeneficio = parseFloat(valorBeneficio);

            let valorImposto = 0;

            if (valorSalario >= 0 && valorSalario <= 1100) {
                valorImposto = 0.05 * valorSalario;
            } else if (valorSalario > 1100 && valorSalario <= 2500) {
                valorImposto = 0.10 * valorSalario;
            } else if (valorSalario > 2500) {
                valorImposto = 0.15 * valorSalario;
            }

            // Calcula o salário líquido
            let saida = valorSalario - valorImposto + valorBeneficio;

            // Imprime a saída formatada com duas casas decimais
            console.log(saida.toFixed(2));

            rl.close();
        });
    });
}

calculoSalarialJs();
