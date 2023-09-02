package exerciciosListas;

import java.util.List;
import java.util.Scanner;

public class Execute_Livros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o ID do livro: ");
		String idLivro = entrada.nextLine();
		System.out.println("Informe o título do livro: ");
		String titulo = entrada.nextLine();
		System.out.println("Informe o autor do livro: ");
		String nomeAutor = entrada.nextLine();
		System.out.println("Informe o ano do livro");
		String ano = entrada.nextLine();
		System.out.println("Informe o gênero do livro: ");
		String genero = entrada.nextLine();
		System.out.println("Informe a editora do livro: ");
		String editora = entrada.nextLine();
		System.out.println("Informe quantas páginas tem o livro: ");
		String paginas = entrada.nextLine();
		
		//Instanciar um obj livro
		Livros livro = new Livros();
		
		//Adicionar um livro
		livro.addLivros(idLivro, titulo, nomeAutor, ano, genero, editora, paginas);
		
		//Listar os elementos
		List <String> titulos = livro.getTitulos();
		
		for (String titulos1 : titulos) {
			System.out.println(titulos1);
		}
		//Listar a quantidade de elementos
		System.out.println("--------------------------");
		livro.exibirElementos();
		
		//Remover elentos
		System.out.println("Informe o código do livro: ");
		String codLivro = entrada.nextLine();
		livro.removerLivro(codLivro);
		
		System.out.println("--------------------------");
		System.out.println("Lista de livros a´pos remoção");
		livro.exibirElementos();
		
		
		entrada.close();

	}

}
