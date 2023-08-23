package Variaveis;

import java.util.Scanner;

public class trianguloAtividade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double ladoAdeX = 0;
		double ladoBdeX = 0;
		double ladoCdeX = 0;
		double pDeX;
		double areaDeX;
		double ladoAdeY = 0;
		double ladoBdeY = 0;
		double ladoCdeY = 0;
		double pDeY;
		double areaDeY;
		
		//Triângulo X
		System.out.println("Insira o valor do lado A do triângulo X: ");
		ladoAdeX = entrada.nextDouble();
		
		System.out.println("Insira o valor do lado B do triângulo X: ");
		ladoBdeX = entrada.nextDouble();
		
		System.out.println("Insira o valor do lado C do triângulo X: ");
		ladoCdeX = entrada.nextDouble();
		
		//Valor de X
		pDeX = (ladoAdeX + ladoBdeX + ladoCdeX) / 2;
		//Área de X
		areaDeX = Math.sqrt(pDeX * (pDeX - ladoAdeX) * (pDeX - ladoBdeX) * (pDeX - ladoCdeX));
		
		System.out.println();
		System.out.printf("A área do triângulo X é: %.2f%n", areaDeX);
		
		System.out.println("--------------------------------------");
		
		//Triângulo Y
		System.out.println("Insira o valor do lado A do triângulo Y: ");
		ladoAdeY = entrada.nextDouble();
		
		System.out.println("Insira o valor do lado B do triângulo Y: ");
		ladoBdeY = entrada.nextDouble();
		
		System.out.println("Insira o valor do lado C do triângulo Y: ");
		ladoCdeY = entrada.nextDouble();
		
		pDeY = (ladoAdeY + ladoBdeY + ladoCdeY) / 2;
		areaDeY = Math.sqrt(pDeY * (pDeY - ladoAdeY) * (pDeY - ladoBdeY) * (pDeY - ladoCdeY));
		System.out.println();
		
		System.out.printf("A área do triângulo Y é: %.2f%n", areaDeY);
		System.out.println("--------------------------------------");
		System.out.println();
		
		if(areaDeX > areaDeY) {
			System.out.println("O triângulo X possui a maior área");
		}else if (areaDeX == areaDeY){
			System.out.println("Os lados dos dois triângulo são iguais");
		}else{
			System.out.println("O triângulo Y possui a maior área");
		}
		
		entrada.close();

	}

}
