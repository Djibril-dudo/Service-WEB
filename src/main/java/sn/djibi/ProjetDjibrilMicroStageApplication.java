package sn.djibi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.djibi.repository.ProductRepository;

@SpringBootApplication
@RepositoryRestResource
public class ProjetDjibrilMicroStageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetDjibrilMicroStageApplication.class, args);
	}

	CommandLineRunner start(ProductRepository productRepository) {
		return args -> {

			productRepository.findAll().forEach(produit -> {

						System.out.println(produit.toString());
					}

			);
		};

	}
}