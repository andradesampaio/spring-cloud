package br.org.fornecedor.repository;

import br.org.fornecedor.model.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PedidoRepository extends MongoRepository<Pedido, UUID> {

}
