package com.codemechanix.jsonconverter.dto.os;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Metadata {
    @JsonProperty("probability")
    private double probability;

    @JsonProperty("dateDownloaded")
    private String dateDownloaded;

    // Getters and setters
    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public String getDateDownloaded() {
        return dateDownloaded;
    }

    public void setDateDownloaded(String dateDownloaded) {
        this.dateDownloaded = dateDownloaded;
    }
}
