package praticaPolimorfismo.apps;

public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//mais um método que todos os filhos deverão implementar
	public abstract void salvarHistoricoMensagem();
		
	//tornam-se metodos protected - Polimorfismo
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
		
}
