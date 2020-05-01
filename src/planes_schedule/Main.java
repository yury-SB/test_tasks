package planes_schedule;

/**
разбираем работу со времемем
*/

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.text.DateFormatSymbols;
import java.io.*;
import java.util.*;

import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args) {
        String trutime = "«Самолет вылетел по расписанию в ";
        String eartime = "«Самолет вылетел раньше на ";
        String lattime = "«Вылет самолета задержан на ";
        int a = 7; //ожидаемое
        int b = 10; //действительное
        int c = a - b;  //разница

        if (c == 0)
            System.out.println(trutime + a + "»");
        else
            if (a > b)
                System.out.println(eartime + c + "»");
            else
                System.out.println(lattime + c + "»");
    }
}