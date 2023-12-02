package com.cse416.titans;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(value = "/state", produces = "application/json")
    public String getState(String stateId) {
        // TODO
        return null;
    }

    @GetMapping(value = "/cluster", produces = "application/json")
    public String getCluster(Boolean bool, String clusterId, int numOfPlans) {
        // TODO
        return null;
    }

    @GetMapping(value = "/plan", produces = "application/json")
    public String getDistrictPlan(String planId) {
        // TODO
        return null;
    }

    @GetMapping(value = "/ensemble", produces = "application/json")
    public String getEnsembleBoundary(String stateId) {
        // TODO
        return null;
    }

    @GetMapping(value = "/analysis/clusterSet", produces = "application/json")
    public String getClusterSetAnalysis(String ensembleId, String DMId) {
        // TODO
        return null;
    }

    @GetMapping(value = "/analysis/cluster", produces = "application/json")
    public String getClusterAnalysis(String clusterId) {
        // TODO
        return null;
    }

    @GetMapping(value = "/analysis/DMcomparison", produces = "application/json")
    public String getDMComparison(String ensembleId, String[] dms) {
        // TODO
        return null;
    }

    @GetMapping(value = "/analysis/association", produces = "application/json")
    public String getEnsembleClusterAssociation(String stateId) {
        // TODO
        return null;
    }

    @GetMapping("/cluster")
    public String getCluster1() {
        return serviceHandler.getCluster1("Cluster1");
    }
    
     @GetMapping("/hi")
    public String hello() {
        return "Hello!";
    }

    // @GetMapping("/hi")
    // public String Hello() {
    //     String s1 = "\"Ensemble1\":[{\"Optimal\": 100}, {\"Hamming\": 150}]";
    //     String s2 = "\"Ensemble2\":[{\"Optimal\": 100}, {\"Hamming\": 150}]";;
    //     String s3 = "{" + s1 + "," + s2 + "}";
    //     List<String> list = new ArrayList<>();
    //     list.add(s1);
    //     list.add(s2);

    //     ObjectMapper objectMapper = new ObjectMapper();
    //     try {
    //         String jsonArray =  objectMapper.writeValueAsString(list);
    //         return s3;

    //     } catch (Exception e) {
    //         return "Exception";
    //     }
    // }
    
}
