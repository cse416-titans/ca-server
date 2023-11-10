package com.cse416.titans.models;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Document(collection = "Ensembles")
public class Ensemble {
    @Id
    private String id;
    private String name;
    private String stateId;
    @DocumentReference(lazy = true)  
    @JsonIgnore
    private List<ClusterSet> clusterSets;

    public ClusterSet getClusterSet(String distanceMeasureId) {
        return clusterSets.stream()
            .filter(c -> c.getDistanceMeasureId().equals(distanceMeasureId))
            .findFirst()
            .orElseThrow(NoSuchElementException::new);
    }

    @JsonIgnore
    public String getDistanceMeasureEvaluation() {
        // TODO: Implement
        return null;
    }
}
