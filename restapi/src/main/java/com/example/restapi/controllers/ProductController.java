package com.example.restapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/products")
@Tag(name = "Product Controller", description = "APIs for managing product")
public class ProductController {
    @GetMapping()
    public String getAllProduct() {
        return new String();
    }
    

}
