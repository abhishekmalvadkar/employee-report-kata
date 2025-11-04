package com.amalvadkar.erk.repositories;

import com.amalvadkar.erk.Employee;

import java.util.ArrayList;
import java.util.List;

public class InMemoryEmployeeRepo implements EmployeeRepo {

    private static final List<Employee> EMPLOYEE_STORE = new ArrayList<>();

    @Override
    public void saveAll(List<Employee> employees) {
        EMPLOYEE_STORE.addAll(employees);
    }

    @Override
    public void clear() {
        EMPLOYEE_STORE.clear();
    }

    @Override
    public List<Employee> findAll() {
        return EMPLOYEE_STORE;
    }
}
