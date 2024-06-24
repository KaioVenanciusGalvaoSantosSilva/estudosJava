package pilarespoo;

public abstract class Veiculo { //Pilar POO - Abstração
	
	//Pilar POO - Herança

	private String chassi;

	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public abstract void ligar();//Pilar POO - Abstração
}
