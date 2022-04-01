package com.example.demo;

import com.example.demo.model.User;
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

    @Override
    public void run(String... args) throws Exception {
        /*User userOne = new User();
        userOne.setName("Abed Hyari");
        userOne.setEmail("abed@gmail.com");
        userOne.setIsEmployee(true);
        userRepository.save(userOne);
    //============================================//
        User userTwo = new User();
        userTwo.setName("Bashar");
        userTwo.setEmail("bashar@gmail.com");
        userRepository.save(userTwo);*/
    }
}