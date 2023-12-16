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
    private ArrayList<Integer> democraticSplits;
    private ArrayList<Integer> republicanSplits;
    private ArrayList<Integer> numOfWhiteOpps;
    private ArrayList<Integer> numOfAAOpps;
    private ArrayList<Integer> numOfAsianOpps;
    private ArrayList<Integer> numOfHispanicOpps;
    private ArrayList<ArrayList<Double>> whitePercentages;
    private ArrayList<ArrayList<Double>> aAPercentages;
    private ArrayList<ArrayList<Double>> asianPercentages;
    private ArrayList<ArrayList<Double>> hispanicPercentages;
    private ArrayList<ArrayList<Double>> indianPercentages;
    private Integer avgDemocraticSplit;
    private Integer avgRepublicanSplit;
    private Integer avgNumOfWhiteOpps;
    private Integer avgNumOfAAOpps;
    private Integer avgNumOfAsianOpps;
    private Integer avgNumOfHispanicOpps;

    @DBRef(lazy = true)
    @JsonIgnore
    private DistrictPlan avgPlan;
    @DBRef(lazy = true)
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
        json.put("democraticSplits", democraticSplits);
        json.put("republicanSplits", republicanSplits);
        json.put("numOfWhiteOpps", numOfWhiteOpps);
        json.put("numOfAAOpps", numOfAAOpps);
        json.put("numOfAsianOpps", numOfAsianOpps);
        json.put("numOfHispanicOpps", numOfHispanicOpps);
        json.put("whitePercentages", whitePercentages);
        json.put("aAPercentages", aAPercentages);
        json.put("asianPercentages", asianPercentages);
        json.put("hispanicPercentages", hispanicPercentages);
        json.put("indianPercentages", indianPercentages);
        json.put("avgDemocraticSplit", avgDemocraticSplit);
        json.put("avgRepublicanSplit", avgRepublicanSplit);
        json.put("avgNumOfWhiteOpps", avgNumOfWhiteOpps);
        json.put("avgNumOfAAOpps", avgNumOfAAOpps);
        json.put("avgNumOfAsianOpps", avgNumOfAsianOpps);
        json.put("avgNumOfHispanicOpps", avgNumOfHispanicOpps);
        //json.put("avgPlan", avgPlan.getGeoJson());
        return json;
    }

    @JsonIgnore
    public String getBoundaries() {
        // TODO
        return null;
    }
}
