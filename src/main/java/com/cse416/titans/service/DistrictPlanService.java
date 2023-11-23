package com.cse416.titans.service;

import org.springframework.stereotype.Service;

import com.cse416.titans.model.DistrictPlan;
import com.cse416.titans.repository.DistrictPlanRepo;

@Service
public class DistrictPlanService {
    
    private DistrictPlanRepo districtPlanRepo;

    public DistrictPlanService(DistrictPlanRepo districtPlanRepo){
        this.districtPlanRepo = districtPlanRepo;
    }

    public DistrictPlan getPlanById(String planId){
        return districtPlanRepo.findByPlanId(planId);   
    }
}
