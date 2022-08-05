package com.autoflex.tms.repos;

import com.autoflex.tms.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    void deleteByEmail(String email);
    User findByEmail(String email);
}

