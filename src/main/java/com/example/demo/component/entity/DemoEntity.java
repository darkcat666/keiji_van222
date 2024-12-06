package com.example.demo.component.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="postboard")
@Data
public class DemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "datetime", nullable = false, length = 30)
    private String dateTime;
    
    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "post", nullable = false, length = 1024)
    private String post;
}