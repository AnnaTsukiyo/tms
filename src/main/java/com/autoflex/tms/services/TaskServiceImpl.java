package com.autoflex.tms.services;

import com.autoflex.tms.dto.taskDto.CreateTaskDto;
import com.autoflex.tms.dto.taskDto.GetAllTaskDto;
import com.autoflex.tms.mappers.Mapper;
import com.autoflex.tms.repos.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void createTask(CreateTaskDto taskDto) {
        taskRepository.save(Mapper.convertToTask(taskDto));
    }

    @Override
    public List<GetAllTaskDto> findByEmail(String email) {
        return taskRepository.findByEmployeeEmail(email).stream()
                .map(Mapper::convertToGetAllTaskDto)
                .collect(Collectors.toList());
    }

    @Override
    public void remove(String id) {
        taskRepository.deleteById(Long.valueOf(id));
    }

    @Override
    public void update(CreateTaskDto taskDto, String id) {
        taskRepository.deleteById(Long.valueOf(id));
        taskRepository.save(Mapper.convertToTask(taskDto));
    }

    @Override
    public List<GetAllTaskDto> findAll() {
        return taskRepository.findAll().stream()
                .map(Mapper::convertToGetAllTaskDto)
                .collect(Collectors.toList());
    }
}
