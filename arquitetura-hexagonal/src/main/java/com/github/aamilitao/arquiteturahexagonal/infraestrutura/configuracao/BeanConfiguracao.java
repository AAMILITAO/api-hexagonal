package com.github.aamilitao.arquiteturahexagonal.infraestrutura.configuracao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.aamilitao.arquiteturahexagonal.dominio.adaptadores.services.PedidoServiceImp;
import com.github.aamilitao.arquiteturahexagonal.dominio.portas.interfaces.ProdutoServicePort;
import com.github.aamilitao.arquiteturahexagonal.dominio.portas.repositories.ProdutoRepositoryPort;

@Configuration
public class BeanConfiguracao {

    @Bean
    ProdutoServicePort produtoService(ProdutoRepositoryPort produtoRepositoryPort) {
        return new PedidoServiceImp(produtoRepositoryPort);
    }
}
