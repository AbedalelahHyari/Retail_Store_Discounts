package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/orders")
public class OrderController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    //==============================================================================

    // GET method
    // This method will retrieve all orders that the users created. On path = "http://localhost:8080/api/orders"
    @GetMapping
    public List<Order> getAllOrders() {

        return orderRepository.findAll();
    }

    //=================================================================================

    // POST method
    // This method will handle create new order for employee on the path = "http://localhost:8080/api/orders/employee"
    @PostMapping("/employee")
    public Order createNewOrderEmployee(@RequestBody Order order) {
        order.setDiscountValue(.30);
        int val = (int) (order.getSubTotal() - (order.getSubTotal() * .30));
        int bill = val / 100;
        order.setTotalAmount(val - (bill * 5));

        return orderRepository.save(order);
    }

    //=======================================
    // POST method
    // This method will handle create new order for customer on the path = "http://localhost:8080/api/orders/customer"
    @PostMapping("/customer")
    public Order createNewOrderCustomer(@RequestBody Order order) {
        order.setDiscountValue(.10);
        int val = (int) (order.getSubTotal() - (order.getSubTotal() * .10));
        int bill = val / 100;
        order.setTotalAmount(val - (bill * 5));

        return orderRepository.save(order);
    }
}
