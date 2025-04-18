package Tests.Basics;

import org.testng.annotations.Test;

public class PrintfMethod {

    @Test
    public void PrintingStringInExpectedFormat(){
            String[] inputs = {
                    "java 100",
                    "cpp 65",
                    "python 50"
            };

            // Print top border
            System.out.println("================================");

            // Print formatted rows
            for (String input : inputs) {
                String[] parts = input.split(" ");
                String language = parts[0];
                int score = Integer.parseInt(parts[1]);
                System.out.printf("%-15s%03d %n", language, score);
            }

            // Print bottom border
            System.out.println("================================");
        }

        @Test
        public void SamplePrintfMethod(){
            int age = 25;
            double price = 123.45678;
            String name = "Alice";

            System.out.printf("Name: %s%n", name);               // Name: Alice
            System.out.printf("Age: %d years%n", age);           // Age: 25 years
            System.out.printf("Price: %.2f%n", price);           // Price: 123.46
            System.out.printf("Padded age: %05d%n", age);        // Padded age: 00025
            System.out.printf("Left align: %-10sEND%n", name);   // Left align: Alice     END

        }
    }
