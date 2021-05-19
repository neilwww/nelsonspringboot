package com.nelsonenterprises.nelsonspringboot.repositories;

import com.nelsonenterprises.nelsonspringboot.entities.Order;
import com.nelsonenterprises.nelsonspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
