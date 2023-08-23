package Exercicios;

public class Exercicio06 {

	public static void main(String[] args) {
		
		float valorA = 12.7f;
		float valorB = 10.4f;
		float valorC = 15.2f;
		double pi = 3.14159;
		
		double triangulo = (valorA * valorC) / 2;
		double circulo = (pi * valorC) * valorC;
		double trapezio = (valorA + valorB) * (valorC / 2);
		double quadrado = (valorB * valorB);
		double retangulo = (valorA * valorB); 
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f", retangulo);
		
		

	}

}
