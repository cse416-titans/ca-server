package com.cse416.titans;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cse416.titans.models.DistrictPlan;
import com.cse416.titans.service.DistrictPlanService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ClientController {

    private final DistrictPlanService districtPlanService;

    @GetMapping("/plan")
    public List<DistrictPlan> getAllDistrictPlans() {
        return districtPlanService.getAllDistrictPlans();
    }
}
