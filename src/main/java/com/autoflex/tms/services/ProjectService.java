package com.autoflex.tms.services;

import com.autoflex.tms.dto.ProjectDto;

import java.util.List;

public interface ProjectService {
    void createProject(ProjectDto projectDto);
    ProjectDto getProjectByName(String name);
    void removeByName(String name);
    void update(ProjectDto projectDto, String name);
    List<ProjectDto> findAll();
}
