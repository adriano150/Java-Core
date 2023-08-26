package revisao;

public class Agenda {
	
	//Atributos ou varáveis de classe
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	
	public Agenda(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}
	
	public void addEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	//Inicializar os atributos(construtor)
	

}
