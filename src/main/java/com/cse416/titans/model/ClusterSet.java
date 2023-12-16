package com.cse416.titans.model;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "ClusterSets")
public class ClusterSet {
    @Id
    private String id;
    private String name;
    private String ensembleId;
    private int numOfClusters;
    private int numOfPlans;
    private ArrayList<Double> clusterDistances;
    private Double avgClusterDistance;
    private ArrayList<Double> planDistances;
    private Double avgPlanDistance;
    private ArrayList<Integer> clusterSizes;
    private Double avgClusterSize;
    private Double copmuteTime;                    // Need to check type
    @DBRef(lazy = true)
    @JsonIgnore
    private List<Cluster> clusters;

    @JsonIgnore
    public JSONObject getAnalysis() {
        JSONObject json = new JSONObject();
        json.put("numOfClusters", numOfClusters);
        json.put("clusterDistances", clusterDistances);
        json.put("avgClusterDistance", avgClusterDistance);
        json.put("planDistances", planDistances);
        json.put("avgPlanDistance", avgPlanDistance);
        json.put("clusterSizes", clusterSizes);
        json.put("avgClusterSize", avgClusterSize);
        json.put("copmuteTime", copmuteTime);
        return json;
    }
}
