package com.cse416.titans.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "States")
public class State {
    @Id
    private String id;
    private String name;
    private Double[] center;
    private DistrictPlan statePlan;

    @DocumentReference
    @JsonIgnore
    private List<Ensemble> ensembles;


    @JsonIgnore
    public String getCurrentPlan() {
        // TODO
        return null;
    }

    @JsonIgnore
    public String getEnsembleClusterAnalysis() {
        // TODO
        return null;
    }
}
