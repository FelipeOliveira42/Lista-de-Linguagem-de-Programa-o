package com.felipe.listaspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.felipe.listaspring.model.Linguagem;
import com.felipe.listaspring.repository.LinguagemRepository;

@SpringBootApplication
public class ListaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(LinguagemRepository linguagemRepository) {
		return args -> {
			linguagemRepository.deleteAll();

			Linguagem c = new Linguagem();
			c.setName("Angular");
			c.setCategory("front-end");

			linguagemRepository.save(c);
		};
	}
}
