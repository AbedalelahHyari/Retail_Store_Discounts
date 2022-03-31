package com.store.discounts.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/users")
public class UserController {
    @GetMapping
    public List<User> getAllUsers() {
        return List.of(new User(
                1,
                "Abed Hyari",
                "abed@gmail.com",
                LocalDate.of(1997, Month.JULY, 22),
                24,
                true
        ));
    }
    
}
