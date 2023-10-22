package com.cse416.titans.accessingmongodbdatarest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cse416.titans.models.DistrictPlan;

@Repository
public interface DistrictPlanRepository extends MongoRepository<DistrictPlan, String >{
    
}
