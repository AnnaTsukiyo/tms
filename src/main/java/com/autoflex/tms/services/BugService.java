package com.autoflex.tms.services;

import com.autoflex.tms.dto.BugDto;

import java.util.List;

public interface BugService {
    void createBug(BugDto bugDto);
    BugDto getBugById(String id);
    void remove(String id);
    void update(BugDto bugDto, String id);
    List<BugDto> findAll();
    List<BugDto> findByStatusAndUrgent(String status, String urgent);
    List<BugDto> findByUrgentAndDetectedVersion(String urgent, String detectedVersion);
    List<BugDto> findByUrgentAndImportantAndDetectedVersion(String urgent, String important, String detectedVersion);
}
