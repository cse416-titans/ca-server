package com.cse416.titans.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Districts")
public class District {
    @Id
    private String id;
    private String name;
    
}
