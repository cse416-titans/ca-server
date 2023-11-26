package com.cse416.titans.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "Districts")
public class District {
    @Id
    private String id;
    private String name;
    private String planId;
    private int totalPopulation;
    private int numOfAA;
    private int numOfAsian;
    private int numOfDemocraticVotes;
    private int numOfRepublicanVotes;
    private Double votingMargin;
    
    @JsonIgnore
    public String toGeoJson() {
        // TODO
        return null;
    }
}
