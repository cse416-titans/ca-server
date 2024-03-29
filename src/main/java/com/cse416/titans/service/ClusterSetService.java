package com.cse416.titans.service;

import org.springframework.stereotype.Service;

import com.cse416.titans.model.ClusterSet;
import com.cse416.titans.repository.ClusterSetRepo;

@Service
public class ClusterSetService {
    
    private ClusterSetRepo clusterSetRepo;

    public ClusterSetService(ClusterSetRepo clusterSetRepo){
        this.clusterSetRepo = clusterSetRepo;
    }

    public ClusterSet getClusterSetByEnsembleAndDMId(String ensembleId, String distanceMeasureId) {
        return clusterSetRepo.findByEnsembleAndDMId(ensembleId, distanceMeasureId);
    }

    public ClusterSet getClusterSetById(String clusterSetId) {
        return clusterSetRepo.findByClusterSetId(clusterSetId);
    }

    public ClusterSet getClusterSetByIdExcludeClusters(String clusterSetId) {
        return clusterSetRepo.findClusterSetByIdExcludeClusters(clusterSetId);
    }

    public ClusterSet addClusterSet(ClusterSet clusterSet) {
        return clusterSetRepo.save(clusterSet);
    }
}
