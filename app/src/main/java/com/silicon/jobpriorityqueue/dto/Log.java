package com.silicon.jobpriorityqueue.dto;

import com.google.gson.annotations.SerializedName;

public class Log {


    @SerializedName("log_type")
    private String logType;
    @SerializedName("description")
    private String description;
    @SerializedName("person_name")
    private String personName;
    @SerializedName("long_description")
    private String longDescription;
    @SerializedName("person_id")
    private String personId;
    @SerializedName("record_key")
    private String recordKey;
    @SerializedName("for_entity")
    private String forEntity;
    @SerializedName("work_log_id")
    private Integer workLogId;
    @SerializedName("created_by")
    private String createdBy;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("client_viewable")
    private Boolean clientViewable;

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getRecordKey() {
        return recordKey;
    }

    public void setRecordKey(String recordKey) {
        this.recordKey = recordKey;
    }

    public String getForEntity() {
        return forEntity;
    }

    public void setForEntity(String forEntity) {
        this.forEntity = forEntity;
    }

    public Integer getWorkLogId() {
        return workLogId;
    }

    public void setWorkLogId(Integer workLogId) {
        this.workLogId = workLogId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getClientViewable() {
        return clientViewable;
    }

    public void setClientViewable(Boolean clientViewable) {
        this.clientViewable = clientViewable;
    }
}
