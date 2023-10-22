package com.cse416.titans.models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;

@Getter
@Document(collection="DistrictPlans")
public class DistrictPlan {
    @Id
    private String id;
    private ArrayList<Object> content;
}
