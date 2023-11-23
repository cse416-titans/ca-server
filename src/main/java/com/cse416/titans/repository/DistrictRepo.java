package com.cse416.titans.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cse416.titans.model.District;

@Repository
public interface DistrictRepo extends MongoRepository<District, String>{
    
}
