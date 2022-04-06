package day6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SetCalendarClass {
    public static void main(String[] args) {

        Calendar birthDay = Calendar.getInstance();
        birthDay.set(Calendar.YEAR, 1991);
        birthDay.set(Calendar.MONTH, 0); // because January starts from 0 in calendar.
        birthDay.set(Calendar.DATE, 5);

        SimpleDateFormat sdf = new SimpleDateFormat("MMM/dd/yyyy");
        System.out.println("My Birthday is " + sdf.format(birthDay.getTime()));
    }
}
