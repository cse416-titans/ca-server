package com.cse416.titans.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Document(collection = "Clusters")
public class Cluster {
    @Id
    private String id;
    private String name;
    private String clusterSetId;
    
    // private List<DistrictPlan> districtPlans;
}
