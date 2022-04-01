package com.store.discounts.order;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OrderConfig {
    @Bean
    CommandLineRunner commandLineRunnerOrder(OrderRepository repository) {
        return args -> {
            Order order_one = new Order(
                    "abed Hyari",
                    140.00,
                    .30,
                    140.00 - (140.00 * .30)
            );
            Order order_two = new Order(
                    "bashar",
                    160.00,
                    .10,
                    160.00 - (160.00 * .10)
            );
            ////////////////////////////////////////////////////
            repository.saveAll(
                    List.of(order_one, order_two)
            );
        };
    }
}
