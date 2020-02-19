package com.madushan.app.service;

import java.util.Optional;

import  com.madushan.app.model.Employee;

public interface EmployeeService {

    Employee save(Employee employee);

    Optional<Employee> findByID(int employeeID);

    Employee fetchAllFromEmployee(int employeeID);
}
