package aplication;

import entities.ExploradorRobo;

public class StartRobot {

	public static void main(String[] args) {
		//Criando o robô
		ExploradorRobo alfa = new ExploradorRobo();
		alfa.status = "Explorando";
		alfa.velocidade = 7;
		alfa.temperatura = 20;
		
		alfa.exibirAtributos();
		
		System.out.println("Aumentando a velocidade para 8");
		alfa.velocidade = 8;
		System.out.println("");
		alfa.exibirAtributos();
		System.out.println("Alterar a temperatura para 47");
		alfa.temperatura = 47;
		System.out.println("");
		alfa.verificarTemperatura();
		alfa.exibirAtributos();
		
	}

}
