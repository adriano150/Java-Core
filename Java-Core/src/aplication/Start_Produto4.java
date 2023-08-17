package aplication;

import java.util.Scanner;

import entities.Produto;

public class Start_Produto4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Produto produto = new Produto(null, 0, 0);
		System.out.println("Digite as informações do produto: ");
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		produto.setNome(nome);
		
		System.out.print("Preço: ");
		double preco = entrada.nextDouble();
		produto.setPreco(preco);
		
		System.out.print("Quantidade: ");
		int quantidade = entrada.nextInt();
		produto.setQuantidade(quantidade);
		System.out.println();
		
		System.out.printf("Informações do produto: %nNome: %s%nPreço: %.2f%nQuantidade: %s%n", produto.getNome(), produto.getPreco(), produto.getQuantidade());
		System.out.printf("Valor total em estoque: R$" + produto.valorTotalEmEstoque());
	
		entrada.close();
	}

}
