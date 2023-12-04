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

    @GetMapping(value = "/statePlan", produces = "application/json")
    public JSONObject getStatePlan(@RequestParam String stateId) {
        return serviceHandler.getStatePlan(stateId);
    }

    // Need Discussion
    // @GetMapping(value = "/clusterAvgBoundary", produces = "application/json")
    // public JSONObject getClusterAvgBoundary(@RequestParam Boolean showApprox, @RequestParam String clusterId, @RequestParam int numOfPlans) {
    //     // TODO
    //     return null;
    // }

    @GetMapping(value = "/plan", produces = "application/json")
    public JSONObject getDistrictPlan(@RequestParam String planId) {
        return serviceHandler.getDistrictPlan(planId);
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
    public JSONArray getEnsembleClusterAssociation(@RequestParam String stateId) {
        // TODO
        return serviceHandler.getEnsembleClusterAssociation(stateId);
    }

    @GetMapping("/test/plan")
    public DistrictPlan getTestPlan() {
        return serviceHandler.getTestPlan("AZ:ensemble-1:clusterSet-1:cluster-2:plan-3");
    }

    @GetMapping("/test/cluster")
    public Cluster getTestCluster() {
        return serviceHandler.getTestCluster("AZ:ensemble-1:clusterSet-1:cluster-2");
    }

    @GetMapping("/test/clusterSet")
    public ClusterSet getTestClusterSet() {
        return serviceHandler.getTestClusterSet("AZ:ensemble-1:clusterSet-1");
    }

    @GetMapping("/test/ensemble")
    public Ensemble getTestEnsemble() {
        return serviceHandler.getTestEnsemble("AZ:ensemble-1");
    }

    @GetMapping("/test/state")
    public State getTestState() {
        return serviceHandler.getTestState("AZ");
    }

    @GetMapping("/test/plan1")
    public JSONObject getTestPlan1() {
        return serviceHandler.getTestPlan1("AZ:ensemble-1:clusterSet-1:cluster-2:plan-5");
    }
}
