package aplication;

import java.util.Scanner;

import util.Calculadora;

public class RaioSemMetodoNaPropriaClasse {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		System.out.print("Digite o valor do raio: ");
		double raio = entrada.nextDouble();
		
		double c = calc.circunferencia(raio);
		
		double v = calc.volume(raio);
		
		System.out.printf("Circunferência: %.2f", c);
		System.out.printf("%nVolume: %.2f", v);
		System.out.printf("%nValor do PI é: %.2f", calc.PI);
		
		entrada.close();

	}

}
