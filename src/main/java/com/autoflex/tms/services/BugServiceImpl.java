package com.autoflex.tms.services;

import com.autoflex.tms.dto.BugDto;
import com.autoflex.tms.entities.Status;
import com.autoflex.tms.mappers.Mapper;
import com.autoflex.tms.repos.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BugServiceImpl implements BugService{
    @Autowired
    private BugRepository bugRepository;

    @Resource
    private Mapper mapper;

    @Override
    public void createBug(BugDto bugDto) {
        bugRepository.save(Mapper.convertToBug(bugDto));
    }

    @Override
    public BugDto getBugById(String id) {
        return Mapper.convertToBugDto(bugRepository.findById(Long.valueOf(id)).get());
    }

    @Override
    public List<BugDto> findByStatusAndUrgent(String status, String urgent){
        return bugRepository.findByStatusAndUrgent(Status.valueOf(status), Boolean.parseBoolean(urgent)).stream()
                .map(Mapper::convertToBugDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<BugDto> findByUrgentAndDetectedVersion(String urgent, String detectedVersion){
        return bugRepository.findByUrgentAndDetectedVersion(Boolean.parseBoolean(urgent), detectedVersion).stream()
                .map(Mapper::convertToBugDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<BugDto> findByUrgentAndImportantAndDetectedVersion(String urgent, String important, String detectedVersion){
        return bugRepository.findByUrgentAndImportantAndDetectedVersion(Boolean.parseBoolean(urgent), Boolean.parseBoolean(important), detectedVersion).stream()
                .map(Mapper::convertToBugDto)
                .collect(Collectors.toList());
    }

    @Override
    public void remove(String id) {
        bugRepository.deleteById(Long.valueOf(id));
    }

    @Override
    public void update(BugDto bugDto, String id) {
        bugRepository.deleteById(Long.valueOf(id));
        bugRepository.save(Mapper.convertToBug(bugDto));
    }

    @Override
    public List<BugDto> findAll() {
        return bugRepository.findAll().stream()
                .map(Mapper::convertToBugDto)
                .collect(Collectors.toList());
    }
}