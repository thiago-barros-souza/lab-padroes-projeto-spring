package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr. Os seguintes módulos foram
 * Selecionados: Spring Data JPA - Spring Web - H2 Database - OpenFeign - Lombok
 * 
 * @author falvojr/thiago-barros-souza
 */

@EnableFeignClients
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
