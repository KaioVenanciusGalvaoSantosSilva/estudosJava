package praticaAbstracao;

public class Telegram extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem do Telegram");

	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem do Telegram");
	}
	
	

}
