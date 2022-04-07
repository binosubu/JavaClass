package day8;

import java.util.Calendar;

public class ImplicitAndExplicitParameter {
    public static void main(String[] args) {

        Employee binod = new Employee("Binod", 30, 100000, Calendar.getInstance());
        Employee ram = new Employee("Ram", 40, 20000, Calendar.getInstance(), "DrivingLicence");

        ram.fireEmployee(); // implicit parameter
        binod.promoteEmployee(); //implicit parameter

       // binod.setEmployeeCount(10);
       // ram.setEmployeeCount(20); //static function is called (meaningless because it is being shared with everyone)

       // System.out.println(binod.getEmployeeCount());

        Employee.setEmployeeCount(20);
        System.out.println(Employee.getEmployeeCount());

    }
}
