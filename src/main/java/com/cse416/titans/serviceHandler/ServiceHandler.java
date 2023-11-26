package com.cse416.titans.serviceHandler;

import org.springframework.stereotype.Service;

import com.cse416.titans.model.Ensemble;
import com.cse416.titans.service.ClusterService;
import com.cse416.titans.service.ClusterSetService;
import com.cse416.titans.service.DistrictPlanService;
import com.cse416.titans.service.DistrictService;
import com.cse416.titans.service.EnsembleService;
import com.cse416.titans.service.StateService;

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

    public String getState(String stateId) {
        // TODO
        return null;
    }

    public String getClusteer(Boolean bool, String clusterId, int numOfPlans) {
        // TODO
        return null;
    }

    public String getDistrictPlan(String planId) {
        // TODO
        return null;
    }

    public String getEnsembleBoundary(String stateId) {
        // TODO
        return null;
    }

    public String getClusterSetAnalysis(String ensembleId, String DMId) {
        // TODO
        return null;
    }

    public String getClusterAnalysis(String clusterId) {
        // TODO
        return null;
    }

    public String getDMComparison(String ensembleId, String[] dms) {
        // TODO
        return null;
    }

    public String getEnsembleClusterAssociation(String stateId) {
        // TODO
        return null;
    }

    public Ensemble getEnsemble(String id) {
        return ensembleService.getEnsembleById(id);
    }
}
