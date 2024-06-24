package pilarespoo;

public class Carro extends Veiculo {//Pilar POO - Herança

	
	//Pilar POO - Encapsulamento
	public void ligar() { 	//Pilar POO - Abstração
		confereCambio();
		confereCombustivel();
		System.out.println("Carro ligado");
	}
	//Pilar POO - Encapsulamento
	private void confereCombustivel() {
		System.out.println("Conferindo combustível");
	}
	private void confereCambio() {
		System.out.println("Conferindo cambio em P");
	}

}
