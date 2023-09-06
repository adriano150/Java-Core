package entities.heranca;

/**
 * Representa uma conta bancária
 * 
 * @author José Adriano da Silva
 * @since 04-09-2023
 */
public class Conta {
	/**
	 * O número da conta
	 */
	private Integer numeroConta;

	/**
	 * O titular da conta (dono)
	 */
	private String titularConta;

	/**
	 * O saldo da conta
	 */
	protected Double saldoConta;

	public Conta() {
		/**
		 * Cria uma conta com os valores padrões para usar os atributos 'numeroConta' e
		 * 'titularConta'
		 */
		this.numeroConta = null;
		this.titularConta = null;
		this.saldoConta = 0.0;
	}

	/**
	 * Construtor da classe que recebe os valores para os atributos personalizados:
	 * 'numeroConta', 'titularConta' e 'saldoConta'
	 * 
	 * @param numeroConta  Representa o número de uma conta
	 * @param titularConta Representa o nome do dono da conta
	 * @param saldoConta   Reperenta o atual saldo da conta
	 */
	public Conta(Integer numeroConta, String titularConta, Double saldoConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldoConta = saldoConta;
	}

	/**
	 * Obter o número da conta
	 * 
	 * @return O número da conta
	 */

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	/**
	 * Define o titular da conta
	 * 
	 * @param titularConta O novo titular da conta
	 */

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	/**
	 * Obtém o saldo da conta
	 * 
	 * @return O saldo da conta
	 */

	public Double getSaldoConta() {
		return saldoConta;
	}

	/**
	 * Realização de um saque na conta
	 * 
	 * @param quantidade Representa o valor para o saque
	 */
	public void saque(double quantidade) {
		/**
		 * Um saque representa uma retirada na conta
		 */
		saldoConta -= quantidade;
	}

	/**
	 * Realização de um depósito na conta
	 * 
	 * @param quantidade Representa o valor para o depósito
	 */
	public void deposito(double quantidade) {
		/**
		 * Um depósito representa uma entrada na conta
		 * 
		 * @param quantidade Representa um valor para entrada na conta
		 */
		saldoConta += quantidade;
	}
}