package com.madushan.app.service;

import java.util.List;

import com.madushan.app.model.Allocation;

public interface AllocationService {


    List<Allocation> findByID(Integer employeeID);

    Allocation save(Allocation allocation);
}
