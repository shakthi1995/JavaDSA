package Tests.DateFunctions;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeManipulation {

    @Test
    public void GetDateTime() {
        // Get current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Add 5 days
        LocalDate futureDate = currentDate.plusDays(5);
        System.out.println("Date after 5 days: " + futureDate);

        // Subtract 2 months
        LocalDate pastDate = currentDate.minusMonths(2);
        System.out.println("Date 2 months ago: " + pastDate);

        // Add 1 year
        LocalDate nextYear = currentDate.plusYears(1);
        System.out.println("Same day next year: " + nextYear);

        // Format example
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println("Formatted Future Date: " + futureDate.format(formatter));
    }

    @Test
    public void GetZonedDateTime() {
        // Current time in system default timezone
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current ZonedDateTime: " + now);

        // Current time in specific timezone (e.g., New York)
        ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York Time: " + nyTime);

        // Add 1 day and 5 hours
        ZonedDateTime futureZoned = nyTime.plusDays(1).plusHours(5);
        System.out.println("NY Time +1 day +5 hours: " + futureZoned);

        // Format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm z");
        System.out.println("Formatted: " + futureZoned.format(formatter));

    }
}
