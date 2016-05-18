package com.silicon.jobpriorityqueue.dto;

import com.google.gson.annotations.SerializedName;

public class Inventory {

    @SerializedName("available_balance")
    private Integer availableBalance;
    @SerializedName("current_balance")
    private Integer currentBalance;
    @SerializedName("issue_unit")
    private String issueUnit;
    @SerializedName("item_number")
    private String itemNumber;
    @SerializedName("item_set_id")
    private String itemSetId;
    @SerializedName("location")
    private String location;

    public Integer getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Integer availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Integer getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Integer currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getIssueUnit() {
        return issueUnit;
    }

    public void setIssueUnit(String issueUnit) {
        this.issueUnit = issueUnit;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemSetId() {
        return itemSetId;
    }

    public void setItemSetId(String itemSetId) {
        this.itemSetId = itemSetId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}


