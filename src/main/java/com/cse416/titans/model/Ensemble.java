package com.cse416.titans.model;

import java.util.List;

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
    public String getDistanceMeasureEvaluation(String[] dms) {
        // TODO
        return null;
    }

    @JsonIgnore
    public String getNumOfClusters() {
        // TODO
        return null;
    }
}
