package com.example.orderapp.repository;

import com.example.orderapp.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Găsește toate comenzile unui utilizator
    List<Order> findByUserId(Long userId);

    // Găsește comenzile unui utilizator, ordonate descrescător după preț total
    List<Order> findByUserIdOrderByUnitPriceDesc(Long userId);
}
