package br.edu.infnet.appGeracaoPropostas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppGeracaoPropostasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppGeracaoPropostasApplication.class, args);
	}

}
