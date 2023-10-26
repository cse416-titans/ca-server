package com.cse416.titans.models;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;

@Getter
@Document(collection = "Clusters")
public class Cluster {
    @Id
    private String id;
    private String name;
    private String clusterSetId;
    private Set<DistrictPlan> districtPlans;
}
