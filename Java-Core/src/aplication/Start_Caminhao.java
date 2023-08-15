package aplication;

import java.util.Scanner;

import entities.Caminhao;

public class Start_Caminhao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a marca do caminhão?: ");
		String marca = entrada.next();
		
		System.out.println("Quantos eixos tem o caminhão? ");
		int eixos = entrada.nextInt();
		
		System.out.println("Informe quantas toneladas tem o caminhão: ");
		int toneladas = entrada.nextInt();
		
		Caminhao cam = new Caminhao(marca, eixos, toneladas);
		
		System.out.printf(marca + " - " + eixos + " - " + toneladas);
		
		
		
		
		entrada.close();

	}

}
