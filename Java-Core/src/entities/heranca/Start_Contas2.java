package entities.heranca;

import java.util.Scanner;

public class Start_Contas2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número da conta: ");
		int numeroConta = entrada.nextInt();
		
		System.out.print("Informe o nome do titular da conta: ");
		String titular = entrada.nextLine();
		entrada.next();
		
		System.out.print("Informe o limite para saque: ");
		double limiteSaque = entrada.nextDouble();
		
		ContaEmpresa xpto = new ContaEmpresa(numeroConta, titular, null, limiteSaque);
		System.out.println(xpto.getNumeroConta() + " - " + xpto.getTitularConta() + " - " + xpto.getSaldoConta() + " - " + xpto.getLimiteEmprestimo());
		
		
		
		
		
		entrada.close();

	}

}
