package com.cse416.titans.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cse416.titans.model.Cluster;

@Repository
public interface ClusterRepo extends MongoRepository<Cluster, String>{
    
    @Query("{id: ?0}")
    Cluster findByClusterId(String clusterId);

    /* get first occurrence */
    @Query(value = "{}", sort = "{clusterId: 1}")
    Cluster findFirstByOrderByClusterIdAsc();
}
