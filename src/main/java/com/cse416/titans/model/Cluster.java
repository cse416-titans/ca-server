package com.cse416.titans.model;

import java.awt.Point;
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
@Document(collection = "Clusters")
public class Cluster {
    @Id
    private String id;
    private String name;
    private String clusterSetId;
    private Point coordinate;
    private int numOfPlans;
    private ArrayList<Double> planDistances;
    private Double avgPlanDistance;
    // private String avgClusterBoundary;
    private ArrayList<ArrayList<Double>> whitePercentages;
    private ArrayList<ArrayList<Double>> aAPercentages;
    private ArrayList<ArrayList<Double>> asianPercentages;
    private ArrayList<ArrayList<Double>> hispanicPercentages;
    private ArrayList<ArrayList<Double>> indianPercentages;
    @DBRef
    @JsonIgnore
    private DistrictPlan avgPlan;
    @DBRef
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
