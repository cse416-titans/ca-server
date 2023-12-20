package com.cse416.titans.serviceHandler;

import java.util.List;

import org.bson.json.JsonObject;
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
            DistrictService districtService) {
        this.stateService = stateService;
        this.ensembleService = ensembleService;
        this.clusterSetService = clusterSetService;
        this.clusterService = clusterService;
        this.districtPlanService = districtPlanService;
        this.districtService = districtService;
    }

    public JSONObject getStatePlan(String stateId) {
        // TODO
        DistrictPlan plan = districtPlanService.getPlanById("curr_az.json");
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

    public JSONObject getDistrictPlanSummary(String planId) {
        DistrictPlan plan = districtPlanService.getPlanById(planId);
        return plan.getAnalysisWithGeoJson();
    }

    // public JSONObject getEnsembleBoundary(String stateId) {
    //     // TODO
    //     State state = stateService.getStateById(stateId);

    //     return null;
    // }

    public JSONArray getClusterSetAnalysis(String ensembleId, String DMId) {
        System.err.println("Current Time: " + System.currentTimeMillis());
        ClusterSet clusterSet = clusterSetService.getClusterSetById(ensembleId + ":" + DMId);
        System.err.println("Current Time: " + System.currentTimeMillis());

        List<Cluster> clusters = clusterSet.getClusters();
        JSONArray jsonArr = new JSONArray();
        for (Cluster cluster : clusters) {
            jsonArr.add(cluster.getAnalysis());
        }
        return jsonArr;
    }

    public JSONArray getClusterAnalysis(String clusterId) {
        // print current time
        System.err.println("Current Time: " + System.currentTimeMillis());
        Cluster cluster = clusterService.getClusterById(clusterId);
        System.err.println("Current Time: " + System.currentTimeMillis());
        List<DistrictPlan> plans = cluster.getPlans();
        JSONArray jsonArr = new JSONArray();
        for (DistrictPlan plan : plans) {
            jsonArr.add(plan.getAnalysis());
        }
        return jsonArr;
    }

    public JSONArray getDMComparison(String ensembleId) {
        // TODO
        Ensemble ensemble = ensembleService.getEnsembleById(ensembleId);
        List<ClusterSet> clusterSets = ensemble.getClusterSets();
        JSONArray jsonArr = new JSONArray();
        for (ClusterSet set : clusterSets) {
            jsonArr.add(set.getAnalysis());
        }
        return jsonArr;
    }

    public JSONObject getStateSummary(String stateId) {
        State state = stateService.getStateById(stateId);
        Ensemble ensemble = state.getEnsembles().get(0);
        ClusterSet clusterSet = ensemble.getClusterSets().get(0);
        Cluster cluster = clusterSet.getClusters().get(0);
        DistrictPlan plan = cluster.getPlans().get(0);
        return plan.getAnalysis();
    }

    public JSONObject getStateAnalysis(String stateId) {
        State state = stateService.getStateById(stateId);
        return state.getAnalysis();
    }

    public JSONObject getEnsembleAnalysis(String ensembleId) {
        Ensemble ensemble = ensembleService.getEnsembleById(ensembleId);
        return ensemble.getAnalysis();
    }

    public JSONObject getEnsembleClusterAssociation(String stateId) {
        State state = stateService.getStateById(stateId);
        List<Ensemble> ensembles = state.getEnsembles();
        JSONObject summary = new JSONObject();
        for (Ensemble ensemble : ensembles) {
            JSONObject json = new JSONObject();
            for (ClusterSet clusterSet : ensemble.getClusterSets()) {
                json.put(clusterSet.getName(), clusterSet.getNumOfClusters());
            }
            summary.put(ensemble.getName(), json);
        }
        return summary;
    }
}
