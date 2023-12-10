package com.taskmanager.auth.domain.repository;

import com.taskmanager.auth.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
