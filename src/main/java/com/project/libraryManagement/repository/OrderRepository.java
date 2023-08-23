package com.project.libraryManagement.repository;

import com.project.libraryManagement.model.Order;
import com.project.libraryManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * interfaccia che gestisce gli ordini nel database
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}
