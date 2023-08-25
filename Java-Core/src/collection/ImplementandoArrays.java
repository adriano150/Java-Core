package collection;

import java.util.Arrays;
import java.util.Scanner;

public class ImplementandoArrays {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Exemplo 01 array notas de um aluno
		double notasAlunoA[] = new double[3];
		
		//Atribuição
		notasAlunoA[0] = 5.5;
		notasAlunoA[1] = 4.8;
		notasAlunoA[2] = 8.5;
		
		//Exibição
		System.out.println(notasAlunoA);//Como o Array é um objeto, ele retorna um endereço de memória
		System.out.println(notasAlunoA[0] + "\n" + notasAlunoA[1] + "\n" + notasAlunoA[2]);
		
		//Exibição por  meio de método da classe Arrays
		System.out.println("\n----------Exibição com uso do Método----------\n");
		System.out.println(Arrays.toString(notasAlunoA));
		
		System.out.println("\n----------Exibição com uso do For----------\n");
		//Formas de percorrer um Array
		double notas;
		for (int i = 0; i < 3; i++) {
			notas = notasAlunoA[i];
			notas = notas * 2;
			System.out.println(i + ": " + notas);
			System.out.println("\n");
			
			//Calcular a média das notas
			notas += notasAlunoA[i];
			System.out.printf("\nMédia das notas: %.2f\n", notas / 3);
		}
		
		
		
		entrada.close();

	}

}
