package praticaPolimorfismo;

import java.util.Scanner;

import praticaPolimorfismo.apps.FacebookMessenger;
import praticaPolimorfismo.apps.MSNMessenger;
import praticaPolimorfismo.apps.ServicoMensagemInstantanea;
import praticaPolimorfismo.apps.Telegram;

public class ComputadorPedrinho {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		do {
		Scanner scanner = new Scanner(System.in);
		//String appEscolhido="facebook"; 
		// ---------------
		//Solicitar ao usuario para digitar
		System.out.println("Digite abaixo o appEscolhido:\n"
				+ "msn\n"
				+ "facebook\n"
				+ "telegram \n:");
		String appEscolhido=scanner.nextLine(); 
		// ---------------
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("facebook"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("telegram"))
			smi = new Telegram();
		else
			System.out.println("------App inválido------\n");
		
		if(smi!=null) {	
			smi.enviarMensagem();
			smi.receberMensagem();
		}
		
		}while(smi==null);//loop até que digite o app correto
	}
}