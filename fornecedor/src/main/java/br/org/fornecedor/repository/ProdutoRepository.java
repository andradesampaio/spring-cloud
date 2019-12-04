package br.org.fornecedor.repository;

import br.org.fornecedor.model.Pedido;
import br.org.fornecedor.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, UUID> {

	List<Produto> findByEstado(String estado);
	
	List<Produto> findByIdIn(List<UUID> ids);

}
