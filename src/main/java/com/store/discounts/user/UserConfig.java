package com.store.discounts.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User abed_hyari = new User(

                    "Abed Hyari",
                    "abed@gmail.com",
                    LocalDate.of(1997, Month.JULY, 22),
                    24,
                    true
            );
            User bashar = new User(

                    "bashar",
                    "bashar@gmail.com",
                    LocalDate.of(1998, Month.JULY, 30),
                    23,
                    false
            );
            repository.saveAll(
                    List.of(abed_hyari, bashar)
            );
        };
    }
}
