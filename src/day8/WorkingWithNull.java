package day8;

import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

public class WorkingWithNull {
    public static void main(String[] args) {

        Employee employee = new Employee(null, 30, 3000, null);
        /*
        String name = employee.getName();
        String uName = name.toUpperCase();

        System.out.println(uName); // get NullPointerException error, if name field is null.

        System.out.println(employee.getName());
        System.out.println(employee.getHireDate());
        */
        String name = Objects.requireNonNullElse(employee.getName(), "n/a"); //using Objects.requireNonNullElse
        String uName = name.toUpperCase();
        System.out.println(uName);

        Calendar hireDate = Objects.requireNonNullElse(employee.getHireDate(), Calendar.getInstance()); //using Objects.requireNonNullElse
        String sHireDate = hireDate.toString();
        System.out.println(sHireDate);

    }
}
