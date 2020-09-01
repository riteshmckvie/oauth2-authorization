package com.ritesh.service;

import java.util.List;

import com.ritesh.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
