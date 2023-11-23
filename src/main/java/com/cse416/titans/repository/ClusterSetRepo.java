package com.cse416.titans.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cse416.titans.model.ClusterSet;

@Repository
public interface ClusterSetRepo extends MongoRepository<ClusterSet, String>{
    
    @Query("{ensembleId: ?0, distanceMeasureId: ?1}")
    ClusterSet findByEnsembleAndDMId(String ensembleId, String distanceMeasureId);
}
