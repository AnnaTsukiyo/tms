package com.autoflex.tms.services;

import com.autoflex.tms.dto.ManagerDto;
import com.autoflex.tms.entities.Manager;

import java.util.List;

public interface ManagerService {
    void createManager(ManagerDto managerDto);
    ManagerDto getManager(String email);
    void remove(String id);
    void update(ManagerDto managerDto, String id);
    List<ManagerDto> findAll();
}
