package com.cse416.titans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cse416.titans.models.Ensemble;
import com.cse416.titans.repository.EnsembleRepo;

@Service
public class EnsembleService {

    @Autowired
    private EnsembleRepo ensembleRepo;

    public Ensemble getEnsembleByName(String name) {
        return ensembleRepo.findByEnsembleName(name);
    }
}
