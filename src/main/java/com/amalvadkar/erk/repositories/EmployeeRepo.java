package com.amalvadkar.erk.repositories;

import com.amalvadkar.erk.Employee;

import java.util.List;

public interface EmployeeRepo {

    void saveAll(List<Employee> employees);

    void clear();

    List<Employee> findAll();


}
