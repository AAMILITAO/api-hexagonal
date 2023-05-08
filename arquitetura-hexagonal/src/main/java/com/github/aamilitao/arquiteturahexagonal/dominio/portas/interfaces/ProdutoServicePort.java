package com.github.aamilitao.arquiteturahexagonal.dominio.portas.interfaces;

import com.github.aamilitao.arquiteturahexagonal.dominio.dtos.EstoqueDTO;
import com.github.aamilitao.arquiteturahexagonal.dominio.dtos.ProdutoDTO;


import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

public interface ProdutoServicePort {

    List<ProdutoDTO> buscarProdutos();

    void criarProduto(ProdutoDTO produtoDTO);

    void atualizarEstoque(String sku, EstoqueDTO estoqueDTO) throws NotFoundException;
}
