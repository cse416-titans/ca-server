package com.cse416.titans.service;

import org.springframework.stereotype.Service;

import com.cse416.titans.models.Cluster;
import com.cse416.titans.repository.ClusterRepo;

@Service
public class ClusterService {
    
    private ClusterRepo clusterRepo;

    // Constructor DI
    public ClusterService(ClusterRepo clusterRepo){
        this.clusterRepo = clusterRepo;
    }

    public Cluster getCluserById(String clusterId){
        return clusterRepo.findByClusterId(clusterId);
    }
}
