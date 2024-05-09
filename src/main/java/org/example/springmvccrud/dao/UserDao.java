package org.example.springmvccrud.dao;

import org.example.springmvccrud.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void updateUser(User user);

    User getUserById(Long id);

    void deleteUser(Long id);

    List<User> getAllUsers();
}
