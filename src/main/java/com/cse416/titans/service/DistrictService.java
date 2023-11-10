package com.cse416.titans.service;

import org.springframework.stereotype.Service;

import com.cse416.titans.repository.DistrictPlanRepo;

@Service
public class DistrictService {
    
    private DistrictPlanRepo districtPlanRepo;

    public DistrictService(DistrictPlanRepo districtPlanRepo){
        this.districtPlanRepo = districtPlanRepo;
    }
}
