package com.autoflex.tms.repos;

import com.autoflex.tms.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee getByUserDataEmail(String email);
}

