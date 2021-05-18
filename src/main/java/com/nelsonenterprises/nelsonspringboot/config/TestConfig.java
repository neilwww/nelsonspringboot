package com.nelsonenterprises.nelsonspringboot.config;

import com.nelsonenterprises.nelsonspringboot.entities.User;
import com.nelsonenterprises.nelsonspringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User (null, "Fernardo Sardinha", "fernandosardinha@bol.com", "9531-2001", "treinodebiceps");
        User u2 = new User(null, "Renato Cariani", "renatocariani@maxtitanium.com", "9211-2098", "shapealinhado" );

        userRepository.saveAll(Arrays.asList(u1,u2));

    }
}
