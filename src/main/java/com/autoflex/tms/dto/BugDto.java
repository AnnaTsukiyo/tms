package com.autoflex.tms.dto;

public class BugDto {
    private String id;
    private String name;
    private String status;
    private String urgent;
    private String important;
    private String description;
    private String detectedVersion;
    private String resolvedVersion;
    private String detectedDate;
    private String resolvedDate;

    public BugDto(String id, String name, String status, String urgent, String important, String description, String detectedVersion, String resolvedVersion, String detectedDate, String resolvedDate) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.urgent = urgent;
        this.important = important;
        this.description = description;
        this.detectedVersion = detectedVersion;
        this.resolvedVersion = resolvedVersion;
        this.detectedDate = detectedDate;
        this.resolvedDate = resolvedDate;
    }

    public BugDto(String name, String status, String urgent, String important, String description, String detectedVersion, String detectedDate) {
        this.name = name;
        this.urgent = urgent;
        this.important = important;
        this.description = description;
        this.detectedVersion = detectedVersion;
        this.detectedDate = detectedDate;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getUrgent() {
        return urgent;
    }

    public String getImportant() {
        return important;
    }

    public String getDescription() {
        return description;
    }

    public String getDetectedVersion() {
        return detectedVersion;
    }

    public String getResolvedVersion() {
        return resolvedVersion;
    }

    public String getDetectedDate() {
        return detectedDate;
    }

    public String getResolvedDate() {
        return resolvedDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    public void setImportant(String important) {
        this.important = important;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDetectedVersion(String detectedVersion) {
        this.detectedVersion = detectedVersion;
    }

    public void setResolvedVersion(String resolvedVersion) {
        this.resolvedVersion = resolvedVersion;
    }

    public void setDetectedDate(String detectedDate) {
        this.detectedDate = detectedDate;
    }

    public void setResolvedDate(String resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    @Override
    public String toString() {
        return "BugDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", urgent='" + urgent + '\'' +
                ", important='" + important + '\'' +
                ", description='" + description + '\'' +
                ", detectedVersion='" + detectedVersion + '\'' +
                ", resolvedVersion='" + resolvedVersion + '\'' +
                ", detectedDate='" + detectedDate + '\'' +
                ", resolvedDate='" + resolvedDate + '\'' +
                '}';
    }
}
