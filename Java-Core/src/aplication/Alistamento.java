package aplication;

public class Alistamento {
	private String nome;
	private int anoDeNascimento;
	private String nomeDaMae;
	private String nomeDoPai;
	private int telefone;
	private String email;
	private double altura;
	private double peso;
	
	//Construtores
	public Alistamento(String nome, int anoDeNascimento, String nomeDaMae,
			String nomeDoPai, int telefone, String email, double altura, double peso) {
		this.nome = nome;
		this.setAnoDeNascimento(anoDeNascimento);
		this.nomeDaMae = nomeDaMae;
		this.nomeDoPai = nomeDoPai;
		this.telefone = telefone;
		this.email = email;
		this.altura = altura;
		this.peso = peso;
	}
	
	//Métodos gets e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}
	
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}

	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public String getNomeDoPai() {
		return nomeDoPai;
	}

	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Método
	public double idadeMinima(int anoDeNascimento) {
		int idade = 2023 - anoDeNascimento;
		if(idade >= 18 && idade <= 45) {
		}else{
			System.out.println("Idade insuficiente");
		}
		return idade;
	}
		
		public double calcularMulta() {
			int idade = 2023 - getAnoDeNascimento();
			if(idade >= 20) {
				return 5.00 * (idade - 20);
			}else{
				return 0;
			}
		}
			public void exibirDados() {
				System.out.println("----------Alistamento Militar----------");
				System.out.println("Nome: " + nome);
				System.out.println("Ano de nascimento: " + getAnoDeNascimento());
				System.out.println("Nome do pai: " + nomeDoPai);
				System.out.println("Nome da mãe: " + nomeDaMae);
				System.out.println("Telefone: " + telefone);
				System.out.println("E-mail: " + email);
				System.out.println("Altura: " + altura);
				System.out.println("Peso: " + peso);
				
			}

			public void setAnoDeNascimento(int anoDeNascimento) {
				this.anoDeNascimento = anoDeNascimento;
			}
		}
		
