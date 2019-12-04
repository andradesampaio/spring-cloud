package br.org.fornecedor.controller;

import br.org.fornecedor.dto.PedidoDTO;
import br.org.fornecedor.dto.ProdutoDTO;
import br.org.fornecedor.model.InfoFornecedor;
import br.org.fornecedor.model.Pedido;
import br.org.fornecedor.model.Produto;
import br.org.fornecedor.service.InfoService;
import br.org.fornecedor.service.PedidoService;
import br.org.fornecedor.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService infoService;
	@Autowired
	private PedidoService pedidoService;
	@Autowired
	private ProdutoService produtoService;


	@RequestMapping("/{estado}")
	public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {
		return infoService.getInfoPorEstado(estado);
	}

	@PostMapping("/pedido")
	public ResponseEntity<Pedido> salvarPedido(@RequestBody PedidoDTO pedidoDTO) {
		Pedido pedido = pedidoService.salvar(pedidoDTO.transformaParaObjeto());
		return new ResponseEntity<>(pedido , HttpStatus.CREATED);
	}

	@PostMapping("/produto")
	public ResponseEntity<Produto> salvarProduto(@RequestBody ProdutoDTO produtoDTO) {
		Produto Produto = produtoService.salvar(produtoDTO.transformaParaObjeto());
		return new ResponseEntity<>(Produto , HttpStatus.CREATED);
	}
}
