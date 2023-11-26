package com.cse416.titans.service;

import org.springframework.stereotype.Service;

import com.cse416.titans.model.Ensemble;
import com.cse416.titans.repository.EnsembleRepo;

@Service
public class EnsembleService {

    private EnsembleRepo ensembleRepo;

    public EnsembleService(EnsembleRepo ensembleRepo){
        this.ensembleRepo = ensembleRepo;
    }

    public Ensemble getEnsembleById(String ensembleId) {
        return ensembleRepo.findByEnsembleId(ensembleId);
    }

    public void addEnsemble(Ensemble ensemble) {
        ensembleRepo.save(ensemble);
    }
}
