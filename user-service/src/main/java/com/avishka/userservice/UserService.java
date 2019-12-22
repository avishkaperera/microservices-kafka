package com.avishka.userservice;

public interface UserService {
    User registerUser(User user);
    Iterable<User> findAll();
}
