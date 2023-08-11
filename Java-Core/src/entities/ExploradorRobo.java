package entities;

public class ExploradorRobo {
	
	public String nome;
	public String status;
	public int velocidade;
	public double temperatura;
	
	public void verificarTemperatura(){
		if(temperatura > 45) {
			status = "Retorne imediatamente para a base";
			velocidade = 5;
		}
	}
	
	public void exibirAtributos() {
		System.out.println("Nome do robô: " + nome);
		System.out.println("Status: " + status);
		System.out.println("Velocidade: " + velocidade);
		System.out.println("Temperatura do ambiente: " + temperatura);
		System.out.println("");
	}
}
