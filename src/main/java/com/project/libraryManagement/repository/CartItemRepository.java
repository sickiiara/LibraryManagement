package com.project.libraryManagement.repository;

import com.project.libraryManagement.model.CartItem;
import com.project.libraryManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findByUser(User user);
}
