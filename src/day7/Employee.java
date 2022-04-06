package day7;

import java.util.Calendar;

public class Employee {

    private String name; //mandatory
    private int age; //mandatory
    private double salary; //mandatory
    private Calendar hireDate; //mandatory

    private String driverLicence; //optional

    //Default constructor
    public Employee(){
        System.out.println("Default Constructor");
    }
    /*
    This is the another method to create an object, but for this we have to make default constructor private
    and to get the return type we have to go to office.java file and change it into Employee employee = Employee.getInstance();

    public static Employee getInstance(){
        return new Employee();
    }
    */
    //Parameterized constructor
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
}
