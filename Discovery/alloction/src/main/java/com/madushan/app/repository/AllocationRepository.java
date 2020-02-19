package com.madushan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madushan.app.model.Allocation;

public interface AllocationRepository extends JpaRepository<Allocation, Integer> {
}
