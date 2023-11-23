package com.cse416.titans.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cse416.titans.model.Ensemble;

@Repository
public interface EnsembleRepo extends MongoRepository<Ensemble, String>{
    
    @Query("{id: ?0}")
    Ensemble findByEnsembleId(String ensembleId);
}
