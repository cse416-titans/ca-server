package com.cse416.titans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cse416.titans.models.Cluster;
import com.cse416.titans.models.ClusterSet;
import com.cse416.titans.models.Ensemble;
import com.cse416.titans.repository.ClusterRepo;
import com.cse416.titans.repository.ClusterSetRepo;
import com.cse416.titans.repository.EnsembleRepo;

@SpringBootApplication
public class TitansProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TitansProjectApplication.class, args);
	}

	// @Bean
	// CommandLineRunner runner(ClusterSetRepo clusterSetrepo, EnsembleRepo ensembleRepo, ClusterRepo clusterRepo) {
	// 	return args -> {
	// 		List<ClusterSet> clusterSetList = new ArrayList<>();
	// 		List<Cluster> clusterList = new ArrayList<>();

	// 		Cluster cluster1 = new Cluster("Cluster1", "Cluster1", "ClusterSet1");
	// 		Cluster cluster2 = new Cluster("Cluster2", "Cluster2", "ClusterSet1");
			
	// 		clusterList.add(cluster1);
	// 		clusterList.add(cluster2);

	// 		ClusterSet clusterSet1 = new ClusterSet(
	// 			"ClusterSet1",
	// 			"ClusterSet1",
	// 			"Ensemble1",
	// 			"Optimal",
	// 			clusterList
	// 		);

	// 		ClusterSet clusterSet2 = new ClusterSet(
	// 			"ClusterSet2",
	// 			"ClusterSet2",
	// 			"EnsembleId1",
	// 			"Hamming",
	// 			null
	// 		);

	// 		clusterSetList.add(clusterSet1);
	// 		clusterSetList.add(clusterSet2);

	// 		Ensemble ensemble = new Ensemble(
	// 			"Ensemble1",
	// 			"Ensemble1",
	// 			"NY",
	// 			clusterSetList
	// 		);

	// 		clusterRepo.save(cluster1);
	// 		clusterRepo.save(cluster2);
	// 		clusterSetrepo.save(clusterSet1);
	// 		clusterSetrepo.save(clusterSet2);
	// 		ensembleRepo.save(ensemble);

	// 	};
	// }
}
