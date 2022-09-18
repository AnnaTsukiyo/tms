package com.autoflex.tms.controllers;

import com.autoflex.tms.dto.projectDto.CreateProjectDto;
import com.autoflex.tms.dto.projectDto.GetAllProjectDto;
import com.autoflex.tms.dto.projectDto.ProjectShortResponseDTO;
import com.autoflex.tms.services.ProjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    @Resource
    ProjectService projectService;

    @PostMapping("/create")
    public ProjectShortResponseDTO createProject(@Valid @RequestBody CreateProjectDto createProjectDto) {
        return new ProjectShortResponseDTO();
    }

    @GetMapping("/all")
    public List<GetAllProjectDto> getAll() {
        return projectService.findAll();
    }
}
