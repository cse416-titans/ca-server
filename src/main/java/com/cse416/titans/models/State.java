package com.cse416.titans.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "States")
public class State {
    @Id
    private String id;
    private String name;
    private List<Ensemble> ensembles;
    private Double[] center;
    private DistrictPlan currPlan;
}
