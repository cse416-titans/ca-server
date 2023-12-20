package com.cse416.titans;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cse416.titans.model.Cluster;
import com.cse416.titans.model.ClusterSet;
import com.cse416.titans.model.DistrictPlan;
import com.cse416.titans.model.Ensemble;
import com.cse416.titans.model.State;
import com.cse416.titans.serviceHandler.ServiceHandler;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ClientController {

    private final ServiceHandler serviceHandler;
    // private final MakeSummary makeSummary;

    public ClientController(ServiceHandler serviceHandler) {
        this.serviceHandler = serviceHandler;
        // this.makeSummary = makeSummary;
    }

    // Need Discussion
    // @GetMapping(value = "/clusterAvgBoundary", produces = "application/json")
    // public JSONObject getClusterAvgBoundary(@RequestParam Boolean showApprox, @RequestParam String clusterId, @RequestParam int numOfPlans) {
    //     // TODO
    //     return null;
    // }

    @GetMapping(value = "/stateSummary", produces = "application/json")
    public JSONObject getStateSummary(@RequestParam String stateId) {
        return serviceHandler.getStateSummary(stateId);
    }
    
    @GetMapping(value = "/plan", produces = "application/json")
    public JSONObject getDistrictPlan(@RequestParam String planId) {
        return serviceHandler.getDistrictPlan(planId);
    }

    @GetMapping(value = "/planSummary", produces = "application/json")
    public JSONObject getDistrictPlanSummary(@RequestParam String planId) {
        return serviceHandler.getDistrictPlanSummary(planId);
    }

    @GetMapping(value = "/clusterAvgPlan", produces = "application/json")
    public JSONObject getClusterAvgPlan(@RequestParam String clusterId) {
        System.out.println("clusterId: " + clusterId);
        return serviceHandler.getClusterAvgPlan(clusterId);
    }

    // Need Discussion. Might be Unnecessary
    // @GetMapping(value = "/ensembleBoundary", produces = "application/json")
    // public JSONObject getEnsembleBoundary(@RequestParam String stateId) {
    //     // TODO
    //     return serviceHandler.getEnsembleBoundary(stateId);
    // }

    @GetMapping(value = "/analysis/clusterSet", produces = "application/json")
    public JSONArray getClusterSetAnalysis(@RequestParam String ensembleId, String DMId) {
        return serviceHandler.getClusterSetAnalysis(ensembleId, DMId);
    }

    @GetMapping(value = "/analysis/cluster", produces = "application/json")
    public JSONArray getClusterAnalysis(@RequestParam String clusterId) {
        return serviceHandler.getClusterAnalysis(clusterId);
    }

    @GetMapping(value = "/analysis/DMcomparison", produces = "application/json")
    public JSONArray getDMComparison(@RequestParam String ensembleId) {
        // TODO
        return serviceHandler.getDMComparison(ensembleId);
    }

    @GetMapping(value = "/analysis/association", produces = "application/json")
    public JSONObject getEnsembleClusterAssociation(@RequestParam String stateId) {
        return serviceHandler.getEnsembleClusterAssociation(stateId);
    }

    @GetMapping(value = "/analysis/state", produces = "application/json")
    public JSONObject getStateAnalysis(@RequestParam String stateId) {
        return serviceHandler.getStateAnalysis(stateId);
    }

    @GetMapping(value="/analysis/ensemble", produces = "application/json")
    public JSONObject getEnsembleAnalysis(@RequestParam String ensembleId) {
        return serviceHandler.getEnsembleAnalysis(ensembleId);
    }
}
