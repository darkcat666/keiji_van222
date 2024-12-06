package com.example.demo.component.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.component.entity.DemoEntity;

public interface DemoRepository extends JpaRepository<DemoEntity, Integer> {
} 