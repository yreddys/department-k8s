package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRequest {
    @JsonProperty("dId")
    private int DId;
    
    @JsonProperty("dName")
    private String DName;
    
    @JsonProperty("dAddress")
    private String DAddress;
}
