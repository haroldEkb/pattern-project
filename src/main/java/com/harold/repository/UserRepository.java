package com.harold.repository;

import com.harold.entities.User;

import java.util.List;
//import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  {
    void insert(User user);
    void update(User user);
    void delete(User user);
    List<User> selectAll();
    User findByUsername(String name);
    void close();
}
