package com.harold.repository;

import com.harold.entities.User;

public interface UserRepository  {
    User findOneByUsername(String name);
}
