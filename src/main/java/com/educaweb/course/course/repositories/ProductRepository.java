package com.educaweb.course.course.repositories;

import com.educaweb.course.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
