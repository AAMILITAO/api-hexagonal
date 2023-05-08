package com.github.aamilitao.arquiteturahexagonal.aplicacao.adaptatores.controllers;

import com.github.aamilitao.arquiteturahexagonal.dominio.dtos.EstoqueDTO;
import com.github.aamilitao.arquiteturahexagonal.dominio.dtos.ProdutoDTO;
import com.github.aamilitao.arquiteturahexagonal.dominio.portas.interfaces.ProdutoServicePort;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private final ProdutoServicePort produtoServicePort;

    public ProdutoController(ProdutoServicePort produtoServicePort) {
        this.produtoServicePort = produtoServicePort;
    }

    @PostMapping
    void criarProdutos(@RequestBody ProdutoDTO produtoDTO) {
        produtoServicePort.criarProduto(produtoDTO);
    }

    @GetMapping
    List<ProdutoDTO> getProdutos() {
        return produtoServicePort.buscarProdutos();
    }

    @PutMapping(value = "/{sku}")
    void atualizarEstoque(@PathVariable String sku, @RequestBody EstoqueDTO estoqueDTO) throws NotFoundException {
        produtoServicePort.atualizarEstoque(sku, estoqueDTO);
    }
}
