package com.store.discounts.user;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return List.of(new User(
                        1,
                        "Abed Hyari",
                        "abed@gmail.com",
                        LocalDate.of(1997, Month.JULY, 22),
                        24,
                        true
                )
        );
    }
}
