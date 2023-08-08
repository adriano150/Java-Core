package estruturaDecisao;

public class Caso {

	public static void main(String[] args) {
		
		//Solicitar um número até o usuário informar 0.
		
		int valor = 0;
		
		switch (valor) {
		case 1: System.out.println("Você errou");
		System.out.println("Deposite mais R$ 20.00");
			break;

		default: System.out.println("Você precisa informar um número de 1 a 10");
			break;
		}

	}

}
