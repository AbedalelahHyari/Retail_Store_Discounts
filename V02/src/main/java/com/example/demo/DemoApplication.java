package com.example.demo;

import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        /*User userOne = new User();
        userOne.setName("Abed Hyari");
        userOne.setEmail("abed@gmail.com");
        userOne.setIsEmployee(true);
        userRepository.save(userOne);

        User userTwo = new User();
        userTwo.setName("mohmmad");
        userTwo.setEmail("mohmmad@gmail.com");
        userTwo.setIsEmployee(true);


        Order order_one = new Order();
        order_one.setSubTotal(120.00);
        order_one.setDiscount(.30);
        //order_one.setTotalAmount(120.00 - (120.00 * .30));
        order_one.setTotalAmount(order_one.getSubTotal() - (order_one.getSubTotal() * order_one.getDiscount()));
        //==================================
        userTwo.setOrder(order_one);
        order_one.setUser(userTwo);

        orderRepository.save(order_one);
        userRepository.save(userTwo);*/

    }
}
