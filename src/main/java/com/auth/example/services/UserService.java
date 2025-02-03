package com.auth.example.services;

import com.auth.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Ram", "ram@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Shyaam", "shyaam@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Ajay", "ajay@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Sahil", "sahil@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Mohan", "mohan@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Ravi", "ravi@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Akshay", "akshay@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Sunny", "sunny@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Mohak", "mohak@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Rahim", "rahim@gmail.com"));
    }

    public List<User> getUsers() {
        return this.store;
    }
}
