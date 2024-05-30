package com.codemechanix.jsonconverter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Keyword {
    @JsonProperty("type")
    private String type;

    @JsonProperty("ignore_above")
    private int ignoreAbove;

    // Getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIgnoreAbove() {
        return ignoreAbove;
    }

    public void setIgnoreAbove(int ignoreAbove) {
        this.ignoreAbove = ignoreAbove;
    }
}