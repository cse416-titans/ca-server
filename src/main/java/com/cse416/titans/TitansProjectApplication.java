package com.cse416.titans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cse416.titans.models.ClusterSet;
import com.cse416.titans.models.Ensemble;
import com.cse416.titans.repository.ClusterSetRepo;
import com.cse416.titans.repository.EnsembleRepo;

@SpringBootApplication
public class TitansProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TitansProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ClusterSetRepo clusterSetrepo, EnsembleRepo ensembleRepo) {
		return args -> {
			List<ClusterSet> list = new ArrayList<>();
			
			ClusterSet clusterSet1 = new ClusterSet(
				"ClusterSet1",
				"ClusterSet1",
				"Ensemble1",
				"Optimal"
			);

			ClusterSet clusterSet2 = new ClusterSet(
				"ClusterSet2",
				"ClusterSet2",
				"EnsembleId1",
				"Hamming"
			);

			list.add(clusterSet1);
			list.add(clusterSet2);

			Ensemble ensemble = new Ensemble(
				"Ensemble1",
				"Ensemble1",
				"NY",
				list
			);

			clusterSetrepo.save(clusterSet1);
			clusterSetrepo.save(clusterSet2);
			ensembleRepo.save(ensemble);

		};
	}
}
