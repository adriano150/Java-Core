package exerciciosListas;

import java.util.ArrayList;
import java.util.List;

public class Livros {
	
	//Parâmetro ou variável da classe
	private List <String> titulos;
	
	//Construtor
	public Livros() {
		this.titulos = new ArrayList<>();
	}
	
	//Método adicionar
	public void addLivros(String idLivro, String titulo, String nomeAutor, String ano,
			String genero, String editora, String paginas) {
		this.titulos.add(idLivro + " - " + titulo + " - " + nomeAutor + " - " + ano + " - " + 
			genero + " - " + editora + " - " + paginas);
	}
	
	//Listar os elementos
	public List <String> getTitulos(){
		return titulos;
	}
	
	//Listar a quantidade de elementos da lista
	public void exibirElementos() {
		System.out.println("A lista contém " + this.titulos.size() + " elementos");
	}
	
	public void removerLivro(String titulo) {
		//Encontrar índice do elemento a ser removido
		int index = this.titulos.indexOf(titulo);
		
		//Remover o elemento da lista
		this.titulos.remove(index);
	}

}
