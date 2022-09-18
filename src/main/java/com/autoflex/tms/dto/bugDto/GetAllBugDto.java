package com.autoflex.tms.dto.bugDto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public final class GetAllBugDto { //response

    @NotNull
    @Positive(message = "id must be positive")
    private final String id;
    @NotNull(message = "Name cannot be null")
    private final String name;
    @NotNull(message = "Status cannot be null")
    private final String status;
    @NotNull(message = "Urgent cannot be null")
    private final String urgent;
    @NotNull(message = "Important cannot be null")
    private final String important;
    @Size(max = 100, message = "Description must be between 0 and 100 characters")
    private final String description;
    @NotNull(message = "Detected version cannot be null")
    private final String detectedVersion;
    @NotNull(message = "Resolved version cannot be null")
    private final String resolvedVersion;
    @PastOrPresent  //fixme: ??? (message = "Detected date must be in the past or present")
    private final String detectedDate;
    private final String resolvedDate;

    public GetAllBugDto(final String id, final String name, final String status, final String urgent, final String important, final String description, final String detectedVersion, final String resolvedVersion, final String detectedDate, final String resolvedDate) {
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
