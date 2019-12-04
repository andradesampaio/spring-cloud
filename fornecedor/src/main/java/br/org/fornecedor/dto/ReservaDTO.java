package br.org.fornecedor.dto;

import java.util.UUID;

public class ReservaDTO {

	public UUID idReserva;
	
	public Integer tempoDePreparo;

	public UUID getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(UUID idReserva) {
		this.idReserva = idReserva;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}
	
}
