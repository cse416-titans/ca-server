package com.cse416.titans.service;

import org.springframework.stereotype.Service;

import com.cse416.titans.models.Ensemble;
import com.cse416.titans.repository.EnsembleRepo;

@Service
public class EnsembleService {

    private EnsembleRepo ensembleRepo;

    public EnsembleService(EnsembleRepo ensembleRepo){
        this.ensembleRepo = ensembleRepo;
    }

    public Ensemble getEnsembleByName(String name) {
        return ensembleRepo.findByEnsembleId(name);
    }
}
