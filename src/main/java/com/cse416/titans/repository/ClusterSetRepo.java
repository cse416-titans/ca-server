package com.cse416.titans.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cse416.titans.model.ClusterSet;

@Repository
public interface ClusterSetRepo extends MongoRepository<ClusterSet, String>{
    
    @Query("{ensembleId: ?0, name: ?1}")
    ClusterSet findByEnsembleAndDMId(String ensembleId, String distanceMeasureId);

    @Query("{id: ?0}")
    ClusterSet findByClusterSetId(String clusterSetId);

    /* query that find by clusterSetId but exclude 'clusters' field */
    @Query(value = "{id: ?0}", fields = "{clusters: 0}")
    ClusterSet findClusterSetByIdExcludeClusters(String clusterSetId);

}
