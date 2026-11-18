package co.edu.unbosque.parcial;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ParcialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParcialApplication.class, args);
	}

	/**
	 * Crea el bean ModelMapper que se usa para mapear entre DTOs y entidades.
	 *
	 * @return Instancia de ModelMapper
	 */
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
