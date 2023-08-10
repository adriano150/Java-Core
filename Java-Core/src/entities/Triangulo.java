package entities;

public class Triangulo {
	
	//Atributos da classe
    public double ladoA;
	public double ladoB;
	public double ladoC;
	
	//Método área
	public double area() {
		double pDeX = (ladoA + ladoB + ladoC) / 2;
	//Área de X
		return Math.sqrt(pDeX * (pDeX - ladoA) * (pDeX - ladoB) * (pDeX - ladoC));
	}
	
	public void classificarTriangulo() {
		
		if(ladoA == ladoB && ladoB == ladoC) {
			System.out.println("Triângulo Equilátero");
		}else if (ladoA == ladoB || ladoA == ladoC || ladoC == ladoB) {
			System.out.println("Triângulo Isóceles");
		}else{
			System.out.println("Triângulo Escaleno");
		}
	}
}
