//Desenvolvedor: José Adriano da Silva Filho
//Github: https://github.com/adriano150/CasaDeCambio

package entities;

public class CalculoCasaDeCambio {

		public static final double dolar = 4.91;
		public static final double euro = 5.38;
		public static final double chineseYuan = 0.68;
		
		public double valor, valorDigitado;
	
	public void escolhaFinal(int escolha) {
		
		if(escolha == 1) {
			System.out.printf("O cliente pagará R$ %.2f reais e irá receber %.2f Dólares.%n", valorDolar(dolar), valorDigitado);
	}else if(escolha == 2) {
		System.out.printf("O cliente pagará R$ %.2f reais e irá receber %.2f Euros.%n", valorEuro(euro), valorDigitado);
	}else if(escolha == 3) {
		System.out.printf("O cliente pagará R$ %.2f reais e irá receber %.2f Chinese Yuan.", valorChineseYuan(chineseYuan), valorDigitado);
	}else{
		System.out.println("Essa opção é inválida.");
	}
}
		public double valorDolar(double dolar) {
			return valor * dolar;
   }
		public double valorEuro(double euro) {
			return valor * euro;
		}
		public double valorChineseYuan(double chineseYuan) {
			return valor * chineseYuan;
		}
}