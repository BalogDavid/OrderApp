package com.example.orderapp.service;

import com.example.orderapp.entity.Order;
import com.example.orderapp.entity.User;
import com.example.orderapp.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrdersByUser(Long userId) {
        return orderRepository.findByUserId(userId);
    }

    public double calculateTotalOrders(Long userId) {
        return orderRepository.findByUserId(userId).stream()
                .mapToDouble(order -> order.getQuantity() * order.getUnitPrice())
                .sum();
    }

    public User saveUser(User user) {
        return user;
    }

    public Order saveOrder(Order order) {
        return order;
    }

    public Arrays getOrders() {
        return null;
    }
}
