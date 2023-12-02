package com.cse416.titans.model;

import java.awt.Point;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="DistrictPlans")
public class DistrictPlan {
    @Id
    private String id;
    private String name;
    private String clusterId;
    private Point coordinates; // Why calling it coordinate instead of coordinates?
    private int totalPopulation; // necessary? Every district plans will consequently have same number of totalPopulation for sure
    private int totalDemocraticVotes;
    private int totalRepublicanVotes;
    private ArrayList<Integer> democraticVotes;
    private ArrayList<Integer> republicanVotes;
    private ArrayList<Integer> democraticSplit;
    private ArrayList<Integer> republicanSplit;
    private int numOfAAOpp;
    private int numOfWhiteOpp;
    private int numOfAsianOpp;
    private int numOfHispanicOpp;
    private ArrayList<Integer> aAOpps;
    private ArrayList<Integer> whiteOpps;
    private ArrayList<Integer> asianOpps;
    private ArrayList<Integer> hispanicOpps;
    private ArrayList<Double> whitePercentages; // Index matching the district number?
    private ArrayList<Double> aAPercentages;
    private ArrayList<Double> asianPercentages;
    private ArrayList<Double> hispanicPercentages;
    private ArrayList<Double> indianPercentages;         // Information of Indian Necessary?
    private Double avgWhitePercentage;
    private Double avgAAPercentage;
    private Double avgAsianPercentage;
    private Double avgHispanicPercentage;
    private Double avgIndianPercentage;            // Same, Necessary?
    private boolean availability;
    private JSONObject geoJson;

    @JsonIgnore
    public String getAnalysis() {
        // TODO
        return null;
    }
}
