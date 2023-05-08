package com.github.aamilitao.arquiteturahexagonal.dominio.portas.repositories;

import com.github.aamilitao.arquiteturahexagonal.dominio.Produto;

import java.util.List;

public interface ProdutoRepositoryPort {
    List<Produto> buscarTodos();

    Produto buscarPeloSku(String sku);

    void salvar(Produto produto);
}
