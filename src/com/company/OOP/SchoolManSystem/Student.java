package com.company.OOP.SchoolManSystem;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private final int feesTotal = 30000;

    /**
     * To create a new student by initializing
     * Fees for every student is $30,000
     * Fees paid initially is 0
     * @param id for student: unique
     * @param name of the student
     * @param grade of the student
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
    }

    public Student(){}

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees) {
        feesPaid = feesPaid + fees;
        System.out.println(name + " paid $" + fees);
        School.updateTotalMoneyEarned(fees);
        System.out.println("Current debt: $" + (feesTotal - feesPaid));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
}
