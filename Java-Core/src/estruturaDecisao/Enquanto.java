package estruturaDecisao;

public class Enquanto {

	public static void main(String[] args) {
		
		//Implementação da variável números.
		int numeros = 0;
		
		//Imprimir na tela TODOS os números de 0 a 10.
		
		while (numeros < 11) {
			System.out.println(numeros);
			numeros++;
		}
		
		System.out.println("------------");
		//Exibir todos os números impares de 0 a 10.
		
		int nImpar = 1;
		
		while (nImpar < 10) {
			System.out.println(nImpar);
			nImpar+=2;
		}
	}

}
