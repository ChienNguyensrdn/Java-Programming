package com.example.restapi.services;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.restapi.repositories.ProductRepository;
import com.example.restapi.models.Product;;

@Service
public class ProductService {

    private ProductRepository productRepository;
    public List<Product> GetAllProducts(){
        return productRepository.findAll();
    }
}
