package aplication;

import java.util.Scanner;

import util.Deslocamento;

public class Start_Deslocamento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Deslocamento deslocamento = new Deslocamento();
		
		System.out.println("Insira a distância de x1: ");
		double x1 = entrada.nextDouble();
		deslocamento.setX1(x1);
		
		System.out.println("Insira a distância de y1: ");
		double y1 = entrada.nextDouble();
		deslocamento.setY1(y1);
		
		System.out.println("Insira a distância de x2: ");
		double x2 = entrada.nextDouble();
		deslocamento.setX2(x2);
		
		System.out.println("Insira a distância de y2: ");
		double y2 = entrada.nextDouble();
		deslocamento.setY2(y2);
		
		System.out.println("Informe a velocidade: ");
		double velocidade = entrada.nextDouble();
		deslocamento.setVelocidade(velocidade);
		
		double distancia = deslocamento.calcularDistancia();
		double tempo = deslocamento.calcularTempo();
		
		System.out.printf("A distância é: %.2f%nTempo: %.2f", distancia, tempo);
		
		entrada.close();

	}

}
