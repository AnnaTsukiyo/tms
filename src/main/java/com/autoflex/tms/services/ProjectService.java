package com.autoflex.tms.services;

import com.autoflex.tms.dto.projectDto.CreateProjectDto;
import com.autoflex.tms.dto.projectDto.GetAllProjectDto;

import java.util.List;

public interface ProjectService {
    void createProject(CreateProjectDto projectDto);
    GetAllProjectDto getProjectByName(String name);
    void removeByName(String name);
    void update(CreateProjectDto projectDto, String name);
    List<GetAllProjectDto> findAll();
}
