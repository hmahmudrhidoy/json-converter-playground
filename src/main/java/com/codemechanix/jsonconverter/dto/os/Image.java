package com.codemechanix.jsonconverter.dto.os;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Image {
    @JsonProperty("url")
    private String url;

    // Getter and setter
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}