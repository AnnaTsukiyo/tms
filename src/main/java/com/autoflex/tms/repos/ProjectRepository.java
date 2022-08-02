package com.autoflex.tms.repos;

import com.autoflex.tms.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    Project findByProjectName(String projectName);

    void deleteByProjectName(String projectName);
}

