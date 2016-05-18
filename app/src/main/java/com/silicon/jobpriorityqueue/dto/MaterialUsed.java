package com.silicon.jobpriorityqueue.dto;

import com.google.gson.annotations.SerializedName;

public class MaterialUsed {

    @SerializedName("description")
    private String description;
    @SerializedName("item_number")
    private String itemNumber;

    public double getUnit_cost() {
        return unit_cost;
    }

    public void setUnit_cost(double unit_cost) {
        this.unit_cost = unit_cost;
    }

    @SerializedName("unit_cost")
    private double unit_cost;
    @SerializedName("item_quantity")
    private Integer itemQuantity;
    @SerializedName("location")
    private String location;
    @SerializedName("store_site_location")
    private String storeSiteLocation;
    @SerializedName("item_id")
    private Integer itemId;
    @SerializedName("inventory")
    private Inventory inventory;


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getItemNumber() {
        return itemNumber;
    }


    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }


    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getStoreSiteLocation() {
        return storeSiteLocation;
    }


    public void setStoreSiteLocation(String storeSiteLocation) {
        this.storeSiteLocation = storeSiteLocation;
    }

    public Integer getItemId() {
        return itemId;
    }


    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Inventory getInventory() {
        return inventory;
    }


    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}
