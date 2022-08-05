package com.autoflex.tms.services;

import com.autoflex.tms.dto.taskDto.CreateTaskDto;
import com.autoflex.tms.dto.taskDto.GetAllTaskDto;

import java.util.List;

public interface TaskService {
    void createTask(CreateTaskDto taskDto);
    List<GetAllTaskDto> findByEmail(String email);
    void remove(String id);
    void update(CreateTaskDto taskDto, String id);
    List<GetAllTaskDto> findAll();
}
