package aplication;

import java.util.Scanner;

import entities.Triangulo;

public class Aplicativo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Triangulo X, Y;
		X = new Triangulo();
		Y = new Triangulo();
		
		System.out.println("Informe as medidas do triângulo X: ");
		X.ladoA = entrada.nextDouble();
		X.ladoB = entrada.nextDouble();
		X.ladoC = entrada.nextDouble();		
		
		System.out.println();
		System.out.println("Informe as medidas do triângulo Y: ");
		Y.ladoA = entrada.nextDouble();
		Y.ladoB = entrada.nextDouble();
		Y.ladoC = entrada.nextDouble();
		
		double areaDeX = X.area();
		double areaDeY = Y.area();			
		
		System.out.println();
		System.out.printf("Área de X: %.2f%n", areaDeX);
		X.classificarTriangulo();
		System.out.println();
		System.out.printf("Área de Y: %.2f", areaDeY);
		System.out.println();
		Y.classificarTriangulo();
		
		entrada.close();

	}

}
