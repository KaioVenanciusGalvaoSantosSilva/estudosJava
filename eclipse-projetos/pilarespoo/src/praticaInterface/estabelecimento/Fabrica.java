package praticaInterface.estabelecimento;


import praticaInterface.equipamentos.copiadora.Copiadora;
import praticaInterface.equipamentos.digitalizadora.Digitalizadora;
import praticaInterface.equipamentos.impressora.Impressora;
import praticaInterface.equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
	
	public static void main(String[] args) {
		
		EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
		
		Impressora impressora = em;
		Digitalizadora digitalizdora= em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizdora.digitalizar();
		copiadora.copiar();
			
	}
}
