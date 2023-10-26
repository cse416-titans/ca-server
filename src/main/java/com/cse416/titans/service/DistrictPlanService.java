package com.cse416.titans.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cse416.titans.accessingmongodbdatarest.repository.DistrictPlanRepository;
import com.cse416.titans.models.DistrictPlan;

@Service
public class DistrictPlanService {
    
    @Autowired
    private DistrictPlanRepository districtPlanRepository;

    public List<DistrictPlan> getAllDistrictPlans() {
        return districtPlanRepository.findAll();
    }
}
