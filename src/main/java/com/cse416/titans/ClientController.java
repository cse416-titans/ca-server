package com.cse416.titans;

import java.io.File;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cse416.titans.model.Ensemble;
import com.cse416.titans.serviceHandler.ServiceHandler;
import com.cse416.titans.utils.MakeSummary;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ClientController {

    private final ServiceHandler serviceHandler;
    private final MakeSummary makeSummary;

    public ClientController(ServiceHandler serviceHandler, MakeSummary makeSummary) {
        this.serviceHandler = serviceHandler;
        this.makeSummary = makeSummary;
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

    @GetMapping("/ensemble1")
    public Ensemble getEnsemble() {
        return serviceHandler.getEnsemble("Ensemble1");
    }
    
     @GetMapping("/hi")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/makeSummary")
    public void make() throws IOException, ParseException {
        File folder = new File("C:\\Users\\ufg11\\Desktop\\ca-server\\src\\main\\java\\com\\cse416\\titans\\reseources\\AZ");
        makeSummary.makeSummary(null, folder);
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
