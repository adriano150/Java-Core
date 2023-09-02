package aplication;

import java.util.Date;

import collection.StatusPedidos;
import entities.Pedido;

public class Start_Pedidos {

	public static void main(String[] args) {
		//Instanciar um pedido (objeto)
		
		Pedido pedido1 = new Pedido(543, new Date(), StatusPedidos.PENDENTE_DE_PAGAMENTO);
		System.out.println(pedido1);

	}

}
