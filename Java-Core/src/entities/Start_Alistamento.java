package entities;

import java.util.Scanner;

import aplication.Alistamento;

public class Start_Alistamento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Alistamento alistamento = new Alistamento(null, 0, null, null, 0, null, 0, 0);
		
		System.out.print("Informe o ano de nascimento: ");
		alistamento.setAnoDeNascimento(entrada.nextLine());
		
		System.out.println("Informe seu nome: ");
		alistamento.setNome(entrada.nextLine());
		
		System.out.println("Informe o nome da mãe: ");
		alistamento.setNomeDaMae(entrada.nextLine());
		
		System.out.println("Informe o nome do pai: ");
		alistamento.setNomeDoPai(entrada.nextLine());
		
		System.out.println("Informe o telefone: ");
		alistamento.setTelefone(entrada.nextInt());
		
		System.out.println("Informe o e-mail: ");
		alistamento.setEmail(entrada.nextLine());
		
		System.out.println("Informe a altura: ");
		alistamento.setAltura(Double.parseDouble(entrada.nextLine()));
		
		System.out.println("Informe o peso: ");
		alistamento.setPeso(Double.parseDouble(entrada.nextLine()));
	
		double multa = alistamento.calcularMulta();
		alistamento.exibirDados();
		System.out.println("Multa é de: R$" + multa);
		
		entrada.close();

	}

}
