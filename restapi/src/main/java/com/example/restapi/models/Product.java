package com.example.restapi.models;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name ="products")

public class Product {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable =  false)
    private String ProductName;
    @Column(nullable =  false)
    private String ProductCode;
    @ManyToOne
    private Category category;

}
