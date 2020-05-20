package com.company.OOP.SchoolManSystem;

import com.company.OOP.LibraryManSystem.LibraryMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolMain {

    private static ArrayList<Integer> ids = new ArrayList<>();

    public static void main(String[] args) {

        Teacher zimre = new Teacher(genUniqueID(), "Zimre", 250, "teacher");
        Teacher mellisa = new Teacher(genUniqueID(), "Mellisa", 500, "teacher");
        Teacher lisa = new Teacher(genUniqueID(), "Lisa", 600, "teacher");

        Chief zumrad = new Chief(genUniqueID(), "Zumrad", 150, "chief");
        Janitor abai = new Janitor(genUniqueID(), "Abai", 100, "janitor");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(zimre);
        employeeList.add(mellisa);
        employeeList.add(lisa);
        employeeList.add(zumrad);
        employeeList.add(abai);

        Student bolot = new Student(genUniqueID(), "Bolot", 6);
        Student akyl = new Student(genUniqueID(), "Akyl", 2);
        Student sanjar = new Student(genUniqueID(), "Sanjar", 11);

        List<Student> studentList = new ArrayList<>();
        studentList.add(bolot);
        studentList.add(akyl);
        studentList.add(sanjar);

        School agaKhan = new School(employeeList, studentList);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to School Management System...");

        while (true) {
            System.out.println("Please choose an option...");
            System.out.println("1. Information about school");
            System.out.println("2. Browse students");
            System.out.println("3. Browse teachers");
            System.out.println("4. Browse employees");
            System.out.println("5. Add Student");
            System.out.println("6. Add Teacher");
            System.out.println("7. Add Employee");
            System.out.println("8. Make Payment");
            System.out.println("9. Library Management System");
            System.out.println("10. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    getSchoolInfo(agaKhan);
                    break;
                case 2:
                    getStudentsList(agaKhan);
                    break;
                case 3:
                    getTeachersList(agaKhan);
                    break;
                case 4:
                    getEmployeeList(agaKhan);
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    finance(agaKhan, scanner);
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Quitting...");
                    System.exit(0);

            }
            if (choice == 9){
                break;
            }
        }


    }

    private static void finance(School school, Scanner scanner) {
        System.out.println("School Finance Department");
        System.out.println("Please choose an option...");
        System.out.println("1. Get fee from students");
        System.out.println("2. Pay salary for employees");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Please enter a name of one student");
                getStudentsList(school);
                String studentName = scanner.next();
                Student student = getChosenStudent(school, studentName);
                System.out.println("Your student: ");
                getStudentInfo(student);
                System.out.println("Please enter $ for debt...");
                int debt = scanner.nextInt();
                student.payFees(debt);
                break;

            case 2:
                System.out.println("Please enter a name of one employee");
                getTeachersList(school);
                getEmployeeList(school);
                String employeeName = scanner.next(); //Bolot
                Employee employee = getChosenEmployee(school, employeeName);
                int counter = 1;
                while (counter <= 3){
                    if (counter == 3){
                        main(new String[]{""});
                    }
                    if (employee.getName() != null) {
                        System.out.println("Your employee: ");
                        getEmployeeInfo(employee);
                        System.out.println("Please enter $ for salary...");
                        int salary = scanner.nextInt();
                        employee.receiveSalary(salary);
                        break;
                    }
                    else {
                        System.out.println("Please re-enter...");
                        employeeName = scanner.next();
                        employee = getChosenEmployee(school, employeeName);
                        counter++;
                    }
                }
        }
    }

    public static void paySalaryForAllEmployees(School school){
        List<Employee> employeeList = school.getEmployeeList();
        int totalSpent = 0;
        for (Employee e:employeeList) {
            int tempSalary = e.getSalary();
            totalSpent = totalSpent + tempSalary;
            e.setSalaryEarned(tempSalary);
        }

        if (school.getTotalMoneyEarned() > totalSpent){
            int generalTotalEarned = school.getTotalMoneyEarned() - totalSpent;
            School.setTotalMoneyEarned(generalTotalEarned);
            int generalTotalMoneySpent = school.getTotalMoneySpent() + totalSpent;
            School.setTotalMoneySpent(generalTotalMoneySpent);
        }
    }

    public static List<Teacher> getTeacherList(School school){
        List<Teacher> teacherList = new ArrayList<>();
        List<Employee> employeeList = school.getEmployeeList();
        for (Employee e : employeeList){
            if (e instanceof Teacher){
                teacherList.add((Teacher) e);
            }
        }
        return teacherList;
    }

    public static void getEmployeeInfo(Employee t) {
        System.out.println("ID: " + t.getId() + " | Name: " + t.getName() + " | Salary: " + t.getSalary());
    }

    public static void getStudentInfo(Student s){
        System.out.println("ID: " + s.getId() + " | Name: " + s.getName() + " | Grade: " + s.getGrade() + " | Money paid: " + s.getFeesPaid() + " | Total fee: $" + s.getFeesTotal() + " | Remainder: $" + (s.getFeesTotal() - s.getFeesPaid()));
    }

    public static Employee getChosenEmployee(School school, String name){
        List<Employee> employeeList = school.getEmployeeList();
        Employee employee = new Employee();
        for (Employee e:employeeList) {
            if (e.getName().equals(name)){
                employee = e;
            }
        }
        return employee;
    }

    public static Student getChosenStudent(School school, String name){
        List<Student> students = school.getStudentList();
        Student student = new Student();
        for (Student s:students) {
            if (s.getName().equals(name)){
                student = s;
            }
        }
        return student;
    }

    public static void getStudentsList(School school){
        List<Student> students = school.getStudentList();
        for (Student s:students) {
            System.out.println("ID: " + s.getId() + " | Name: " + s.getName() + " | Grade: " + s.getGrade() + " | Money paid: " + s.getFeesPaid());
            System.out.println("---------------------------------------------");
        }
    }

    public static void getEmployeeList(School school){
        List<Employee> employeeList = school.getEmployeeList();
        for (Employee e : employeeList){
            if (e instanceof Teacher){
                continue;
            }
            else {
                System.out.println("ID: " + e.getId() + " | Name: " + e.getName() + " | Salary: " + e.getSalary() + " | Position: " + e.getPosition());
                System.out.println("---------------------------------------------");
            }
        }
    }


    public static void getTeachersList(School school){
        List<Teacher> teacherList = getTeacherList(school);
        for (Teacher t : teacherList) {
            System.out.println("ID: " + t.getId() + " | Name: " + t.getName() + " | Salary: " + t.getSalary() + " | Position: " + t.getPosition());
            System.out.println("---------------------------------------------");
        }
    }

    public static void getSchoolInfo(School school){
        System.out.println("School has " + school.getStudentList().size() + " students");
        System.out.println("School has " + getTeacherList(school).size() + " teachers");
        System.out.println("School has earned $" + school.getTotalMoneyEarned());
        System.out.println("School has spent $" + school.getTotalMoneySpent());
    }

    public static int genUniqueID(){
        int id = 0;
        while (true) {
            id = (int)(Math.random() * 899) + 100; //123
            if (checkForDuplicates(id)) {
                ids.add(id);
                break;
            }
        }
        return id;
    }

    public static boolean checkForDuplicates(int id){
        for (int i:ids) {
            if (i == id){
                return false;
            }
        }
        return true;
    }
}
