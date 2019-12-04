package br.org.fornecedor.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "pedido")
public class Pedido {
	
	@Id
	private String id;
	private Integer tempoDePreparo;
	private PedidoStatus status;
	private List<PedidoItem> itens;

	public Pedido() {
	}
	public Pedido(Integer tempoDePreparo, List<PedidoItem> itens) {
		this.tempoDePreparo = tempoDePreparo;
		this.itens = itens;
		this.status = PedidoStatus.RECEBIDO;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}
}
