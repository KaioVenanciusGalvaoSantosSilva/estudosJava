package praticaInterface.equipamentos.multifuncional;

import praticaInterface.equipamentos.copiadora.Copiadora;
import praticaInterface.equipamentos.digitalizadora.Digitalizadora;
import praticaInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Impressora, Copiadora, Digitalizadora {

	@Override
	public void digitalizar() {
		// TODO Auto-generated method stub
		System.out.println("Digitalizando via equipamento MultiFuncional");
	}

	@Override
	public void copiar() {
		// TODO Auto-generated method stub
		System.out.println("Copiando via equipamento MultiFuncional");

	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo via equipamento MultiFuncional");

	}
}
