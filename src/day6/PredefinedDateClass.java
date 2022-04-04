package day6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.text.ParseException;
import java.util.Date;

public class PredefinedDateClass {

    public static void main(String[] args) throws ParseException{

        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localTimeDate = LocalDateTime.now();
        System.out.println(localTimeDate);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar calender = Calendar.getInstance();
        //this will print the current month in "MMM" format like JAN or FEB
        System.out.println(new SimpleDateFormat("MMM").format(calender.getTime()));

        }
}
