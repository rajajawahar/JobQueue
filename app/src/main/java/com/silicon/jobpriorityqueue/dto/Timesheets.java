package com.silicon.jobpriorityqueue.dto;

import com.google.gson.annotations.SerializedName;

public class Timesheets {

    @SerializedName("timesheet_id")
    private Integer timesheetId;
    @SerializedName("is_regular_hrs")
    private Double isRegularHrs;
    @SerializedName("is_for_task")
    private Boolean isForTask;
    @SerializedName("started_at")
    private String startedAt;
    @SerializedName("finished_at_time")
    private String finishedAtTime;
    @SerializedName("cost")
    private Double cost;
    @SerializedName("workorder_num")
    private String workorderNum;
    @SerializedName("finished_at")
    private String finishedAt;
    @SerializedName("started_at_time")
    private String startedAtTime;

    public Integer getTimesheetId() {
        return timesheetId;
    }

    public void setTimesheetId(Integer timesheetId) {
        this.timesheetId = timesheetId;
    }

    public Double getIsRegularHrs() {
        return isRegularHrs;
    }

    public void setIsRegularHrs(Double isRegularHrs) {
        this.isRegularHrs = isRegularHrs;
    }

    public Boolean getForTask() {
        return isForTask;
    }

    public void setForTask(Boolean forTask) {
        isForTask = forTask;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getFinishedAtTime() {
        return finishedAtTime;
    }

    public void setFinishedAtTime(String finishedAtTime) {
        this.finishedAtTime = finishedAtTime;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getWorkorderNum() {
        return workorderNum;
    }

    public void setWorkorderNum(String workorderNum) {
        this.workorderNum = workorderNum;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getStartedAtTime() {
        return startedAtTime;
    }

    public void setStartedAtTime(String startedAtTime) {
        this.startedAtTime = startedAtTime;
    }
}
