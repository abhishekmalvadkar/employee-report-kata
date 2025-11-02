package com.amalvadkar.erk;

import java.util.List;

public class EmployeeReport {


    public List<Employee> getEmployeesWorkOnSunday(List<Employee> employees) {
        return  employees
                .stream()
                .filter(emp -> emp.getAge() >= 18 )
                .toList();
    }
}
