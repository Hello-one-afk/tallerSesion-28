package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "characters")
public class Characters {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;


    @Column (length = 8, nullable = false)
    private String status;
    @Column (length = 45, nullable = false)
    private String created;

    @Column (length = 45 ,nullable = false)
    private String gender;

    @Column (length = 45 ,nullable = false)
    private String species;

   
    @Column (length =100 ,nullable = false)
    private String img;

    @Column (length = 100 ,nullable = false)
    private String name;

    @Column (length = 100 ,nullable = false)
    private String url;

    
}
