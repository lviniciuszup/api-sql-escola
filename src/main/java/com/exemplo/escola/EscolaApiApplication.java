package com.exemplo.escola;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscolaApiApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure().load();

		String dbUsername = dotenv.get("DB_USERNAME");
		String dbPassword = dotenv.get("DB_PASSWORD");

		if (dbUsername == null || dbPassword == null){
			throw new IllegalStateException("As variaveis de ambiente precisam ser definidas no arquivo .env");
		}

		System.setProperty("DB_USERNAME", dbUsername);
		System.setProperty("DB_PASSWORD", dbPassword);

		SpringApplication.run(EscolaApiApplication.class, args);
	}


}
