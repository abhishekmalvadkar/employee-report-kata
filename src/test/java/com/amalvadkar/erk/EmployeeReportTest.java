package com.amalvadkar.erk;

import com.amalvadkar.erk.repositories.EmployeeRepo;
import com.amalvadkar.erk.repositories.InMemoryEmployeeRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeReportTest {

    private EmployeeReport employeeReport;

    @BeforeEach
    void setUp() {
        EmployeeRepo employeeRepo = new InMemoryEmployeeRepo();
        employeeReport = new EmployeeReport(employeeRepo);
        employeeRepo.clear();
        employeeRepo.saveAll(prepareTestEmployees());
    }

    private static List<Employee> prepareTestEmployees() {
        return List.of(
                Employee.from("max doe", 18),
                Employee.from("Sepp", 1),
                Employee.from("Nina", 15),
                Employee.from("kike", 51));

    }

    @Test
    void should_return_adult_employees_so_as_a_shop_owner_i_can_know_who_will_work_on_sunday() {
        List<Employee> adultEmployees = employeeReport.adultEmployees();
        assertThat(adultEmployees).hasSize(2);
    }

    @Test
    void should_return_employees_sort_by_name_in_desc_so_as_a_shop_owner_i_can_find_them_easily() {
        List<Employee> adultEmployees = employeeReport.adultEmployees();
        assertThat(adultEmployees).hasSize(2);
        assertThat(adultEmployees).containsExactly(
                Employee.from("Max Doe", 18),
                Employee.from("Kike", 51)
        );
    }

    @Test
    void should_return_employees_with_capitalized_employee_name_so_as_a_sop_owner_i_can_read_them_easily() {
        List<Employee> adultEmployees = employeeReport.adultEmployees();
        assertThat(adultEmployees).hasSize(2);
        assertThat(adultEmployees).containsExactly(
                Employee.from("Max Doe", 18),
                Employee.from("Kike", 51)
        );
    }
}
