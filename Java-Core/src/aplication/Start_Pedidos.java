package aplication;

import java.util.Date;

import collection.StatusPedidos;
import entities.Pedido;

public class Start_Pedidos {

	public static void main(String[] args) {
		//Instanciar um pedido (objeto)
		
		Pedido pedido1 = new Pedido(543, new Date(), StatusPedidos.PENDENTE_DE_PAGAMENTO);
		System.out.println(pedido1);

		//Converter um objeto String em enum
		//Instância de pedido2, receber um status de entregue
		StatusPedidos pedido2 = StatusPedidos.ENTREGUE;
		
		StatusPedidos pedido3 = StatusPedidos.valueOf("ENTREGANDO");
		
		System.out.println(pedido2);
		System.out.println(pedido3);
	}

}
