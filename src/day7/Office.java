package day7;

import java.util.Calendar;

public class Office {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee binod = new Employee("Binod", 30, 100000, Calendar.getInstance());
        Employee ram = new Employee("Ram", 40, 20000, Calendar.getInstance(), "DrivingLicence");

        System.out.println(binod.getName());
        System.out.println(ram.getName());
    }
}
