package com.example.restapi.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "category")
public class Category {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable =  false)
    private String Name;
    @Column(nullable =  false)
    private String Code;
    @OneToMany
    private Set<Product> products = new HashSet<>();

}
