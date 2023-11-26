package com.cse416.titans.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "ClusterSets")
public class ClusterSet {
    @Id
    private String id;
    private String name;
    private String ensembleId;
    private String distanceMeasureId;
    private Double clusterSeparationIndex;
    private Double clusterQualityIndex;
    private Double computeTime;

    @DocumentReference
    @JsonIgnore
    private List<Cluster> clusters;

    @JsonIgnore
    public String getClustersAnalysis() {
        // TODO
        return null;
    }

    @JsonIgnore
    public String getAnalysis() {
        // TODO
        return null;
    }
}
