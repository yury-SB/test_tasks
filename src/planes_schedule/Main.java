package planes_schedule;

/**
разбираем работу со времемем
*/

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.text.DateFormatSymbols;
import java.time.Period;
import java.time.LocalDate;
import java.io.*;
import java.util.*;

import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args) {
        String tru = "«Самолет вылетел по расписанию в ";
        String ear = "«Самолет вылетел раньше на ";
        String lat = "«Вылет самолета задержан на ";

        // int sch = 7; //ожидаемое время
        Date sch = new Date(120, 0, 1, 12, 15, 0);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        String schp = formatter.format(sch);

        // int fly = 10; //действительное время
        Date fly = new Date(120, 0, 1, 13, 15, 0);
        /*SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        String flyp = formatter.format(fly);*/

        // int dif = sch - fly;  //разница между датами


        /*public class SubtractionDate {

            public String getOperator() {
                return "-";
            }

            public void getResult(LocalDate firstDate, LocalDate secondDate) {
                Period period = Period.between(secondDate, firstDate);
                System.out.println(period.getYears() + "." + period.getMonths() + "." + period.getDays());
            }
        }*/

        long differenceInMillis = sch.getTime() - fly.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        String dateAsString = dateFormat.format(sch); //To get a text representation
        Date dateParsed = dateFormat.parse(dateAsString); //To get it back as date




      if (sch.getTime() == fly.getTime())
            System.out.println(tru + schp + "»");
/*        else
            if (sch > fly)
                System.out.println(ear + dif + "»");
            else
                System.out.println(lat + dif + "»"); */
    }
}