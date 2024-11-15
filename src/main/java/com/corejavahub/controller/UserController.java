package com.corejavahub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corejavahub.model.User;
import com.corejavahub.service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
    private UserService userService;

    /**
     * Create a new user.
     *
     * @param user the user details to create
     * @return the created user with HTTP status 201 (CREATED)
     */
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    /**
     * Retrieve a single user by their ID.
     *
     * @param userId the ID of the user to retrieve
     * @return the user details with HTTP status 200 (OK)
     */
    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId) {
        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    /**
     * Retrieve all users.
     *
     * @return a list of all users with HTTP status 200 (OK)
     */
    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        List<User> allUsers = userService.getAllUser();
        return ResponseEntity.ok(allUsers);
    }
}
