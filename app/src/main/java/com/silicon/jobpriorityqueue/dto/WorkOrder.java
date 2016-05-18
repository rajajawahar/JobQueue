package com.silicon.jobpriorityqueue.dto;


import com.google.gson.annotations.SerializedName;
import com.silicon.jobpriorityqueue.dto.Asset;
import com.silicon.jobpriorityqueue.dto.Attachment;
import com.silicon.jobpriorityqueue.dto.Location;
import com.silicon.jobpriorityqueue.dto.Log;
import com.silicon.jobpriorityqueue.dto.MaterialUsed;
import com.silicon.jobpriorityqueue.dto.ServiceAddress;
import com.silicon.jobpriorityqueue.dto.Tasks;
import com.silicon.jobpriorityqueue.dto.Timesheets;

import java.util.ArrayList;
import java.util.List;


public class WorkOrder {

    @SerializedName("description")
    private String description;
    @SerializedName("scheduled_finish_date")
    private String scheduledFinishDate;

    @SerializedName("assigned_date")
    private String assignedDate;
    @SerializedName("changed_by")
    private String changedBy;
    @SerializedName("phone")
    private String phone;
    @SerializedName("scheduled_start_date")
    private String scheduledStartDate;
    @SerializedName("attachments")
    private List<Attachment> attachments = new ArrayList<Attachment>();
    @SerializedName("reported_date")
    private String reportedDate;
    @SerializedName("locations")
    private List<Location> locations = new ArrayList<Location>();
    @SerializedName("status")
    private String status;
    @SerializedName("workorder_id")
    private Integer workorderId;
    @SerializedName("site_id")
    private String siteId;
    @SerializedName("reported_by")
    private String reportedBy;
    @SerializedName("changed_date")
    private String changedDate;
    @SerializedName("estimated_duration")
    private Double estimatedDuration;
    @SerializedName("priority")
    private Integer priority;
    @SerializedName("location")
    private String location;
    @SerializedName("work_type")
    private String workType;
    @SerializedName("workorder_num")
    private String workorderNum;

    @SerializedName("targeted_start_date")
    private String targetedStartDate;

    @SerializedName("targeted_completed_date")
    private String targetedCompletedDate;


    @SerializedName("asset")
    private Asset asset;

    @SerializedName("customer")
    private String customer;

    @SerializedName("tasks")
    private List<Tasks> tasks = new ArrayList<>();

    @SerializedName("materials")
    private List<MaterialUsed> materials = new ArrayList<>();

    @SerializedName("timesheets")
    private List<Timesheets> timesheets = new ArrayList<>();

    @SerializedName("logs")
    private List<Log> logs = new ArrayList<>();


    public ServiceAddress getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(ServiceAddress serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    @SerializedName("service_address")

    private ServiceAddress serviceAddress;


    public List<Log> getLogs() {
        return logs;
    }

    public void setLogs(List<Log> logs) {
        this.logs = logs;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }

    public List<MaterialUsed> getMaterials() {
        return materials;
    }

    public void setMaterials(List<MaterialUsed> materials) {
        this.materials = materials;
    }

    public List<Timesheets> getTimesheets() {
        return timesheets;
    }

    public void setTimesheets(List<Timesheets> timesheets) {
        this.timesheets = timesheets;
    }

    public String getTargetedCompletedDate() {
        return targetedCompletedDate;
    }

    public void setTargetedCompletedDate(String targetedCompletedDate) {
        this.targetedCompletedDate = targetedCompletedDate;
    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPriority() {

        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }


    public String getScheduledFinishDate() {
        return scheduledFinishDate;
    }


    public void setScheduledFinishDate(String scheduledFinishDate) {
        this.scheduledFinishDate = scheduledFinishDate;
    }

    public String getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(String assignedDate) {
        this.assignedDate = assignedDate;
    }

    public String getTargetedStartDate() {
        return targetedStartDate;
    }


    public void setTargetedStartDate(String targetedStartDate) {
        this.targetedStartDate = targetedStartDate;
    }


    public String getChangedBy() {
        return changedBy;
    }


    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getScheduledStartDate() {
        return scheduledStartDate;
    }


    public void setScheduledStartDate(String scheduledStartDate) {
        this.scheduledStartDate = scheduledStartDate;
    }


    public List<Attachment> getAttachments() {
        return attachments;
    }


    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }


    public String getReportedDate() {
        return reportedDate;
    }


    public void setReportedDate(String reportedDate) {
        this.reportedDate = reportedDate;
    }


    public List<Location> getLocations() {
        return locations;
    }


    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public Integer getWorkorderId() {
        return workorderId;
    }


    public void setWorkorderId(
            Integer workorderId) {
        this.workorderId = workorderId;

    }


    public String getSiteId() {
        return siteId;
    }


    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }


    public String getReportedBy() {
        return reportedBy;
    }


    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }


    public String getChangedDate() {
        return changedDate;
    }


    public void setChangedDate(String changedDate) {

        this.changedDate = changedDate;

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


    public String getWorkType() {
        return workType;
    }


    public void setWorkType(String workType) {
        this.workType = workType;
    }


    public String getWorkorderNum() {
        return workorderNum;
    }


    public void setWorkorderNum(String workorderNum) {
        this.workorderNum = workorderNum;
    }


    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
