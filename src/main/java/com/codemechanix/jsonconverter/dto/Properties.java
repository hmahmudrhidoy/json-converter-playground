package com.codemechanix.jsonconverter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {
    @JsonProperty("_class")
    private Field _class;

    @JsonProperty("id")
    private Field id;

    // Getters and setters

    public Field get_class() {
        return _class;
    }

    public void set_class(Field _class) {
        this._class = _class;
    }

    public Field getId() {
        return id;
    }

    public void setId(Field id) {
        this.id = id;
    }
}