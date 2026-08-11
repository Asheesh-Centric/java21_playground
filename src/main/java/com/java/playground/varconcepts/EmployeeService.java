package com.java.playground.varconcepts;

import java.util.List;

public class EmployeeService {
    public Employee getEmployee(){
        var employee = new Employee(1, "Don", "IT");
        return employee;
    }

    public List<Employee> getEmployees(){
        var employees = List.of(
                new Employee(1, "Don", "IT"),
                new Employee(2, "ASHU", "HR"),
                new Employee(3, "Sharma", "IT")
        );
        return employees;
    }

}
