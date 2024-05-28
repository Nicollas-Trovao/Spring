package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.model.Jogador;
import com.example.demo.repository.IJogadorRepository;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
@EnableJpaRepositories(basePackages = "com.example.demo.repository")
@EntityScan(basePackages = "com.example.demo.model")
public class SpringBootPrimeiroExemplo implements CommandLineRunner {


	private static final Logger log = LoggerFactory.getLogger(SpringBootPrimeiroExemplo.class);
	
	@Autowired
	private IJogadorRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPrimeiroExemplo.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		Jogador jogador = createJogador();
		repository.save(jogador);
	}
	
	private Jogador createJogador() {
        return Jogador.builder()
                .nome("Nicollas")
                .personagem("Apollo")
                .build();
    }
}