package com.silicon.jobpriorityqueue.dto;

import com.google.gson.annotations.SerializedName;


public class Location {

    @SerializedName("description")
    private String description;
    @SerializedName("location")
    private String location;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
