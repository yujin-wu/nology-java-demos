package com.company;

import java.util.ArrayList;

class Employee {
    // Total number of recorded employees.
    private static int totalEmployees = 0;
    private static ArrayList<Employee> allEmployees = new ArrayList<>();

    private String name;
    final private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
        totalEmployees++;
        allEmployees.add(this);
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getRole() {
        return role;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static ArrayList<Employee> getAllEmployees() {
        return allEmployees;
    }

    public static void setAllEmployees(ArrayList<Employee> allEmployees) {
        Employee.allEmployees = allEmployees;
        Employee.totalEmployees = allEmployees.size();
    }
}

class Main {
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("John", "Manager");

        Employee employee2 = new Employee("Jane", "Developer");

        System.out.println("employee2: " + employee2.getTotalEmployees());

        System.out.println("Total Employees: " + Employee.getTotalEmployees());
    }
}
