package com.cse416.titans.model;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "Ensembles")
public class Ensemble {
    @Id
    private String id;
    private String name;
    private String stateId;
    private int numOfPlans;
    @DBRef
    @JsonIgnore
    private List<ClusterSet> clusterSets;

    @JsonIgnore
    public JSONObject getNumOfClusters() {
        // TODO
        JSONObject json = new JSONObject();
        json.put("size", numOfPlans);
        int n = 0;
        for(ClusterSet set: getClusterSets()) {
            if(n == 0) {
                json.put("Hamming", set.getNumOfClusters());
            }
            else if(n == 1) {
                json.put("Entropy", set.getNumOfClusters());
            }
            else {
                json.put("json", set.getNumOfClusters());
            }
            n += 1;
        }
        return json;
    }
}
