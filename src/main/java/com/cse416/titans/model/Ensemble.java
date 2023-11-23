package com.cse416.titans.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Document(collection = "Ensembles")
public class Ensemble {
    @Id
    private String id;
    private String name;
    private String stateId;
    private int size;
    
    @DocumentReference
    @JsonIgnore
    private List<ClusterSet> clusterSets;

    // public ClusterSet getClusterSet(String distanceMeasureId) {
    //     return clusterSets.stream()
    //         .filter(c -> c.getDistanceMeasureId().equals(distanceMeasureId))
    //         .findFirst()
    //         .orElseThrow(NoSuchElementException::new);
    // }

    // @JsonIgnore
    // public int getNumOfPlans() {
    //     // TODO
    //     return 0;
    // } 

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
