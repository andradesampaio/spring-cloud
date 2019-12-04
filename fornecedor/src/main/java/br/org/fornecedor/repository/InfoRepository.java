package br.org.fornecedor.repository;

import br.org.fornecedor.model.InfoFornecedor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface InfoRepository extends MongoRepository<InfoFornecedor, String>{

	InfoFornecedor findByEstado(String estado);

}
