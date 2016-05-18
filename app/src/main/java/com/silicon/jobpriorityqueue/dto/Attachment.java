package com.silicon.jobpriorityqueue.dto;

import com.google.gson.annotations.SerializedName;


public class Attachment  {
    @SerializedName("url_type")
    private String urlType;
    @SerializedName("description")
    private String description;
    @SerializedName("document_number")
    private String documentNumber;
    @SerializedName("owner_id")
    private Integer ownerId;
    @SerializedName("owner_table")
    private String ownerTable;
    @SerializedName("document_id")
    private Integer documentId;
    @SerializedName("url_name")
    private String urlName;
    @SerializedName("document_type")
    private String documentType;
    @SerializedName("web_url")
    private String webUrl;
    @SerializedName("created_at")
    private String createdAt;


    public String getUrlType() {
        return urlType;
    }


    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getDocumentNumber() {
        return documentNumber;
    }


    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }


    public Integer getOwnerId() {
        return ownerId;
    }


    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }


    public String getOwnerTable() {
        return ownerTable;
    }


    public void setOwnerTable(String ownerTable) {
        this.ownerTable = ownerTable;
    }


    public Integer getDocumentId() {
        return documentId;
    }


    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }


    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }


    public String getDocumentType() {
        return documentType;
    }


    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getWebUrl() {
        return webUrl;
    }


    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }


    public String getCreatedAt() {
        return createdAt;
    }


    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }


}
