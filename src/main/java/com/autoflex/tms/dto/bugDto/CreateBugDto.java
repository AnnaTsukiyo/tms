package com.autoflex.tms.dto.bugDto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

public final class CreateBugDto {

    @NotNull(message = "Name cannot be null")
    private final String name;
    @NotNull(message = "Status cannot be null")
    private final String status;
    @NotNull(message = "Urgent cannot be null")
    private final String urgent;
    @NotNull(message = "Important cannot be null")
    private final String important;
    @Size(max = 200, message = "Description must be between 0 and 100 characters")
    private final String description;
    @NotNull(message = "Detected version cannot be null")
    private final String detectedVersion;
    @PastOrPresent //fixme (message = "Detected date must be in the past or present")
    private final String detectedDate;

    public CreateBugDto(final String name, final String status, final String urgent, final String important, final String description, final String detectedVersion, final String detectedDate) {
        this.name = name;
        this.urgent = urgent;
        this.important = important;
        this.description = description;
        this.detectedVersion = detectedVersion;
        this.detectedDate = detectedDate;
        this.status = status;
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

    public String getDetectedDate() {
        return detectedDate;
    }

    @Override
    public String toString() {
        return "CreateBugDto{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", urgent='" + urgent + '\'' +
                ", important='" + important + '\'' +
                ", description='" + description + '\'' +
                ", detectedVersion='" + detectedVersion + '\'' +
                ", detectedDate='" + detectedDate + '\'' +
                '}';
    }
}
