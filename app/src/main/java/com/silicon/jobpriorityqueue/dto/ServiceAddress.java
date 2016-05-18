package com.silicon.jobpriorityqueue.dto;

import com.google.gson.annotations.SerializedName;

public class ServiceAddress {

    @SerializedName("description")
    private String description;
    @SerializedName("postal_code")
    private String postalCode;
    @SerializedName("city")
    private String city;
    @SerializedName("longitude")
    private Double longitude;
    @SerializedName("state_province")
    private String stateProvince;
    @SerializedName("region")
    private String region;
    @SerializedName("line2")
    private String line2;
    @SerializedName("line3")
    private String line3;
    @SerializedName("latitude")
    private Double latitude;
    @SerializedName("line1")
    private String line1;


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }


    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getRegion() {
        return region;
    }


    public void setRegion(String region) {
        this.region = region;
    }


    public String getLine2() {
        return line2;
    }


    public void setLine2(String line2) {
        this.line2 = line2;
    }


    public String getLine3() {
        return line3;
    }


    public void setLine3(String line3) {
        this.line3 = line3;
    }


    public Double getLatitude() {
        return latitude;
    }

    public String getLine1() {
        return line1;
    }


    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }


    public void setLine1(String line1) {
        this.line1 = line1;
    }


}
