package com.autoflex.tms.dto;

public class ProjectDto {
    private String id;
    private String projectName;
    private String isActive;
    private String description;
    private String created;
    private String updated;
    private String releaseDate;

    public ProjectDto(String id, String projectName, String isActive, String description, String created, String updated, String releaseDate) {
        this.id = id;
        this.projectName = projectName;
        this.isActive = isActive;
        this.description = description;
        this.created = created;
        this.updated = updated;
        this.releaseDate = releaseDate;
    }

    public ProjectDto(String projectName, String isActive, String description, String releaseDate) {
        this.projectName = projectName;
        this.isActive = isActive;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "ProjectDto{" +
                "id='" + id + '\'' +
                ", projectName='" + projectName + '\'' +
                ", isActive='" + isActive + '\'' +
                ", description='" + description + '\'' +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}