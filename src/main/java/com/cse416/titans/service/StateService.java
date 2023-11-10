package com.cse416.titans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cse416.titans.models.State;
import com.cse416.titans.repository.StateRepo;

@Service
public class StateService {
    
    @Autowired
    private StateRepo stateRepo;

    public State getStateByAbbr(String stateAbbr){
        return stateRepo.findByStateAbbr(stateAbbr);
    }
}
