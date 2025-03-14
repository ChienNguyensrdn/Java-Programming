package com.example.restapi.controllers;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/users")
@Tag(name = "User Controller", description = "APIs for managing users")
public class HelloController {

    private final List<String> users = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));

    @GetMapping
    @Operation(summary = "Get all users", description = "Retrieve a list of all users")
    public List<String> getUsers() {
        return users;
    }

    @PostMapping
    @Operation(summary = "Add a new user", description = "Create a new user and add to the list")
    public String addUser(@RequestParam String name) {
        users.add(name);
        return "User " + name + " added successfully!";
    }
}

