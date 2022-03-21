package com.educaweb.course.course.repositories;

import com.educaweb.course.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
