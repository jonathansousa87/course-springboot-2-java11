package com.educaweb.course.course.repositories;

import com.educaweb.course.course.entities.Category;
import com.educaweb.course.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
