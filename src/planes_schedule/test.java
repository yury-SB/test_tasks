package planes_schedule;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.text.DateFormatSymbols;
import java.io.*;
import java.util.*;

import java.time.*;
import java.time.format.*;

public class test {
    public static void main(String[] args) {
/*        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        System.out.println("время: " + dateFormat.format( new Date() ) );

        Date current = new Date(89, 2, 21,  12, 15, 0);
        // void setYear (int 37);
        System.out.print(current.getYear() + " ");
        System.out.print(current.getMonth());*/

        Date sch = new Date(120, 0, 1, 12, 15);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        String message = formatter.format(sch);
        System.out.println(message);
    }
}
