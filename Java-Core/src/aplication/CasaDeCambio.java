//Desenvolvedor: José Adriano da Silva Filho
//Github: https://github.com/adriano150/CasaDeCambio

package aplication;

import java.util.Scanner;

import entities.CalculoCasaDeCambio;

public class CasaDeCambio {

	public static void main(String[] args) {
		CalculoCasaDeCambio calculo = new CalculoCasaDeCambio();
		Scanner entrada = new Scanner(System.in);;
		
		System.out.println("Selecione a moeda que deseja comprar: ");
		System.out.println("1 - Dólar");
		System.out.println("2 - Euro");
		System.out.println("3 - Chinese Yuan");
		int escolha = entrada.nextInt();
		
		if(escolha >= 1 && escolha <= 3) {
			System.out.print("Digite o valor que deseja comprar: ");
			double quantia = entrada.nextDouble();
			calculo.valor = quantia;
			calculo.valorDigitado = quantia;
			calculo.escolhaFinal(escolha);
			
	}else{
		System.out.println("Essa opção é inválida.");
	}
		entrada.close();
	}
}