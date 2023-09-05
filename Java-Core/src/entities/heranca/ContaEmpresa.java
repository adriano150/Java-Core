package entities.heranca;

/**
 * Representa uma conta bancária de uma empresa
 * 
 * @author José Adriano da Silva
 * @version 1.0
 */
public class ContaEmpresa extends Conta {
	/**
	 * Limite para realização de empréstimo
	 */
	private Double limiteEmprestimo;

	/**
	 * Construtor padrão
	 */
	public ContaEmpresa() {
	}

	/**
	 * Construtor personalizado
	 * 
	 * @param numeroConta      Representa o número da conta, herdado do pai
	 * @param titularConta     Representa o titular da conta (dono), herdado do pai
	 * @param saldoConta       Representa o saldo da conta, herdado do pai
	 * @param limiteEmprestimo Representa o limite para empréstimo
	 */
	public ContaEmpresa(Integer numeroConta, String titularConta, Double saldoConta, Double limiteEmprestimo) {
		super(numeroConta, titularConta, saldoConta);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	/**
	 * Obtém o limite de empréstimo da conta
	 * 
	 * @return O limite de empréstimo da conta
	 */
	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	/**
	 * Define o limite de empréstimo da conta
	 * 
	 * @param limiteSaque representa o novo limite para empréstimo da conta
	 */

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	/**
	 * Realizar um empréstimo na conta empresa
	 * 
	 * @param quantidade representa o valor
	 */

	public void emprestimo(double quantidade) {
		if (quantidade <= limiteEmprestimo) {
			deposito(quantidade);
		}
	}
}
