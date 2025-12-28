package com.jwt.example.JwtTutorial.Services;

import com.jwt.example.JwtTutorial.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> users = new ArrayList();
    public UserService()
    {
        users.add(new User(UUID.randomUUID().toString(),"Anurath","Anurath@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(),"Ram","Ram@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(),"Sagar","Sagar@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(),"Ramesh","Ramesh@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(),"Tushar","Tushar@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(),"Karan","Karan@gmail.com"));
    }

    public List<User> getAllUsers()
    {
        return this.users;
    }
}
