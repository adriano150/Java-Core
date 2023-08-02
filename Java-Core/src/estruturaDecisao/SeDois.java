package estruturaDecisao;

import java.util.Scanner;

public class SeDois {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidade = 0;
		double valorInformado;
		
		System.out.println("Informe um valor: ");
		valorInformado = entrada.nextDouble();
		if (quantidade == 5 || valorInformado != 0.00) {
			quantidade++;
			System.out.printf("Número informado: ", valorInformado);
			System.out.println("Quantidade de números digitados: " + quantidade);
		}

	}

}
