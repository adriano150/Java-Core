package entities;

import java.util.Scanner;

import aplication.Alistamento;

public class Start_Alistamento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Alistamento alistamento = new Alistamento(null, 0, null, null, null, null, 0, 0);
		
		System.out.print("Informe o ano de nascimento: ");
		alistamento.setAnoDeNascimento(entrada.nextInt());
		
		System.out.print("Informe seu nome: ");
		alistamento.setNome(entrada.next());
		
		System.out.print("Informe o nome da mãe: ");
		alistamento.setNomeDaMae(entrada.next());
		
		System.out.print("Informe o nome do pai: ");
		alistamento.setNomeDoPai(entrada.next());
		
		System.out.print("Informe o telefone: ");
		alistamento.setTelefone(entrada.next());
		
		System.out.print("Informe o e-mail: ");
		alistamento.setEmail(entrada.next());
		
		System.out.print("Informe a altura: ");
		alistamento.setAltura(Double.parseDouble(entrada.next()));
		
		System.out.print("Informe o peso: ");
		alistamento.setPeso(Double.parseDouble(entrada.next()));
	
		double multa = alistamento.calcularMulta();
		alistamento.exibirDados();
		System.out.println("Multa é de: R$" + multa);
		
		entrada.close();

	}

}
