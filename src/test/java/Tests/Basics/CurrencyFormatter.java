package Tests.Basics;

import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

    @Test
    public void ConvertToCountryCurrency(){
        double payment = 123456.567;

        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);

        Locale india = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        NumberFormat i = NumberFormat.getCurrencyInstance(india);

        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);

        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + u.format(payment));
        System.out.println("India: " + i.format(payment));
        System.out.println("China: " + c.format(payment));
        System.out.println("France: " + f.format(payment));
    }
}
