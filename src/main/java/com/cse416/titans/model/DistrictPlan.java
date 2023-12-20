package com.cse416.titans.model;

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
    private ArrayList<Double> coordinate; // Why calling it coordinate instead of coordinates?
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
    private int numOfMajMinDistricts;
    private int numOfCompetitiveDistricts;
    private ArrayList<Integer> aAOpps;
    private ArrayList<Integer> whiteOpps;
    private ArrayList<Integer> asianOpps;
    private ArrayList<Integer> hispanicOpps;
    private ArrayList<Integer> majMinDistricts;
    private ArrayList<Integer> competitiveDistricts;
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
    public JSONObject getAnalysis() {
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("name", name);
        json.put("coordinate", coordinate);
        json.put("totalPopulation", totalPopulation);
        json.put("totalDemocraticVotes", totalDemocraticVotes);
        json.put("totalRepublicanVotes", totalRepublicanVotes);
        json.put("democraticVotes", democraticVotes);
        json.put("republicanVotes", republicanVotes);
        json.put("democraticSplit", democraticSplit);
        json.put("republicanSplit", republicanSplit);
        json.put("numOfAAOpp", numOfAAOpp);
        json.put("numOfWhiteOpp", numOfWhiteOpp);
        json.put("numOfAsianOpp", numOfAsianOpp);
        json.put("numOfHispanicOpp", numOfHispanicOpp);
        json.put("numOfMajMinDistricts", numOfMajMinDistricts);
        json.put("numOfCompetitiveDistricts", numOfCompetitiveDistricts);
        json.put("aAOpps", aAOpps);
        json.put("whiteOpps", whiteOpps);
        json.put("majMinDistricts", majMinDistricts);
        json.put("asianOpps", asianOpps);
        json.put("hispanicOpps", hispanicOpps);
        json.put("whitePercentages", whitePercentages);
        json.put("aAPercentages", aAPercentages);
        json.put("asianPercentages", asianPercentages);
        json.put("hispanicPercentages", hispanicPercentages);
        json.put("indianPercentages", indianPercentages);
        json.put("avgWhitePercentage", avgWhitePercentage);
        json.put("avgAAPercentage", avgAAPercentage);
        json.put("avgAsianPercentage", avgAsianPercentage);
        json.put("avgHispanicPercentage", avgHispanicPercentage);
        json.put("avgIndianPercentage", avgIndianPercentage);
        json.put("competitiveDistricts", competitiveDistricts);
        json.put("availability", availability);

        return json;
    }
    
    @JsonIgnore
    public JSONObject getAnalysisWithGeoJson() {
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("name", name);
        json.put("coordinate", coordinate);
        json.put("totalPopulation", totalPopulation);
        json.put("totalDemocraticVotes", totalDemocraticVotes);
        json.put("totalRepublicanVotes", totalRepublicanVotes);
        json.put("democraticVotes", democraticVotes);
        json.put("republicanVotes", republicanVotes);
        json.put("democraticSplit", democraticSplit);
        json.put("republicanSplit", republicanSplit);
        json.put("numOfAAOpp", numOfAAOpp);
        json.put("numOfWhiteOpp", numOfWhiteOpp);
        json.put("numOfAsianOpp", numOfAsianOpp);
        json.put("numOfHispanicOpp", numOfHispanicOpp);
        json.put("numOfMajMinDistricts", numOfMajMinDistricts);
        json.put("numOfCompetitiveDistricts", numOfCompetitiveDistricts);
        json.put("aAOpps", aAOpps);
        json.put("whiteOpps", whiteOpps);
        json.put("majMinDistricts", majMinDistricts);
        json.put("asianOpps", asianOpps);
        json.put("hispanicOpps", hispanicOpps);
        json.put("whitePercentages", whitePercentages);
        json.put("aAPercentages", aAPercentages);
        json.put("asianPercentages", asianPercentages);
        json.put("hispanicPercentages", hispanicPercentages);
        json.put("indianPercentages", indianPercentages);
        json.put("avgWhitePercentage", avgWhitePercentage);
        json.put("avgAAPercentage", avgAAPercentage);
        json.put("avgAsianPercentage", avgAsianPercentage);
        json.put("avgHispanicPercentage", avgHispanicPercentage);
        json.put("avgIndianPercentage", avgIndianPercentage);
        json.put("competitiveDistricts", competitiveDistricts);
        json.put("availability", availability);
        json.put("geoJson", geoJson);

        return json;
    }

}
