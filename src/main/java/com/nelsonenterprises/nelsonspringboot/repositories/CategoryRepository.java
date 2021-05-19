package com.nelsonenterprises.nelsonspringboot.repositories;

import com.nelsonenterprises.nelsonspringboot.entities.Category;
import com.nelsonenterprises.nelsonspringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
