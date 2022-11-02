package codingCampus.Selbstkontrolle;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

public class AufgabeKalender {
    public static void main(String[] args) {

        GregorianCalendar clr = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d.MM.yyyy");
        //alternative:
        SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE, d.MM.yyyy");

        System.out.println(sdf.format(clr.getTime()) + "\n" + sdf2.format(clr.getTime()));
    }
}
