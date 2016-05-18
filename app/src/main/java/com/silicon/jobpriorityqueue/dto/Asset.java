package com.silicon.jobpriorityqueue.dto;

import com.google.gson.annotations.SerializedName;


public class Asset {


    @SerializedName("asset_number")
    private String assetNumber;
    @SerializedName("description")
    private String description;

    @SerializedName("asset_number")
    public String getAssetNumber() {
        return assetNumber;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


}
