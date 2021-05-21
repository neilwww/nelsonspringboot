package com.nelsonenterprises.nelsonspringboot.config;

import com.nelsonenterprises.nelsonspringboot.entities.Category;
import com.nelsonenterprises.nelsonspringboot.entities.Order;
import com.nelsonenterprises.nelsonspringboot.entities.Product;
import com.nelsonenterprises.nelsonspringboot.entities.User;
import com.nelsonenterprises.nelsonspringboot.entities.enums.OrderStatus;
import com.nelsonenterprises.nelsonspringboot.repositories.CategoryRepository;
import com.nelsonenterprises.nelsonspringboot.repositories.OrderRepository;
import com.nelsonenterprises.nelsonspringboot.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User (null, "Fernardo Sardinha", "fernandosardinha@bol.com", "9531-2001", "treinodebiceps");
        User u2 = new User(null, "Renato Cariani", "renatocariani@maxtitanium.com", "9211-2098", "shapealinhado" );

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.CANCELED, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.SHIPPED, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.DELIVERED, u1);

        Product p1 = new Product(null, "Albumina", "vai peidar muito", 35.0, "");
        Product p2 = new Product(null, "Creatina Growth", "te deixa careca", 30.0, "");
        Product p3 = new Product(null, "Whey Optimum Nutrition", "pai arnold", 300.0, "");

        Category cat1 = new Category(null, "WHEY");
        Category cat2 = new Category(null, "BCAA e Albumina");
        Category cat3 = new Category(null, "CREATINA");

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
        productRepository.saveAll(Arrays.asList(p1,p2,p3));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat1);

        productRepository.saveAll(Arrays.asList(p1,p2,p3));


    }
}
