package day6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FindingAgeWithCalendarClass {

    public static void main(String[] args) throws ParseException {

        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your DOB in YYYY/MM/DD format: ");
        s = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date d = sdf.parse(s);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // 1 is added because JAN starts from 0.
        int date = cal.get(Calendar.DATE);

        LocalDate l1 = LocalDate.of(year, month, date);
        LocalDate l2 = LocalDate.now();
        Period age = Period.between(l1, l2);
        System.out.println("Your current age is " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays()+ " days.");

    }
}
