package com.silicon.jobpriorityqueue.dto;

import com.google.gson.annotations.SerializedName;

public class Tasks {

    @SerializedName("asset_number")
    private String assetNumber;
    @SerializedName("description")
    private String description;
    @SerializedName("estimated_duration")
    private Double estimatedDuration;
    @SerializedName("location")
    private String location;
    @SerializedName("parent_wo_number")
    private String parentWoNumber;
    @SerializedName("status")
    private String status;
    @SerializedName("task_id")
    private Integer taskId;
    @SerializedName("work_order_id")
    private Integer workOrderId;

    public String getAssetNumber() {
        return assetNumber;
    }

    public void setAssetNumber(String assetNumber) {
        this.assetNumber = assetNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(Double estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getParentWoNumber() {
        return parentWoNumber;
    }

    public void setParentWoNumber(String parentWoNumber) {
        this.parentWoNumber = parentWoNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }
}
