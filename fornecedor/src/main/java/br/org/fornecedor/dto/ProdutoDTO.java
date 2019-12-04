package br.org.fornecedor.dto;

import br.org.fornecedor.model.Produto;

import java.math.BigDecimal;

public class ProdutoDTO {

    private String nome;
    private String estado;
    private String descricao;
    private BigDecimal preco;

    public ProdutoDTO(String nome, String estado, String descricao, BigDecimal preco) {
        this.nome = nome;
        this.estado = estado;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto transformaParaObjeto(){
        return new Produto(nome, estado, descricao,preco);
    }
}
