package com.autoflex.tms.mappers;

import com.autoflex.tms.dto.*;
import com.autoflex.tms.dto.bugDto.CreateBugDto;
import com.autoflex.tms.dto.bugDto.GetAllBugDto;
import com.autoflex.tms.dto.projectDto.CreateProjectDto;
import com.autoflex.tms.dto.projectDto.GetAllProjectDto;
import com.autoflex.tms.dto.taskDto.CreateTaskDto;
import com.autoflex.tms.dto.taskDto.GetAllTaskDto;
import com.autoflex.tms.dto.userDto.CreateUserDto;
import com.autoflex.tms.dto.userDto.GetAllUserDto;
import com.autoflex.tms.entities.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mapper {

    public static GetAllTaskDto convertToGetAllTaskDto(Task task) {
            return new GetAllTaskDto(task.getId().toString(), task.getTaskName(), task.getDescription(), task.getDeadline().toString(),
                    String.valueOf(task.isUrgent()), String.valueOf(task.isImportant()), task.getStatus().toString(), task.getCreated().toString(), task.getUpdated().toString());
        }

    public static CreateTaskDto convertToCreateTaskDto(Task task) {
            return new CreateTaskDto(task.getTaskName(), task.getDescription(), task.getDeadline().toString(),
                    String.valueOf(task.isUrgent()), String.valueOf(task.isImportant()), task.getStatus().toString(), task.getCreated().toString(), task.getUpdated().toString());
        }


    public static Task convertToTask(GetAllTaskDto taskDto) {
        DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
            return new Task(Long.valueOf(taskDto.getId()), taskDto.getTaskName(), taskDto.getDescription(), LocalDate.parse(taskDto.getDeadline(), localDateFormatter),
                    Boolean.parseBoolean(taskDto.isUrgent()), Boolean.parseBoolean(taskDto.isImportant()), Status.valueOf(taskDto.getStatus()), LocalDateTime.parse(taskDto.getCreated(), localDateTimeFormatter), LocalDateTime.parse(taskDto.getUpdated(), localDateTimeFormatter));

        }
        public static Task convertToTask(CreateTaskDto createTaskDto) {
            DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
            return new Task(createTaskDto.getTaskName(), createTaskDto.getDescription(), LocalDate.parse(createTaskDto.getDeadline(), localDateFormatter),
                    Boolean.parseBoolean(createTaskDto.getUrgent()), Boolean.parseBoolean(createTaskDto.getImportant()), Status.valueOf(createTaskDto.getStatus()), LocalDateTime.parse(createTaskDto.getCreated(), localDateTimeFormatter), LocalDateTime.parse(createTaskDto.getUpdated(), localDateTimeFormatter));
        }


    public static Bug convertBugDtoToBug(GetAllBugDto bugDto) {
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
            return new Bug(Long.valueOf(bugDto.getId()), bugDto.getName(), Status.valueOf(bugDto.getStatus()), Boolean.parseBoolean(bugDto.getUrgent()), Boolean.parseBoolean(bugDto.getImportant()), bugDto.getDescription(), bugDto.getDetectedVersion(), bugDto.getResolvedVersion(), LocalDateTime.parse(bugDto.getDetectedVersion(), localDateTimeFormatter),
                    LocalDateTime.parse(bugDto.getResolvedDate(), localDateTimeFormatter));
        }
        public static Bug convertBugDtoToBug(CreateBugDto bugDto) {
            return new Bug(bugDto.getName(),
                    Boolean.parseBoolean(bugDto.getUrgent()),
                    Boolean.parseBoolean(bugDto.getImportant()),
                    bugDto.getDescription(),
                    bugDto.getDetectedVersion());
        }


    public static GetAllBugDto convertToGetBugDto(Bug bug) {
        return new GetAllBugDto(String.valueOf(bug.getId()), bug.getName(), bug.getStatus().toString(), String.valueOf(bug.isUrgent()),
                String.valueOf(bug.isImportant()), bug.getDescription(), bug.getDetectedVersion(), bug.getResolvedVersion(), bug.getDetectedDate().toString(),
                bug.getResolvedDate().toString());
    }

    public static CreateBugDto convertToCreateBugDto(Bug bug) {
        return new CreateBugDto(bug.getName(),
                bug.getStatus().toString(), String.valueOf(bug.isUrgent()), String.valueOf(bug.isImportant()),
                bug.getDescription(), bug.getDetectedVersion(), bug.getDetectedDate().toString());
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

    public static Project convertToProject(GetAllProjectDto projectDto) {
        DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
            return new Project(Long.valueOf(projectDto.getId()), projectDto.getProjectName(), Boolean.parseBoolean(projectDto.getIsActive()),
                    projectDto.getDescription(), LocalDateTime.parse(projectDto.getCreated(), localDateTimeFormatter),
                    LocalDateTime.parse(projectDto.getUpdated(), localDateTimeFormatter),
                    LocalDate.parse(projectDto.getReleaseDate(), localDateFormatter));
        }

        public static Project convertToProject(CreateProjectDto projectDto) {
            DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            return new Project(projectDto.getProjectName(), Boolean.parseBoolean(projectDto.getIsActive()), projectDto.getDescription(),
                    LocalDate.parse(projectDto.getReleaseDate(), localDateFormatter));
    }

    public static GetAllProjectDto convertToGetAllProjectDto(Project project) {
            return new GetAllProjectDto(String.valueOf(project.getId()), project.getProjectName(), String.valueOf(project.getActive()),
                    project.getDescription(), project.getCreated().toString(), project.getUpdated().toString(),
                    project.getReleaseDate().toString());
        }

        public static CreateProjectDto convertToCreateProjectDto(Project project) {
            return new CreateProjectDto(project.getProjectName(), String.valueOf(project.getActive()), project.getDescription(),
                    project.getReleaseDate().toString());
    }

    public static GetAllUserDto convertToGetAllUserDto(User user) {
        return new GetAllUserDto(
                user.getId().toString(),
                user.getFullName(),
                user.getEmail(),
                user.getPassword(),
                user.getRole().toString(),
                String.valueOf(user.getIsActive()),
                user.getCreated().toString(),
                user.getUpdated().toString());
    }


    public static CreateUserDto convertToCreateUserDto(User user) {
        return new CreateUserDto(user.getFullName(), user.getEmail(), user.getPassword(), user.getRole().toString(),
                String.valueOf(user.getIsActive()), user.getCreated().toString(), user.getUpdated().toString());
    }

    public static User convertToUser(GetAllUserDto userDto) {
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
            return new User(Long.valueOf(userDto.getId()),
                    userDto.getFullName(),
                    userDto.getEmail(),
                    userDto.getPassword(),
                    Role.valueOf(userDto.getRole()),
                    Boolean.parseBoolean(userDto.getIsActive()),
                    LocalDateTime.parse(userDto.getCreated(), localDateTimeFormatter),
                    LocalDateTime.parse(userDto.getUpdated(), localDateTimeFormatter));
    }

    public static User convertToUser(CreateUserDto createUserDto) {
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        return new User(createUserDto.getFullName(),
                createUserDto.getEmail(),
                createUserDto.getPassword(),
                Role.valueOf(createUserDto.getRole()),
                Boolean.parseBoolean(createUserDto.getIsActive()),
                LocalDateTime.parse(createUserDto.getCreated(), localDateTimeFormatter),
                LocalDateTime.parse(createUserDto.getUpdated(), localDateTimeFormatter));
    }
}