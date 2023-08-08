package aplication;

import java.util.Scanner;

import entities.Triangulo;

public class Aplicativo {

	public static void main(String[] args) {
		
		Triangulo X = new Triangulo();
		X.ladoA = 3.0;
		X.ladoB = 4.0;
		X.ladoC = 2.0;
		System.out.println(X.ladoA);
		System.out.println();
		Triangulo Y = new Triangulo();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o lado A do triângulo Y: ");
		Y.ladoA = entrada.nextDouble();
		
		System.out.print("Informe o lado B do triângulo Y: ");
		Y.ladoB = entrada.nextDouble();
		
		System.out.print("Informe o lado C do triângulo Y: ");
		Y.ladoC = entrada.nextDouble();
		
		System.out.println();
		System.out.println(Y.ladoA);
		System.out.println(Y.ladoB);
		System.out.println(Y.ladoC);
		
		entrada.close();

	}

}
