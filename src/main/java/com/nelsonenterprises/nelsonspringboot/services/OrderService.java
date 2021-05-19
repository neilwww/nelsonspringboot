package com.nelsonenterprises.nelsonspringboot.services;

import com.nelsonenterprises.nelsonspringboot.entities.Order;
import com.nelsonenterprises.nelsonspringboot.entities.User;
import com.nelsonenterprises.nelsonspringboot.repositories.OrderRepository;
import com.nelsonenterprises.nelsonspringboot.repositories.UserRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById (Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
