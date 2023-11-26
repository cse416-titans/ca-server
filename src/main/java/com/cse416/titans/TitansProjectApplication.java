package com.cse416.titans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TitansProjectApplication{

	public static void main(String[] args) {
		SpringApplication.run(TitansProjectApplication.class, args);
	}


	// @Bean
	// CommandLineRunner runner(EnsembleRepo ensembleRepo) {
	// 	return args -> {
	// 		Ensemble ensemble = new Ensemble();
	// 		ensemble.setId("Ensemble1");
	// 		ensemble.setName("Ensemble1");
	// 		ensemble.setStateId("AZ");

	// 		ensembleRepo.save(ensemble);

	// 	};
	// }
}
