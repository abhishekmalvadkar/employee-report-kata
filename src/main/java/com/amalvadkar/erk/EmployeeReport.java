package com.amalvadkar.erk;

import com.amalvadkar.erk.repositories.EmployeeRepo;

import java.util.List;

import static com.amalvadkar.erk.Employee.EMPLOYEE_NAME_DESC_COMPARATOR;
import static java.util.Comparator.comparing;

public class EmployeeReport {

    private final EmployeeRepo employeeRepo;

    public EmployeeReport(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> adultEmployees() {
        return employeeRepo.findAll().stream()
                .filter(Employee::isAdult)
                .sorted(EMPLOYEE_NAME_DESC_COMPARATOR)
                .map(Employee::capitalizedEmployee)
                .toList();
    }





}
