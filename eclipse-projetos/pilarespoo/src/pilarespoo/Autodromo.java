package pilarespoo;

public class Autodromo {
	
	public static void main(String[] args) {
		
		Carro jeep = new Carro();
		jeep.setChassi("123456");//Pilar POO - Herança

		//jeep.confereCambio();
		//jeep.confereCombustivel();
		jeep.ligar(); //Pilar POO - Abstração e Polimorfismo
		
		Moto z400 = new Moto();
		z400.setChassi("234566");//Pilar POO - Herança
		z400.ligar(); //Pilar POO - Abstração e Polimorfismo
		//Polimorfismo pois temos 2 formas de ligar.
		
		//Classe genérica
		Veiculo coringa = z400;//Pilar POO - Abstração e Polimorfism
		coringa.ligar();
			
	}

}
