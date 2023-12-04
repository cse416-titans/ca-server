package com.cse416.titans.model;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
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
    private ArrayList<Double> coordinate;
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
    public JSONObject getAnalysis() {
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("name", name);
        json.put("coordinate", coordinate);
        json.put("numOfPlans", numOfPlans);
        json.put("planDistances", planDistances);
        json.put("avgPlanDistance", avgPlanDistance);
        json.put("whitePercentages", whitePercentages);
        json.put("aAPercentages", aAPercentages);
        json.put("asianPercentages", asianPercentages);
        json.put("hispanicPercentages", hispanicPercentages);
        json.put("indianPercentages", indianPercentages);
        return json;
    }

    @JsonIgnore
    public String getBoundaries() {
        // TODO
        return null;
    }
}
