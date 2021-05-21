package com.nelsonenterprises.nelsonspringboot.repositories;

import com.nelsonenterprises.nelsonspringboot.entities.Order;
import com.nelsonenterprises.nelsonspringboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
