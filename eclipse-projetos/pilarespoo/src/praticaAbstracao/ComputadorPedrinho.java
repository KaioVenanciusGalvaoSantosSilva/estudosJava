package praticaAbstracao;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		MSNMessenger msn = new MSNMessenger();
		System.out.println("MSN:");
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger face = new FacebookMessenger();
		System.out.println("\nFacebook:");
		face.enviarMensagem();
		face.receberMensagem();
		
		Telegram tele = new Telegram();
		System.out.println("\nTelegram:");
		tele.enviarMensagem();
		tele.receberMensagem();
	}

}
