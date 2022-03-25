package com.educaweb.course.course.repositories;

import com.educaweb.course.course.entities.OrderItem;
import com.educaweb.course.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
