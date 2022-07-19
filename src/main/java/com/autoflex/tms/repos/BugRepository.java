package com.autoflex.tms.repos;

import com.autoflex.tms.entities.Bug;
import com.autoflex.tms.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BugRepository extends JpaRepository<Bug,Long > {
    List<Bug> findByStatusAndUrgent(Status status, boolean urgent);
}
