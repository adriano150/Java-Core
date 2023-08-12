package test;

import java.util.Scanner;

import entities.ExploradorRobo;

public class TesteRobos {

	public static void main(String[] args) {
		ExploradorRobo omega, beta;
		omega = new ExploradorRobo();
		beta = new ExploradorRobo();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do 1º robô: ");
		omega.nome = entrada.next();
		
		System.out.println("Informe o status do robô 1º: ");
		omega.status = entrada.next();
		
		System.out.println("Informe a temperatura do 1º robô: ");
		omega.temperatura = entrada.nextDouble();
		
		System.out.println("Informe a velocidade do 1º robô: ");
		omega.velocidade = entrada.nextInt();
		System.out.println("");
		
		System.out.println("Informe o nome do 2º robô: ");
		beta.nome = entrada.next();
		
		System.out.println("Informe o status do 2º robô: ");
		beta.status = entrada.next();
		
		System.out.println("Informe a temperatura do 2º robô: ");
		beta.temperatura = entrada.nextDouble();
		
		System.out.println("Informe a velocidade do 2º robô: ");
		beta.velocidade = entrada.nextInt();
		
		omega.exibirAtributos();
		beta.exibirAtributos();
		
		entrada.close();
	}

}
