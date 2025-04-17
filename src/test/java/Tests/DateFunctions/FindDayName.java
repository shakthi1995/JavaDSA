package Tests.DateFunctions;

import org.testng.annotations.Test;

import java.io.*;
import java.util.Calendar;
import java.util.Locale;

public class FindDayName {

    public static String findDay(int month, int day, int year) {

        if(year < 2000 && year > 3000){
            return "Invalid Year";
        }

        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        //int day = c.get(Calendar.DAY_OF_WEEK);
        String dayName = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase();
        return dayName;

    }

    @Test
    public void PrintDayName() throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String[] firstMultipleInput = {"12", "24", "2024"};
        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);

        System.out.println(res);
        //bufferedReader.close();
    }
}
