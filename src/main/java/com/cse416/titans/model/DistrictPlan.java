package com.cse416.titans.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Document(collection="DistrictPlans")
public class DistrictPlan {
    @Id
    private String id;
    private String name;
    private String clusterId;
    private String ensembleId;
    private int numOfOppDistricts;
    private Double votingEstimate;
    private Boolean availability;
    private String geoJson;

    @DocumentReference
    @JsonIgnore
    private List<District> districts;

    @JsonIgnore
    public String getAnalysis() {
        // TODO
        return null;
    }
}
