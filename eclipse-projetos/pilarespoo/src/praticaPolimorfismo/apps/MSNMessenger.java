package praticaPolimorfismo.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem do MSN");
		
	}

	@Override
	public void receberMensagem() {
		validarConectadoInternet();

		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem do MSN");

	}
	
	@Override
	public void salvarHistoricoMensagem() {
		validarConectadoInternet();

		// TODO Auto-generated method stub
		System.out.println("Salvando o histórico da mensagem");
	}
	
}
