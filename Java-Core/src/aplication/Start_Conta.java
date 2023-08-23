package aplication;

import javax.swing.JOptionPane;

import entities.Conta;

public class Start_Conta {

	public static void main(String[] args) {
		
		Conta conta;
		
		int numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta",
				"Abertura da conta", JOptionPane.PLAIN_MESSAGE));
		
		String donoConta = JOptionPane.showInputDialog(null, "Informe o nome do dono da conta", "Abertura de conta",
				JOptionPane.PLAIN_MESSAGE);
		
		String seraQueVaiTerDeposito = JOptionPane.showInputDialog(null, "Irá ser realizado um depósito inicial? S/N",
				"Abertura da conta", JOptionPane.PLAIN_MESSAGE);
		
		seraQueVaiTerDeposito = seraQueVaiTerDeposito.toUpperCase();//UpperCase obriga a letra a ser maiúscula
		
		char depositoSimNao = seraQueVaiTerDeposito.charAt(0);//Pega somente a primeira letra
		
		if(depositoSimNao == 'S') {
			double depositoInicial = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor para depósito",
					"Abertura de conta", JOptionPane.PLAIN_MESSAGE));
			conta = new Conta(numeroConta, donoConta, depositoInicial);
		}else{
			conta = new Conta(numeroConta, donoConta);
		}
		
		//Mostrar os dados da conta
		JOptionPane.showMessageDialog(null, conta, "Dados da conta"
				, JOptionPane.INFORMATION_MESSAGE);
		
	}

}
