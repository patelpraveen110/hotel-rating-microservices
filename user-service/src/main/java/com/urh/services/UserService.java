package com.urh.services;

import com.urh.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUserById(String userId);
}
