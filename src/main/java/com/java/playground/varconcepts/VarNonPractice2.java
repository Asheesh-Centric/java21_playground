package com.java.playground.varconcepts;

import java.util.function.Function;
import java.util.stream.Collectors;

public class VarNonPractice2 {
    public static void main(String[] args) {
        var result = new EmployeeService().getEmployees()
                .stream()
                .map(employee -> employee.name())
                .collect(Collectors.toList());

        var result2 = new EmployeeService().getEmployees()
                .stream()
                .collect(Collectors.toMap(Employee::id, Function.identity()));

        var result3 = new EmployeeService().getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::department));

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
