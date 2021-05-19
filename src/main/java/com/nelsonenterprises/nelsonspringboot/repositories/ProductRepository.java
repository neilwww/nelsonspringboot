package com.nelsonenterprises.nelsonspringboot.repositories;

import com.nelsonenterprises.nelsonspringboot.entities.Category;
import com.nelsonenterprises.nelsonspringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
