package entities;

import java.util.Scanner;

import AtividadeMonitoramento.Monitoramento;

public class CalcMonitoramento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Monitoramento monitor = new Monitoramento(null, 0, 0, 0, 0, 0, 0);
		
		System.out.println("Selecione a opção que deseja: ");
		System.out.println("1 - Adicionar saldo");
		System.out.println("2 - Informar o nome do produto e o valor gasto");
		System.out.println("3 - Ver saldo da conta");
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o valor a ser adicionado: ");
			double valorAdicionado = entrada.nextDouble();
			monitor.getAdicionarSaldo();
			break;
		case 2:
			System.out.println("Informe o nome do produto e o valor gasto: ");
			String produto = entrada.next();
			double valorGasto = entrada.nextDouble();
			break;
		}
		double resultado = monitor.getValorAdicionado();
		System.out.printf("O saldo é de: %.2f", resultado);
		
		entrada.close();

	}

}
