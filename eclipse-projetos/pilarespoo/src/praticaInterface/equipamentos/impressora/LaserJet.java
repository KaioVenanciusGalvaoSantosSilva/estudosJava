package praticaInterface.equipamentos.impressora;

import praticaInterface.equipamentos.digitalizadora.Digitalizadora;

public class LaserJet implements Impressora, Digitalizadora{

	@Override
	public void digitalizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo Laserjet");

	}

}
