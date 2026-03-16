package com.klu.spring;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.klu.model.User;

@RestController
@RequestMapping("/calc")
public class AppController {
    @GetMapping("/{id}")
    public User getUserData(@PathVariable("id") Long id) {
        User user = new User(id, "Sample");
        return user;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return user;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        user.setId(id);
        return user;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id, @RequestBody User user) {
        return "User with id " + id + " deleted.";
    }
}