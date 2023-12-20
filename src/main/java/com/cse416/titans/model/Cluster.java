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
    private Double avgDemocraticSplit;
    private Double avgRepublicanSplit;
    private Double avgNumOfWhiteOpps;
    private Double avgNumOfAAOpps;
    private Double avgNumOfAsianOpps;
    private Double avgNumOfHispanicOpps;
    private Double avgNumOfMajMinDistricts;
    private Double avgNumOfCompetitiveDistricts;

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
        // make truncated doubles
        Double truncatedAvgPlanDistance = (double) Math.round(avgPlanDistance * 100) / 100;
        Double truncatedAvgDemocraticSplit = (double) Math.round(avgDemocraticSplit * 100) / 100;
        Double truncatedAvgRepublicanSplit = (double) Math.round(avgRepublicanSplit * 100) / 100;
        Double truncatedAvgNumOfWhiteOpps = (double) Math.round(avgNumOfWhiteOpps * 100) / 100;
        Double truncatedAvgNumOfAAOpps = (double) Math.round(avgNumOfAAOpps * 100) / 100;
        Double truncatedAvgNumOfAsianOpps = (double) Math.round(avgNumOfAsianOpps * 100) / 100;
        Double truncatedAvgNumOfHispanicOpps = (double) Math.round(avgNumOfHispanicOpps * 100) / 100;

        Double truncatedAvgMajMinDistricts = (double) Math.round(avgNumOfMajMinDistricts * 100) / 100;
        Double truncatedAvgNumOfCompetitiveDistricts = (double) Math.round(avgNumOfCompetitiveDistricts * 100) / 100;

        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("name", name);
        json.put("coordinate", coordinate);
        json.put("numOfPlans", numOfPlans);
        json.put("planDistances", planDistances);
        json.put("avgPlanDistance", truncatedAvgPlanDistance);
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
        json.put("avgDemocraticSplit", truncatedAvgDemocraticSplit);
        json.put("avgRepublicanSplit", truncatedAvgRepublicanSplit);
        json.put("avgNumOfWhiteOpps", truncatedAvgNumOfWhiteOpps);
        json.put("avgNumOfAAOpps", truncatedAvgNumOfAAOpps);
        json.put("avgNumOfAsianOpps", truncatedAvgNumOfAsianOpps);
        json.put("avgNumOfHispanicOpps", truncatedAvgNumOfHispanicOpps);
        json.put("avgNumOfMajMinDistricts", truncatedAvgMajMinDistricts);
        json.put("avgNumOfCompetitiveDistricts", truncatedAvgNumOfCompetitiveDistricts);

        return json;
    }

    @JsonIgnore
    public String getBoundaries() {
        // TODO
        return null;
    }
}
