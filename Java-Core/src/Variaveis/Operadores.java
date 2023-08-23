package Variaveis;

public class Operadores {

	public static void main(String[] args) {
		//Operador Unário 01 ++ e --.
		
		int preco = 10;
		System.out.println(preco); // 10
		System.out.println(preco++); // 10 + 1 = 11
		System.out.println(++preco); // 11 + 1 = 12
		System.out.println(preco--);
		System.out.println(--preco);
//      -------------------------------------------
		//Operador Unário 02 (operações).
		
		int valor01 = 10;
		int valor02 = 10;
		int valor03 = 2;
		
		valor03 = valor01++;
		System.out.println("Valor de valor03 é: " + valor03);
		
		System.out.println(valor01++ + ++valor01); // 22
		System.out.println(valor02++ + valor02++); // 21
		System.out.println(valor02++ + ++valor01); // 25
	}

}
