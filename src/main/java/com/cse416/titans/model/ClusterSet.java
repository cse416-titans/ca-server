package com.cse416.titans.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
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
    @DBRef
    @JsonIgnore
    private List<Cluster> clusters;

    @JsonIgnore
    public String getClustersAnalysis() {
        // TODO
        return null;
    }

    @JsonIgnore
    public String getAnalysis() {
        // TODO
        return null;
    }
}
