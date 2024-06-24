package dispositivo;

import dispositivo.apps.AparelhoTelefonico;
import dispositivo.apps.NavegadorInternet;
import dispositivo.apps.ReprodutorMusical;
import dispositivo.sistema.Reprodutor;

public class Usuario {
	
	public static void main(String[] args) {
		//Essa aplicação tem como finalidade acessar as classes disponiveis pelo sistema para implementar o próprio app, usamos interface para essa representação
		//Como o app pode precisar herdar de mais de uma classe não é recomendado o uso de herança, por exemplo:
		//app de musica precisa herdar de ReprodutorMusical, ContaIcloud
		//Caso a aplicação precisasse herdar as caracteristicas de apenas uma biblioteca do sistema, poderia usar herança.
		//OBS- Não recomendado usar herança pois um dispositivo tem suas bibliotecas e desenvolvedores terceiros precisam usa-las, e desenvolver as próprias.
			
		//Como não foi definida as regras de negócio nesse momento não tem necessidade de implementar código ou adicionar atributos ao diagrama de classe
		
		ReprodutorMusical reprodutor = new ReprodutorMusical();
		reprodutor.selecionarMusica("eye of the tiger");
		reprodutor.tocar();
		reprodutor.pausar();
		
		AparelhoTelefonico aparelhotelefonico = new AparelhoTelefonico();
		aparelhotelefonico.ligar("11999999999");
		aparelhotelefonico.desligar();
		
		NavegadorInternet navegador = new NavegadorInternet();
		navegador.adicionarNovaAba();
		navegador.exibirPagina("www.dio.me");
		navegador.atualizarPagina();
				
	}

}
