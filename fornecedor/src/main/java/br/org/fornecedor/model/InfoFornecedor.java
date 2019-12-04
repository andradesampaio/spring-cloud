package br.org.fornecedor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "fornecedor")
public class InfoFornecedor {

	@Id
	private String id;
	private String nome;
	private String estado;
	private String endereco;


	
}
