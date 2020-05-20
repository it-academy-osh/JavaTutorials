package com.company.OOP.SchoolManSystem;

import java.util.List;

public class School {

    private List<Employee> employeeList;
    private List<Student> studentList;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new object of class School
     * @param employeeList - list of teachers
     * @param studentList - list of students
     */
    public School(List<Employee> employeeList, List<Student> studentList) {
        this.employeeList = employeeList;
        this.studentList = studentList;
    }

    public static void setTotalMoneyEarned(int totalMoneyEarned) {
        School.totalMoneyEarned = totalMoneyEarned;
    }

    public static void setTotalMoneySpent(int totalMoneySpent) {
        School.totalMoneySpent = totalMoneySpent;
    }

    public void getMessageOfTotalMoneyEarned(){
        System.out.println("AgaKhan has earned $" + getTotalMoneyEarned());
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent = totalMoneySpent + moneySpent;
        totalMoneyEarned = totalMoneyEarned - moneySpent;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

}
