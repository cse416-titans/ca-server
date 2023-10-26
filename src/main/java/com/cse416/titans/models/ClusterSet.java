package com.cse416.titans.models;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;

@Getter
@Document(collection = "ClusterSets")
public class ClusterSet {
    @Id
    private String id;
    private String name;
    private String ensembleId;
    private String distanceMeasureId;
    private Set<Cluster> clusters;
}
