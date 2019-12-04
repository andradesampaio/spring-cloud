package br.org.fornecedor.dto;

import java.util.UUID;

public class ItemDoPedidoDTO {

	private UUID id;
	private int quantidade;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
