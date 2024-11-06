//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Seja Bem-Vindo(a)!\n \n");

        //TODO: https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe
        // Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //exibir a  mensagem conta criada

        ContaTerminal contaterminal = new ContaTerminal();

        contaterminal.Account();
        contaterminal.showUsers();

        contaterminal.TelaPrincipal();

    }
}