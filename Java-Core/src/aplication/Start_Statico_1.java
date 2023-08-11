package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Start_Statico_1 {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = entrada.nextDouble();
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f", c);
		System.out.printf("Volume: %.2f", v);
		System.out.printf("PI value: %.2f", PI);
		entrada.close();
	}
		
		public static double circumference(double radius) {
			return 2.0 * PI * radius;
		}
		
		public static double volume(double radius) {
			return 4.0 * PI * radius * radius * radius / 3.0;
		}

	}

