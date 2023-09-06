package entities.heranca;

public class Start_Contas {

	public static void main(String[] args) {

		Conta contaPF1 = new Conta(6666, "Adriano", 0.0);
		ContaEmpresa contaPJ1 = new ContaEmpresa(7777, "Senai", 0.0, 1000.0);
		ContaPoupanca contaPP1 = new ContaPoupanca(8888, "Pablo", 20.0, 2.2);

		/**
		 * UPCASTING -> Converter um objeto da subclasse para superclasse
		 */
		Conta contaPF2 = contaPJ1;
		Conta contaPF3 = new ContaEmpresa(9999, "Victor", 0.0, 200.0);
		Conta contaPF4 = new ContaPoupanca(0000, "Adriano", 0.0, 0.10);

		/**
		 * DOWNCASTING
		 */
		ContaEmpresa contaPF5 = (ContaEmpresa) contaPF3;
		ContaEmpresa contaPF6 = (ContaEmpresa)contaPF3;
		contaPF6.emprestimo(100.0);
	}

}
