package com.company.OOP.SchoolManSystem;

public class Employee {
    private int id;
    private String name;
    private int salary;
    private String position;
    private int salaryEarned;

    public Employee(){}

    public Employee(int id, String name, int salary, String position) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public int getSalaryEarned() {
        return salaryEarned;
    }

    public void setSalaryEarned(int salaryEarned) {
        this.salaryEarned = salaryEarned;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void receiveSalary(int salary){
        School.updateTotalMoneySpent(salary);
        System.out.println(name + " got salary of $" + salary);
    }
}
