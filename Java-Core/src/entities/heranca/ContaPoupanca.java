package entities.heranca;

public class ContaPoupanca extends Conta {
	private Double taxaSaque;

	/**
	 * Construtor padrão
	 */
	public ContaPoupanca() {
		super();
	}

	/**
	 * Construtor personalizado
	 */
	public ContaPoupanca(Integer numeroConta, String titularConta, Double saldoConta, Double taxaSaque) {
		super(numeroConta, titularConta, saldoConta);
		this.taxaSaque = taxaSaque;
	}

	/**
	 * Gets e sets
	 */
	public Double getTaxaSaque() {
		return taxaSaque;
	}

	public void setTaxaSaque(Double taxaSaque) {
		this.taxaSaque = taxaSaque;
	}

	/**
	 * Método atualizar saldo da conta com base na taxa de juros
	 */
	public void atualizarSaldo() {
		saldoConta += saldoConta * taxaSaque;
	}
}
