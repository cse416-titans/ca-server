package com.cse416.titans.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cse416.titans.models.DistrictPlan;

@Repository
public interface DistrictPlanRepo extends MongoRepository<DistrictPlan, String>{
    
    @Query("{id: ?0}")
    DistrictPlan findByPlanId(String planId);
}
