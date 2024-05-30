package com.codemechanix.jsonconverter.dto.os;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class S3 {
    @JsonProperty("bucket")
    private String bucket;

    @JsonProperty("key")
    private String key;

    // Getters and setters
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}