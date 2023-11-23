package com.cse416.titans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cse416.titans.model.State;
import com.cse416.titans.repository.StateRepo;

@Service
public class StateService {
    
    @Autowired
    private StateRepo stateRepo;

    public State getStateById(String stateId){
        return stateRepo.findByStateId(stateId);
    }
}
