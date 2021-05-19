package com.nelsonenterprises.nelsonspringboot.config;

import com.nelsonenterprises.nelsonspringboot.entities.Order;
import com.nelsonenterprises.nelsonspringboot.entities.User;
import com.nelsonenterprises.nelsonspringboot.repositories.OrderRepository;
import com.nelsonenterprises.nelsonspringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User (null, "Fernardo Sardinha", "fernandosardinha@bol.com", "9531-2001", "treinodebiceps");
        User u2 = new User(null, "Renato Cariani", "renatocariani@maxtitanium.com", "9211-2098", "shapealinhado" );

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

    }
}