package com.autoflex.tms.dto.taskDto;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

public class CreateTaskDto {

    @NotNull(message = "Task name cannot be null")
    private final String taskName;
    @Size(min = 10, max = 300, message = "Description must be between 0 and 100 characters")
    private final String description;
    @FutureOrPresent
    private final String deadline;
    @NotNull(message = "Urgent cannot be null")
    private final String urgent;
    @NotNull(message = "Important cannot be null")
    private final String important;
    @NotNull(message = "Status cannot be null")
    private final String status;
    @PastOrPresent
    private final String created;
    @PastOrPresent
    private final String updated;

    public CreateTaskDto(final String taskName,final String description,final String deadline,final String urgent,final String important,final String status,final String created,final String updated) {
        this.taskName = taskName;
        this.description = description;
        this.deadline = deadline;
        this.urgent = urgent;
        this.important = important;
        this.status = status;
        this.created = created;
        this.updated = updated;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getUrgent() {
        return urgent;
    }

    public String getImportant() {
        return important;
    }

    public String getStatus() {
        return status;
    }

    public String getCreated() {
        return created;
    }

    public String getUpdated() {
        return updated;
    }

    @Override
    public String toString() {
        return "CreateTaskDto{" +
                "taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", deadline='" + deadline + '\'' +
                ", urgent='" + urgent + '\'' +
                ", important='" + important + '\'' +
                ", status='" + status + '\'' +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                '}';
    }
}
