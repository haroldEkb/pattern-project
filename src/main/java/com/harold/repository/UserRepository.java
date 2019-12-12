package com.harold.repository;

import com.harold.entities.User;
//import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  {
    User findOneByUsername(String name);
}
