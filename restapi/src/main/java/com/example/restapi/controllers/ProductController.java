package com.example.restapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.services.ProductService;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.restapi.models.Product;;

@RestController
@RequestMapping("/api/products")
@Tag(name = "Product Controller", description = "APIs for managing product")
public class ProductController {
    private ProductService productService;
    @GetMapping()
    public List<Product> getAllProduct() {
        return productService.GetAllProducts();
    }
    

}
