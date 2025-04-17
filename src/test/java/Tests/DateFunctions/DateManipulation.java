package Tests.DateFunctions;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateManipulation {

    @Test
    public void GetCurrentDate() {
        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Define the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Format the date
        String formattedDate = currentDate.format(formatter);

        // Print the formatted date
        System.out.println("Formatted Date: " + formattedDate);
    }

    @Test
    public void DatePlusAndMinus() {
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
}

