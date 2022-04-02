package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;
    //==============================================================================

    // GET method
    // This method will retrieve all orders that the users created. On path = "http://localhost:8080/api/orders"
    @GetMapping
    public List<Order> getAllOrders() {
        //System.out.println("All Order" + orderRepository.findAll());
        return orderRepository.findAll();
    }

}
