import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    UserManager userManager = new UserManager();
    User user;

    public void TelaPrincipal() {

        boolean optionSelected = false;

        while (!optionSelected) {
            int option = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, Escolha uma das opções abaixo:\n" +
                    "1 - Criar conta \n" +
                    "2 - Entrar na conta\n" +
                    "3 - Redefinir Senha\n" +
                    "4 - Sair\n");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Você escolheu a opção: " + option);
                    System.out.println("Abrindo tela 1");
                    CreateAccount();
                    break;

                case 2:
                    System.out.println("Você escolheu a opção: " + option);
                    System.out.println("Abrindo tela 2");
                    login();
                    optionSelected = true;
                    break;

                case 3:
                    System.out.println("Você escolheu a opção: " + option);
                    System.out.println("Abrindo tela 3");
                    ResetPass();
                    break;

                case 4:
                    System.out.println("Você escolheu a opção: " + option);
                    System.out.println("Saindo");
                    System.exit(0);

                default:
                    System.out.println("Escolha uma das opções disponíveis.");
            }
        }

    }

    private void ResetPass() {
        //Será implementada em breve
        System.out.println("Contate sua agência com documento em mãos!");
    }


    public void Account() {
        SetPersonalUsers();
    }

    private void SetPersonalUsers() {

        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;
        String pass = "@minhasenha123";

        user = (new User(numero, agencia, nomeCliente, saldo, pass));
        userManager.addUser(user);

        numero = 1022;
        agencia = "067-8";
        nomeCliente = "Lucius Black";
        saldo = 5327.48;
        pass = "@minhasenha1234";

        user = (new User(numero, agencia, nomeCliente, saldo, pass));

        userManager.addUser(user);

    }

    public void login() {

        boolean logged = false;
        while (!logged) {

            int numeroTemp = 0;
            String agenciaTemp = "";
            String passTemp = "";


            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, digite o número da conta !");
            numeroTemp = scanner.nextInt();

            scanner.nextLine();
            System.out.println("Por favor, digite a Agência !");
            agenciaTemp = scanner.nextLine();

            System.out.println("Por favor, digite a senha !");
            passTemp = scanner.nextLine();

            logged = exists(numeroTemp, agenciaTemp, passTemp);

        }
    }

    public boolean exists(int numeroTemp, String agenciaTemp, String passTemp) {

        User userAtual = userManager.buscarConta(numeroTemp, agenciaTemp, passTemp);

        if (userAtual == null) {
            System.out.println("Dado(s) incorreto(s)\n");
            return false;
        } else {
            System.out.println("\nLogado com sucesso!");
            System.out.println("Olá " + userAtual.getNomeCliente() + ", obrigado por ser nosso cliente, sua agência é " + userAtual.getAgencia() + ", conta " + userAtual.getNumero() + " e seu saldo de R$ " + userAtual.getSaldo() + " já está disponível para saque.");
            return true;
        }
    }


    public String AgenciaRandom() {
        String agencia = "";
        Random random = new Random();
        int agenciaAleatoria = random.nextInt(101);
        int agenciaDigito = random.nextInt(10);

        if (agenciaAleatoria <= 9) {
            agencia = "00" + agenciaAleatoria + "-" + agenciaDigito;
        } else if (agenciaAleatoria <= 99) {
            agencia = "0" + agenciaAleatoria + "-" + agenciaDigito;
        } else {
            agencia = agenciaAleatoria + "-" + agenciaDigito;
        }
        return agencia;
    }

    public int ContaRandom() {

        Random random = new Random();

        return random.nextInt(10001);
    }

    public void CreateAccount() {

        int numero = ContaRandom();
        String agencia = AgenciaRandom();
        String nomeCliente = "";
        double saldo = 0;
        String pass = "";
        String passEquals = "";

        boolean full = false;

        while (!full) {

            System.out.println("Insira os dados a seguir:");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, digite o seu nome completo !");
            nomeCliente = scanner.nextLine().toUpperCase();

            System.out.println("Por favor, crie uma senha!");
            pass = scanner.nextLine();

            System.out.println("Por favor, digite novamente a senha !");
            passEquals = scanner.nextLine();

            if (!passEquals.equals(pass)) {
                System.out.println("As senhas não conhecidem");
            } else {

                if (nomeCliente.isEmpty() || pass.isEmpty()) {
                    System.out.println("Preencha todos os campos");
                } else {
                    user = new User(numero, agencia, nomeCliente, saldo, pass);
                    userManager.addUser(user);
                    System.out.println("Conta Criada com sucesso\n");
                    full = true;
                }
            }
        }
    }

    public void showUsers() {
        userManager.listarUsuarios();

    }

}
