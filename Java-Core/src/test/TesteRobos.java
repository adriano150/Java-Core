package test;

import java.util.Scanner;

import entities.ExploradorRobo;

public class TesteRobos {

	public static void main(String[] args) {
		ExploradorRobo omega, beta;
		omega = new ExploradorRobo();
		beta = new ExploradorRobo();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do robô omega: ");
		omega.nome = entrada.next();
		
		System.out.println("Informe o status do robô omega: ");
		omega.status = entrada.next();
		
		System.out.println("Informe a temperatura do robô omega: ");
		omega.temperatura = entrada.nextDouble();
		
		System.out.println("Informe a velocidade do robô omega: ");
		omega.velocidade = entrada.nextInt();
		System.out.println("");
		
		System.out.println("Informe o nome do robô beta: ");
		beta.nome = entrada.next();
		
		System.out.println("Informe o status do robô beta: ");
		beta.status = entrada.next();
		
		System.out.println("Informe a temperatura do robô beta: ");
		beta.temperatura = entrada.nextDouble();
		
		System.out.println("Informe a velocidade do robô beta: ");
		beta.velocidade = entrada.nextInt();
		
		omega.exibirAtributos();
		beta.exibirAtributos();
		
		entrada.close();
	}

}
