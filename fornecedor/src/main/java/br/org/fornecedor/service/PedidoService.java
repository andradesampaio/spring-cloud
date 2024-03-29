package br.org.fornecedor.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.org.fornecedor.dto.ItemDoPedidoDTO;
import br.org.fornecedor.model.Pedido;
import br.org.fornecedor.model.PedidoItem;
import br.org.fornecedor.model.Produto;
import br.org.fornecedor.repository.PedidoRepository;
import br.org.fornecedor.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PedidoService {
	
    @Autowired
	private PedidoRepository pedidoRepository;
    @Autowired
	private ProdutoRepository produtoRepository;


	public Pedido realizaPedido(List<ItemDoPedidoDTO> itens) {

		if(itens == null) {
			return null;
		}

		List<PedidoItem> pedidoItens = toPedidoItem(itens);
		Pedido pedido = new Pedido(10, pedidoItens);
		pedido.setTempoDePreparo(itens.size());
		return pedidoRepository.save(pedido);
	}

	public Pedido getPedidoPorId(UUID id) {
		return this.pedidoRepository.findById(id).orElse(new Pedido());
	}

	private List<PedidoItem> toPedidoItem(List<ItemDoPedidoDTO> itens) {

		List<UUID> idsProdutos = itens
				.stream()
				.map(item -> item.getId())
				.collect(Collectors.toList());

		List<Produto> produtosDoPedido = produtoRepository.findByIdIn(idsProdutos);

		List<PedidoItem> pedidoItens = itens
			.stream()
			.map(item -> {
				Produto produto = produtosDoPedido
						.stream()
						.filter(p -> p.getId().equals(item.getId()))
						.findFirst().get();

				PedidoItem pedidoItem = new PedidoItem();
				pedidoItem.setProduto(produto);
				pedidoItem.setQuantidade(item.getQuantidade());
				return pedidoItem;
			})
			.collect(Collectors.toList());
		return pedidoItens;
	}

	public Pedido salvar(Pedido pedido) {

		return pedidoRepository.save(pedido);
	}
}
