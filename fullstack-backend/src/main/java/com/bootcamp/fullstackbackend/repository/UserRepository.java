package com.bootcamp.fullstackbackend.repository;

import com.bootcamp.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
