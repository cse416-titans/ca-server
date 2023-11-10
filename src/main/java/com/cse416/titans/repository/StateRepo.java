package com.cse416.titans.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cse416.titans.models.State;

@Repository
public interface StateRepo extends MongoRepository<State, String>{
    
    @Query("{name: ?0}")
    State findByStateAbbr(String stateAbbr);
}
