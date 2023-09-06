package entities.heranca;

public class Start_Contas {

	public static void main(String[] args) {

		Conta contaPF1 = new Conta(6666, "Adriano", 0.0);
		ContaEmpresa contaPJ1 = new ContaEmpresa(7777, "Senai", 0.0, 1000.0);
		ContaPoupanca contaPP1 = new ContaPoupanca(8888, "Maria", 20.0, 2.2);

		/**
		 * UPCASTING -> Converter um objeto da subclasse para superclasse
		 */
	}

}
