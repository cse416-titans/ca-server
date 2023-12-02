package com.cse416.titans.service;

import org.springframework.stereotype.Service;

import com.cse416.titans.model.State;
import com.cse416.titans.repository.StateRepo;

@Service
public class StateService {
    
    private StateRepo stateRepo;

    public StateService(StateRepo stateRepo) {
        this.stateRepo = stateRepo;
    }

    public State getStateById(String stateId) {
        return stateRepo.findByStateId(stateId);
    }

    public State addState(State state) {
        return stateRepo.save(state);
    }
}
