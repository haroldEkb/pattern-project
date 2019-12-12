package com.harold.repository;

import com.harold.entities.User;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public User findOneByUsername(String name) {
        return new User(1, name);
    }
}
