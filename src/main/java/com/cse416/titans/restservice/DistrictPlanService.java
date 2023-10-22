package com.cse416.titans.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cse416.titans.accessingmongodbdatarest.repository.DistrictPlanRepository;
import com.cse416.titans.models.DistrictPlan;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DistrictPlanService {
    
    @Autowired
    private DistrictPlanRepository districtPlanRepository;

    public List<DistrictPlan> getAllDistrictPlans() {
        return districtPlanRepository.findAll();
    }
}
