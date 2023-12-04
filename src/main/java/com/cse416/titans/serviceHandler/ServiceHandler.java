package com.cse416.titans.serviceHandler;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import com.cse416.titans.model.Cluster;
import com.cse416.titans.model.ClusterSet;
import com.cse416.titans.model.DistrictPlan;
import com.cse416.titans.model.Ensemble;
import com.cse416.titans.model.State;
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

    public JSONObject getStatePlan(String stateId) {
        // TODO
        State state = stateService.getStateById(stateId);
        DistrictPlan plan = state.getStatePlan();
        JSONObject geoJson = plan.getGeoJson();
        return geoJson;
    }

    // public JSONObject getClusterAvgBoundary(Boolean bool, String clusterId, int numOfPlans) {
    //     // TODO
    //     return null;
    // }

    public JSONObject getClusterAvgPlan(String clusterId) {
        Cluster cluster = clusterService.getClusterById(clusterId);
        return cluster.getAvgPlan().getGeoJson();
    }

    public JSONObject getDistrictPlan(String planId) {
        DistrictPlan plan = districtPlanService.getPlanById(planId);
        return plan.getGeoJson();
    }

    // public JSONObject getEnsembleBoundary(String stateId) {
    //     // TODO
    //     State state = stateService.getStateById(stateId);

    //     return null;
    // }

    public JSONArray getClusterSetAnalysis(String ensembleId, String DMId) {
        ClusterSet clusterSet = clusterSetService.getClusterSetByEnsembleAndDMId(ensembleId, DMId);
        List<Cluster> clusters = clusterSet.getClusters();
        JSONArray jsonArr = new JSONArray();
        for(Cluster cluster:clusters) {
            jsonArr.add(cluster.getAnalysis());
        }
        return jsonArr;
    }

    public JSONArray getClusterAnalysis(String clusterId) {
        Cluster cluster = clusterService.getClusterById(clusterId);
        List<DistrictPlan> plans = cluster.getPlans();
        JSONArray jsonArr = new JSONArray();
        for(DistrictPlan plan:plans) {
            jsonArr.add(plan.getAnalysis());
        }
        return jsonArr;
    }

    public JSONArray getDMComparison(String ensembleId) {
        // TODO
        Ensemble ensemble = ensembleService.getEnsembleById(ensembleId);
        List<ClusterSet> clusterSets = ensemble.getClusterSets();
        JSONArray jsonArr = new JSONArray();
        for(ClusterSet set:clusterSets) {
            jsonArr.add(set.getAnalysis());
        }
        return jsonArr;
    }

    public JSONArray getEnsembleClusterAssociation(String stateId) {
        // TODO
        State state = stateService.getStateById(stateId);
        List<Ensemble> ensembles = state.getEnsembles();
        JSONArray jsonArr = new JSONArray();
        for(Ensemble ensemble:ensembles) {
            jsonArr.add(ensemble.getNumOfClusters());
        }
        return jsonArr;
    }

    // Testing Codes
    public DistrictPlan getTestPlan(String id) {
        return districtPlanService.getPlanById(id);
    }

    public Cluster getTestCluster(String id) {
        return clusterService.getClusterById(id);
    }

    public ClusterSet getTestClusterSet(String id) {
        return clusterSetService.getClusterSetById(id);
    }

    public Ensemble getTestEnsemble(String id) {
        return ensembleService.getEnsembleById(id);
    }

    public State getTestState(String id) {
        return stateService.getStateById(id);
    }

    public JSONObject getTestPlan1(String id) {
        DistrictPlan plan = districtPlanService.getPlanById(id);
        return plan.getGeoJson();
    }
}
