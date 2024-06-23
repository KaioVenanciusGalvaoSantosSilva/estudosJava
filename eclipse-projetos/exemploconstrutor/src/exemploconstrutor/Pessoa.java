package exemploconstrutor;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?

	
	
}

