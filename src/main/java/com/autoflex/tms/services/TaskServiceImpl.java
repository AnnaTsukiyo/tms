package com.autoflex.tms.services;

import com.autoflex.tms.dto.TaskDto;
import com.autoflex.tms.mappers.Mapper;
import com.autoflex.tms.repos.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Resource
    private Mapper mapper;

    @Override
    public void createTask(TaskDto taskDto) {
        taskRepository.save(Mapper.convertToTask(taskDto));
    }

    @Override
    public List<TaskDto> findByEmail(String email) {
        return taskRepository.findByEmployeeEmail(email).stream()
                .map(Mapper::convertToTaskDto)
                .collect(Collectors.toList());
    }

    @Override
    public void remove(String id) {
        taskRepository.deleteById(Long.valueOf(id));
    }

    @Override
    public void update(TaskDto taskDto, String id) {
        taskRepository.deleteById(Long.valueOf(id));
        taskRepository.save(Mapper.convertToTask(taskDto));
    }

    @Override
    public List<TaskDto> findAll() {
        return taskRepository.findAll().stream()
                .map(Mapper::convertToTaskDto)
                .collect(Collectors.toList());
    }
}
