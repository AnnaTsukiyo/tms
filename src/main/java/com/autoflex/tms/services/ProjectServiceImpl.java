package com.autoflex.tms.services;

import com.autoflex.tms.repos.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import com.autoflex.tms.dto.ProjectDto;
import com.autoflex.tms.mappers.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Resource
    private Mapper mapper;

    @Override
    public void createProject(ProjectDto projectDto) {
        projectRepository.save(Mapper.convertToProject(projectDto));
    }

    @Override
    public ProjectDto getProjectByName(String name) {
        return Mapper.convertToProjectDto(projectRepository.findByProjectName(name));
    }

    @Override
    public void removeByName(String name) {
        projectRepository.deleteByProjectName(name);
    }

    @Override
    public void update(ProjectDto projectDto, String name) {
        projectRepository.deleteByProjectName(name);
        projectRepository.save(Mapper.convertToProject(projectDto));
    }

    @Override
    public List<ProjectDto> findAll() {
        return projectRepository.findAll().stream()
                .map(Mapper::convertToProjectDto)
                .collect(Collectors.toList());
    }
}
