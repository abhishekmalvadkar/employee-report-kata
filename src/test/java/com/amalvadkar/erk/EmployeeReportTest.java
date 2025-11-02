package com.amalvadkar.erk;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeReportTest {
    @Test
    void should_return_employees_with_18_or_above_age_so_as_a_shop_owner_i_can_know_who_will_work_on_sunday() {
        List<Employee> employees = List.of(Employee.createEmployee("Max", 17), Employee.createEmployee("Sepp", 1), Employee.createEmployee("Nina", 15), Employee.createEmployee("Mike", 51));
        EmployeeReport employeeReport = new EmployeeReport();
       List<Employee> employeesWorkOnSunday = employeeReport.getEmployeesWorkOnSunday(employees);
        assertThat(employeesWorkOnSunday).hasSize(1);


    }
}
