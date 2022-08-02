package com.autoflex.tms.mappers;

import com.autoflex.tms.dto.*;
import com.autoflex.tms.entities.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mapper {

    public static TaskDto convertToTaskDto(Task task) {
        if (task.getId() != null && !task.getId().equals("")) {
            return new TaskDto(task.getId().toString(), task.getTaskName(), task.getDescription(), task.getDeadline().toString(),
                    String.valueOf(task.isUrgent()), String.valueOf(task.isImportant()), task.getStatus().toString(), task.getCreated().toString(), task.getUpdated().toString());
        } else {
            return new TaskDto(task.getTaskName(), task.getDescription(), task.getDeadline().toString(),
                    String.valueOf(task.isUrgent()), String.valueOf(task.isImportant()), task.getStatus().toString(), task.getCreated().toString(), task.getUpdated().toString());
        }
    }

    public static Task convertToTask(TaskDto taskDto) {
        DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        if (taskDto.getId() != null && !taskDto.getId().equals("")) {
            return new Task(Long.valueOf(taskDto.getId()), taskDto.getTaskName(), taskDto.getDescription(), LocalDate.parse(taskDto.getDeadline(), localDateFormatter),
                    Boolean.parseBoolean(taskDto.isUrgent()), Boolean.parseBoolean(taskDto.isImportant()), Status.valueOf(taskDto.getStatus()), LocalDateTime.parse(taskDto.getCreated(), localDateTimeFormatter), LocalDateTime.parse(taskDto.getUpdated(), localDateTimeFormatter));

        } else {
            return new Task(taskDto.getTaskName(), taskDto.getDescription(), LocalDate.parse(taskDto.getDeadline(), localDateFormatter),
                    Boolean.parseBoolean(taskDto.isUrgent()), Boolean.parseBoolean(taskDto.isImportant()), Status.valueOf(taskDto.getStatus()), LocalDateTime.parse(taskDto.getCreated(), localDateTimeFormatter), LocalDateTime.parse(taskDto.getUpdated(), localDateTimeFormatter));
        }
    }

    public static Bug convertToBug(BugDto bugDto) {
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        if (bugDto.getId() != null && !bugDto.getId().equals("")) {
            return new Bug(Long.valueOf(bugDto.getId()), bugDto.getName(), Status.valueOf(bugDto.getStatus()), Boolean.parseBoolean(bugDto.getUrgent()), Boolean.parseBoolean(bugDto.getImportant()), bugDto.getDescription(), bugDto.getDetectedVersion(), bugDto.getResolvedVersion(), LocalDateTime.parse(bugDto.getDetectedVersion(), localDateTimeFormatter),
                    LocalDateTime.parse(bugDto.getResolvedDate(), localDateTimeFormatter));
        } else {
            return new Bug(bugDto.getName(),
                    Boolean.parseBoolean(bugDto.getUrgent()),
                    Boolean.parseBoolean(bugDto.getImportant()),
                    bugDto.getDescription(),
                    bugDto.getDetectedVersion());
        }
    }

    public static BugDto convertToBugDto(Bug bug) {
        if (bug.getId() != null && bug.getId() > 0) {
            return new BugDto(String.valueOf(bug.getId()), bug.getName(), bug.getStatus().toString(), String.valueOf(bug.isUrgent()),
                    String.valueOf(bug.isImportant()), bug.getDescription(), bug.getDetectedVersion(), bug.getResolvedVersion(), bug.getDetectedDate().toString(),
                    bug.getResolvedDate().toString());
        } else {
            return new BugDto(bug.getName(),
                    bug.getStatus().toString(), String.valueOf(bug.isUrgent()), String.valueOf(bug.isImportant()),
                    bug.getDescription(), bug.getDetectedVersion(), bug.getDetectedDate().toString());
        }
    }

    public static Manager convertToManager(ManagerDto managerDto) {
        return new Manager(Long.valueOf(managerDto.getId()));
    }

    public static ManagerDto convertToManagerDto(Manager manager) {
        return new ManagerDto(manager.getId().toString());
    }

    public static Employee convertToEmployee(EmployeeDto employeeDto) {
        return new Employee(Long.valueOf(employeeDto.getId()));
    }

    public static EmployeeDto convertToEmployeeDto(Employee employee) {
        return new EmployeeDto(employee.getId().toString());
    }

    public static AttachmentDto convertToAttachmentDto(Attachment attachment) {
        return new AttachmentDto(String.valueOf(attachment.getId()), attachment.getName(), attachment.getCreated().toString(), attachment.getUpdated().toString());
    }

    public static Attachment convertToAttachment(AttachmentDto attachmentDto) {

        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        return new Attachment(Long.valueOf(attachmentDto.getId()), attachmentDto.getName(),
                LocalDateTime.parse(attachmentDto.getCreated(), localDateTimeFormatter),
                LocalDateTime.parse(attachmentDto.getUpdated(), localDateTimeFormatter));
    }

    public static Project convertToProject(ProjectDto projectDto) {
        DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        if (projectDto.getId() != null && !projectDto.getId().equals("")) {
            return new Project(Long.valueOf(projectDto.getId()), projectDto.getProjectName(), Boolean.parseBoolean(projectDto.getIsActive()),
                    projectDto.getDescription(), LocalDateTime.parse(projectDto.getCreated(), localDateTimeFormatter),
                    LocalDateTime.parse(projectDto.getUpdated(), localDateTimeFormatter),
                    LocalDate.parse(projectDto.getReleaseDate(), localDateFormatter));
        } else {
            return new Project(projectDto.getProjectName(), Boolean.parseBoolean(projectDto.getIsActive()), projectDto.getDescription(),
                    LocalDate.parse(projectDto.getReleaseDate(), localDateFormatter));
        }
    }

    public static ProjectDto convertToProjectDto(Project project) {
        if (project.getId() != null && project.getId() > 0) {
            return new ProjectDto(String.valueOf(project.getId()), project.getProjectName(), String.valueOf(project.getActive()),
                    project.getDescription(), project.getCreated().toString(), project.getUpdated().toString(),
                    project.getReleaseDate().toString());
        } else {
            return new ProjectDto(project.getProjectName(), String.valueOf(project.getActive()), project.getDescription(),
                    project.getReleaseDate().toString());
        }
    }

    public static UserDto convertToUserDto(User user) {

        if (user.getId() != null && user.getId() > 0) {
            return new UserDto(
                    user.getId().toString(),
                    user.getFullName(),
                    user.getEmail(),
                    user.getPassword(),
                    user.getRole().toString(),
                    String.valueOf(user.getIsActive()),
                    user.getCreated().toString(),
                    user.getUpdated().toString());
        } else {
            return new UserDto(user.getFullName(), user.getEmail(), user.getPassword(), user.getRole().toString(),
                    String.valueOf(user.getIsActive()), user.getCreated().toString(), user.getUpdated().toString());
        }
    }

    public static User convertToUser(UserDto userDto) {
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        if (userDto.getId() != null && !userDto.getId().equals("")) {
            return new User(Long.valueOf(userDto.getId()),
                    userDto.getFullName(),
                    userDto.getEmail(),
                    userDto.getPassword(),
                    Role.valueOf(userDto.getRole()),
                    Boolean.parseBoolean(userDto.getIsActive()),
                    LocalDateTime.parse(userDto.getCreated(), localDateTimeFormatter),
                    LocalDateTime.parse(userDto.getUpdated(), localDateTimeFormatter));
        } else {
            return new User(userDto.getFullName(),
                    userDto.getEmail(),
                    userDto.getPassword(),
                    Role.valueOf(userDto.getRole()),
                    Boolean.parseBoolean(userDto.getIsActive()),
                    LocalDateTime.parse(userDto.getCreated(), localDateTimeFormatter),
                    LocalDateTime.parse(userDto.getUpdated(), localDateTimeFormatter));
        }
    }
}
