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
@Document(collection = "States")
public class State {
    @Id
    private String id;
    private String name;
    private ArrayList<Double> center;          // Need to check
    private DistrictPlan statePlan;
    @DBRef
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
