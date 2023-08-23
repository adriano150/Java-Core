package aplication;

import java.util.Scanner;

import entities.Produto;

public class Start_Produto4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Produto produto = new Produto();
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
		
		System.out.printf("Informações do produto: %nNome: %s%nPreço: R$ %.2f%nQuantidade: %s%n", produto.getNome()
				, produto.getPreco(),produto.getQuantidade());
		
		System.out.printf("Valor total em estoque: R$ %.2f%n", produto.valorTotalEmEstoque());
		
		System.out.println("");
		System.out.print("Quantos produtos deseja adicionar?: ");
		quantidade = entrada.nextInt();
		produto.adicionarProduto(quantidade);
		
		System.out.printf("Quantidade: %s%n", produto.getQuantidade());
		System.out.printf("Valor total em estoque: R$ %.2f%n", produto.valorTotalEmEstoque());
		
		System.out.println("");
		System.out.print("Quantos produtos deseja remover?: ");
		quantidade = entrada.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.printf("Quantidade: %s%n", produto.getQuantidade());
		System.out.printf("Valor total em estoque: R$ %.2f", produto.valorTotalEmEstoque());
	
		entrada.close();
	}

}
