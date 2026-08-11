package com.java.playground.varconcepts;

public class TypeInferenceWithMethods {
    public static void main(String[] args) {
        var empService = new EmployeeService();
        Employee employee = empService.getEmployee();
    }
}
