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
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        System.out.println("время: " + dateFormat.format( new Date() ) );
    }
}
