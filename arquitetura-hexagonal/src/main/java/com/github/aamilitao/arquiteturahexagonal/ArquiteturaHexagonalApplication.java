package com.github.aamilitao.arquiteturahexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.github.aamilitao.arquiteturahexagonal.infraestrutura.adaptadores.repositories.SpringProdutoRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = SpringProdutoRepository.class)

public class ArquiteturaHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquiteturaHexagonalApplication.class, args);
	}

}
