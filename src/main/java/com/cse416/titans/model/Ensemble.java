package com.cse416.titans.model;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "Ensembles")
public class Ensemble {
    @Id
    private String id;
    private String name;
    private String stateId;
    private int numOfPlans;
    @DBRef(lazy = true)
    @JsonIgnore
    private List<ClusterSet> clusterSets;

    @JsonIgnore
    public JSONObject getAnalysis() {
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("name", name);
        json.put("numOfPlans", numOfPlans);
        json.put("numOfClusterSets", clusterSets.size());
        // get clusterSet ids
        ArrayList<String> clusterSetIds = new ArrayList<String>();
        for (ClusterSet set : getClusterSets()) {
            clusterSetIds.add(set.getName());
        }
        json.put("clusterSetIds", clusterSetIds);

        for (ClusterSet clusterSet : clusterSets) {
            json.put(clusterSet.getName(), clusterSet.getAnalysis());
        }
        /*
        json.put("avgPlanDistance", clusterSets.get(0).getAvgPlanDistance());

        // get average voting split of all clusters in first cluster set
        ArrayList<Integer> avgDemSplit = new ArrayList<Integer>();
        ArrayList<Integer> avgRepSplit = new ArrayList<Integer>();
        for (Cluster cluster : clusterSets.get(0).getClusters()) {
            avgDemSplit.add(cluster.getAvgDemocraticSplit());
            avgRepSplit.add(cluster.getAvgRepublicanSplit());
        }
        json.put("avgDemSplit", avgDemSplit);
        json.put("avgRepSplit", avgRepSplit);

        // get average opportunity districts of all clusters in first cluster set
        ArrayList<Integer> avgWhiteOpp = new ArrayList<Integer>();
        ArrayList<Integer> avgAAOpp = new ArrayList<Integer>();
        ArrayList<Integer> avgAsianOpp = new ArrayList<Integer>();
        ArrayList<Integer> avgHispanicOpp = new ArrayList<Integer>();
        for (Cluster cluster : clusterSets.get(0).getClusters()) {
            avgWhiteOpp.add(cluster.getAvgNumOfWhiteOpps());
            avgAAOpp.add(cluster.getAvgNumOfAAOpps());
            avgAsianOpp.add(cluster.getAvgNumOfAsianOpps());
            avgHispanicOpp.add(cluster.getAvgNumOfHispanicOpps());
        }
        json.put("avgWhiteOpp", avgWhiteOpp);
        json.put("avgAAOpp", avgAAOpp);
        json.put("avgAsianOpp", avgAsianOpp);
        json.put("avgHispanicOpp", avgHispanicOpp);

        // get number of clusters for each cluster set
        ArrayList<Integer> numOfClusters = new ArrayList<Integer>();
        for (ClusterSet set : getClusterSets()) {
            numOfClusters.add(set.getNumOfClusters());
        }
        json.put("numOfClusters", numOfClusters);
        */
        return json;
    }
    

    @JsonIgnore
    public JSONObject getNumOfClusters() {
        // TODO
        JSONObject json = new JSONObject();
        json.put("size", numOfPlans);
        int n = 0;
        for(ClusterSet set: getClusterSets()) {
            if(n == 0) {
                json.put("Hamming", set.getNumOfClusters());
            }
            else if(n == 1) {
                json.put("Entropy", set.getNumOfClusters());
            }
            else {
                json.put("OptimalTransport", set.getNumOfClusters());
            }
            n += 1;
        }
        return json;
    }
}
