package com.cse416.titans.model;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

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
    private int democrat;
    private int republic;
    private int numOfAAOpp;
    private int numOfWhiteOpp;
    private int numOfAsianOpp;
    private int numOfHispanicOpp;
    private Boolean availability;
    private JSONObject geoJson;

    @DocumentReference
    @JsonIgnore
    private List<District> districts;

    @JsonIgnore
    public String getAnalysis() {
        // TODO
        return null;
    }
}
