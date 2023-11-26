package com.cse416.titans.service;

import org.springframework.stereotype.Service;

import com.cse416.titans.model.Cluster;
import com.cse416.titans.repository.ClusterRepo;

@Service
public class ClusterService {
    
    private ClusterRepo clusterRepo;

    // Constructor DI
    public ClusterService(ClusterRepo clusterRepo){
        this.clusterRepo = clusterRepo;
    }

    public Cluster getClusterById(String clusterId){
        return clusterRepo.findByClusterId(clusterId);
    }

    public void addCluster(Cluster cluster) {
        clusterRepo.save(cluster);
    }
}
