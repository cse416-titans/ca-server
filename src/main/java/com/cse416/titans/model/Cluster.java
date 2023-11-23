package com.cse416.titans.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Data
@Document(collection = "Clusters")
public class Cluster {
    @Id
    private String id;
    private String name;
    private String clusterSetId;
    private int numOfPlans;
    private DistrictPlan avgClusterBoundary;
    private String avgVotingSplit;
    private int avgNumOfOppDistricts;
    
    @DocumentReference
    @JsonIgnore
    private List<DistrictPlan> plans;

    @JsonIgnore
    public String getPlansAnalysis() {
        // TODO
        return null;
    }

    @JsonIgnore
    public String getAnalysis() {
        // TODO
        return null;
    }

    @JsonIgnore
    public String getBoundaries() {
        // TODO
        return null;
    }
}
