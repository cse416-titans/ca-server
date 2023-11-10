package com.cse416.titans.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceHandler {
    
    private StateService stateService;
    private EnsembleService ensembleService;
    private ClusterSetService clusterSetService;
    private ClusterService clusterService;
    private DistrictPlanService districtPlanService;
    private DistrictService districtService;

    public ServiceHandler(
        StateService stateService,
        EnsembleService ensembleService,
        ClusterSetService clusterSetService,
        ClusterService clusterService,
        DistrictPlanService districtPlanService,
        DistrictService districtService
    )
    {
        this.stateService = stateService;
        this.ensembleService = ensembleService;
        this.clusterSetService = clusterSetService;
        this.clusterService = clusterService;
        this.districtPlanService = districtPlanService;
        this.districtService = districtService;
    }

    
}
