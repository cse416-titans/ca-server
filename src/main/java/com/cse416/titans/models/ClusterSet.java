package com.cse416.titans.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "ClusterSets")
public class ClusterSet {
    @Id
    private String id;
    private String name;
    private String ensembleId;
    private String distanceMeasureId;
    @DocumentReference
    private List<Cluster> clusters;
}
