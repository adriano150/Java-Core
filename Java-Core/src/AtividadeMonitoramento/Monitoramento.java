package AtividadeMonitoramento;

public class Monitoramento {
	
	private String produto;
	private double valorAdicionado;
	private double salario;
	private double valorGasto;
	private double despesas;
	private double saldoConta;
	private double adicionarSaldo;
	
	public Monitoramento(String produto, double valorAdicionado, double salario, double valorGasto, double despesas, double saldoConta, double adicionarSaldo) {
		this.produto = produto;
		this.valorAdicionado = valorAdicionado;
		this.salario = salario;
		this.valorGasto = valorGasto;
		this.despesas = despesas;
		this.saldoConta = saldoConta;
		this.adicionarSaldo = adicionarSaldo;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValorAdicionado() {
		return valorAdicionado;
	}

	public void setValorAdicionado(double valorAdicionado) {
		this.valorAdicionado = valorAdicionado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getEntradaDeValor() {
		return valorGasto;
	}

	public void setEntradaDeValor(double entradaDeValor) {
		this.valorGasto = entradaDeValor;
	}

	public double getDespesas() {
		return despesas;
	}

	public void setDespesas(double despesas) {
		this.despesas = despesas;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public double getAdicionarSaldo() {
		return adicionarSaldo;
	}

	public void setAdicionarSaldo(double adicionarSaldo) {
		this.adicionarSaldo = adicionarSaldo;
	}
	
	public double calcularSaldo() {
		double resultado = Math.sqrt((saldoConta + adicionarSaldo));
		return resultado;
	}
	
		
	}
	
