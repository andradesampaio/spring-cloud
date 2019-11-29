package br.org.loja.service;

import br.org.loja.client.FornecedorClient;
import br.org.loja.controller.dto.CompraDTO;
import br.org.loja.controller.dto.InfoFornecedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CompraService {
	

	@Autowired
	FornecedorClient fornecedorClient;

	public void realizaCompra(CompraDTO compra) {

		InfoFornecedorDTO infoPorEstado = fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());

		System.out.println(infoPorEstado.getEndereco());
		
	}

}
