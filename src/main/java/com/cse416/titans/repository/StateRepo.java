package com.cse416.titans.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cse416.titans.model.State;

@Repository
public interface StateRepo extends MongoRepository<State, String>{
    
    @Query("{id: ?0}")
    State findByStateId(String stateId);
}
