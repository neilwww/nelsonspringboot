package com.nelsonenterprises.nelsonspringboot.repositories;

import com.nelsonenterprises.nelsonspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
