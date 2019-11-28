package br.org.fornecedor.service;

import br.org.fornecedor.model.InfoFornecedor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InfoRepository extends MongoRepository<InfoFornecedor, String>{

	InfoFornecedor findByEstado(String estado);

}
