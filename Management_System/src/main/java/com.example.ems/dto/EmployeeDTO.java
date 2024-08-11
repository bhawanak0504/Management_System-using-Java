package com.example.ems.dto;

public class EmployeeDTO {

    private Long id;
    private String name;
    private String position;
    private double salary;
    private Long departmentId;

    // Default constructor
    public EmployeeDTO() {}

    // Parameterized constructor
    public EmployeeDTO(Long id, String name, String position, double salary, Long departmentId) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
}
