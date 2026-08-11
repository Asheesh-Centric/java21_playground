package com.java.playground.varconcepts;

public class VarNonPractice {
    public static void main(String[] args) {
        var employeeService = new EmployeeService();
        // we should not use var here because to know the exact type of employee we need to peek into method return.
        var employee = employeeService.getEmployee();
    }
}
