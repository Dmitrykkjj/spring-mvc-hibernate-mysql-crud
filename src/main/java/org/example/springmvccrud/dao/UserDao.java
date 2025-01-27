package org.example.springmvccrud.dao;

import org.example.springmvccrud.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void updateUser(User user);

    User getUserById(int id);

    void deleteUser(int id);

    List<User> getAllUsers();
}
