package com.example.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restapi.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    
} 

