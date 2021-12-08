package com.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "com.thymeleaf.model")
@ComponentScan(basePackages = {"com.thymeleaf.*"})//Mapeia todas as pastas
@EnableJpaRepositories(basePackages = {"com.thymeleaf.repository"})
@EnableTransactionManagement
public class ProjetoThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoThymeleafApplication.class, args);
	}

}
