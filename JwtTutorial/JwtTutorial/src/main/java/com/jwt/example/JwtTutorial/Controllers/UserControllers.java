package com.jwt.example.JwtTutorial.Controllers;

import com.jwt.example.JwtTutorial.Services.UserService;
import com.jwt.example.JwtTutorial.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class UserControllers {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUser()
    {
        return userService.getAllUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal)
    {
        return "Username is : "+principal.getName();
    }
}
