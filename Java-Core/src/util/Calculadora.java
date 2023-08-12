package util;

public class Calculadora {
	public final double PI = 3.14169;
	
	public double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public double volume(double raio) {
		// v = 4. p. r³/3
		
		return //4.0 * PI * raio * raio * raio / 3.0;
				4.0 * PI * (Math.pow(raio, 3) / 3.0);
	}

}
