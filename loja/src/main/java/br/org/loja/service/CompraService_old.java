package br.org.loja.service;

import br.org.loja.controller.dto.CompraDTO;
import br.org.loja.controller.dto.InfoFornecedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService_old {
	
	@Autowired
	private RestTemplate client;

	@Autowired
	DiscoveryClient eurekaClient;

	public void realizaCompra(CompraDTO compra) {
		
		ResponseEntity<InfoFornecedorDTO> exchange =
			client.exchange("http://fornecedor/info/"+compra.getEndereco().getEstado(),
			HttpMethod.GET, null, InfoFornecedorDTO.class);
		
        eurekaClient.getInstances("fornecedor").stream()
				.forEach(fornecedor -> {
					System.out.println("Localhost:" + fornecedor.getPort());
				});
		
	}

}
