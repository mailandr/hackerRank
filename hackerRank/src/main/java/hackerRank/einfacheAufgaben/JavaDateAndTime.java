package hackerRank.einfacheAufgaben;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaDateAndTime {
    public static void main(String[] args) {

        int month = 8;
        int day = 5;
        int year = 2015;

        String weekday = findDay(month, day, year);
        System.out.println(weekday);

    }

    public static String findDay(int month, int day, int year) {
        Calendar clr = new GregorianCalendar(year, month - 1, day);
        clr.get(Calendar.DAY_OF_WEEK);
        String[] weekDays = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        return weekDays[(clr.get(Calendar.DAY_OF_WEEK))];
    }
}
