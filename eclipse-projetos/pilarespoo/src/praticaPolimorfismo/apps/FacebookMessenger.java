package praticaPolimorfismo.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();

		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem do Facebook");
	}

	@Override
	public void receberMensagem() {
		validarConectadoInternet();

		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem do Facebook");
	}
	@Override
	public void salvarHistoricoMensagem() {
		validarConectadoInternet();

		// TODO Auto-generated method stub
		System.out.println("Salvando o histórico da mensagem");
	}
}
