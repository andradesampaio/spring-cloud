package br.org.fornecedor.dto;



import br.org.fornecedor.model.Pedido;
import br.org.fornecedor.model.PedidoItem;
import br.org.fornecedor.model.PedidoStatus;

import java.util.List;

public class PedidoDTO {

    private Integer tempoDePreparo;
    private PedidoStatus status;
    private List<PedidoItem> itens;

    public PedidoDTO(Integer tempoDePreparo, List<PedidoItem> itens) {
        this.tempoDePreparo = tempoDePreparo;
        this.itens = itens;
        this.status = PedidoStatus.RECEBIDO;
    }


    public Pedido transformaParaObjeto(){
        return new Pedido(tempoDePreparo,itens);
    }


}
