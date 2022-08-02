package com.autoflex.tms.services;

import com.autoflex.tms.dto.ManagerDto;
import com.autoflex.tms.mappers.Mapper;
import com.autoflex.tms.repos.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManagerServiceImpl implements ManagerService{
    @Autowired
    private ManagerRepository managerRepository;

    @Resource
    private Mapper mapper;

    @Override
    public void createManager(ManagerDto managerDto) {
        managerRepository.save(Mapper.convertToManager(managerDto));
    }

    @Override
    public ManagerDto getManager(String email) {
        return Mapper.convertToManagerDto(managerRepository.getByManagerData_Email(email));
    }

    @Override
    public void remove(String id) {
        managerRepository.deleteById(Long.valueOf(id));
    }

    @Override
    public void update(ManagerDto managerDto, String id) {
        managerRepository.deleteById(Long.valueOf(id));
        managerRepository.save(Mapper.convertToManager(managerDto));
    }

    @Override
    public List<ManagerDto> findAll() {
        return managerRepository.findAll().stream()
                .map(Mapper::convertToManagerDto)
                .collect(Collectors.toList());
    }
}