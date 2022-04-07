package day8;

import java.util.Calendar;

public class Employee {

    private static int employeeCount; // static example; employeeCount will be common for both binod and ram object.

    private String name;
    private int age;
    private double salary;
    private Calendar hireDate;
    private String driverLicence;

    public Employee(String name, int age, double salary, Calendar hireDate) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public Employee(String name, int age, double salary, Calendar hireDate, String driverLicence) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
        this.driverLicence = driverLicence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Calendar getHireDate() {
        return hireDate;
    }

    public void setHireDate(Calendar hireDate) {
        this.hireDate = hireDate;
    }

    public void fireEmployee (){
        System.out.println(this.getName() + " is fired!!"); //this word is implicit parameter.
    }

    public void promoteEmployee (){
        System.out.println(this.getName() + " is promoted!!"); // this word is implicit parameter.
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }
}
