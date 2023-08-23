package Variaveis;

import java.util.Scanner;

public class Contatos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INSIRA O SEU NOME: ");
		String name = sc.next();
		
		System.out.println("INSIRA SEU EMAIL: ");
		String email = sc.next();
		
		System.out.println("INSIRA O NUMERO DO SEU TELEFONE: ");
		long telefone = sc.nextLong();
		
		System.out.printf("DADOS: %nNome: %s%nEmail: %s%nTelefone: %d", name, email, telefone);
		
		sc.close();

	}

}