package com.cse416.titans.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Document(collection = "States")
public class State {
    @Id
    private String id;
    private String name;
    private List<Ensemble> ensembles;
    private Double[] center;
    private DistrictPlan statePlan;

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
