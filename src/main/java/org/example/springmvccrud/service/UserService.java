package org.example.springmvccrud.service;

import org.example.springmvccrud.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void saveUser(User user);

    void updateUser(User user);

    User getUserById(Long id);

    void deleteUser(Long id);

    List<User> getAllUsers();
}
