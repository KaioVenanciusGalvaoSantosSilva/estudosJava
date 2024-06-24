package praticaHeranca;

public class ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();//implementado no metodo - Encapsulamento
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem(); //implementado no metodo - Encapsulamento
	}
	public void receberMensagem() {
		validarConectadoInternet();//implementado no metodo - Encapsulamento
		System.out.println("Recebendo mensagem");
		salvarHistoricoMensagem();//implementado no metodo - Encapsulamento
	}
	//tornam-se metodos privados - Encapsulamento
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
	//tornam-se metodos privados - Encapsulamento
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
