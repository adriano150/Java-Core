package estruturaDecisao;

import java.util.Scanner;

public class Se {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        double valor01 = 0, valor02 = 0, valor03 = 0, valor04 = 0, valor05 = 0;

        System.out.println("Informe o valor01: ");
        valor01 = entrada.nextDouble();

        if (valor01 == 0) {
            System.out.println("Não pode informar o valor 0.");
            entrada.close(); 
            return; 
        }

        System.out.println("Informe o valor02: ");
        valor02 = entrada.nextDouble();

        if (valor02 == 0) {
            System.out.println("Não pode informar o valor 0.");
            entrada.close(); 
            return; 
        }

        System.out.println("Informe o valor03: ");
        valor03 = entrada.nextDouble();

        if (valor03 == 0) {
            System.out.println("Não pode informar o valor 0.");
            entrada.close(); 
            return; 
        }

        System.out.println("Informe o valor04: ");
        valor04 = entrada.nextDouble();

        if (valor04 == 0) {
            System.out.println("Não pode informar o valor 0.");
            entrada.close(); 
            return; 
        }

        System.out.println("Informe o valor05: ");
        valor05 = entrada.nextDouble();

        if (valor05 == 0) {
            System.out.println("Não pode informar o valor 0.");
            entrada.close();
            return; 
        }
        double soma = valor01 + valor02 + valor03 + valor04 + valor05;

        System.out.printf("Valor 01: %.1f %n", valor01);
        System.out.printf("Valor 02: %.1f %n", valor02);
        System.out.printf("Valor 03: %.1f %n", valor03);
        System.out.printf("Valor 04: %.1f %n", valor04);
        System.out.printf("Valor 05: %.1f %n", valor05);
        System.out.printf("Soma total: %.2f", soma);

        entrada.close(); 
    }
}
