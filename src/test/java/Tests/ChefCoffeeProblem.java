package Tests;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChefCoffeeProblem {

    public static List<Integer> getCoffeesPerDay(String[] input) {
        int coffeeCount = Integer.parseInt(input[0]);
        int[] coffeePrices = Arrays.stream(input[1].split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int days = Integer.parseInt(input[2]);
        int[] dailyMoney = Arrays.stream(input[3].split(" "))
                .mapToInt(Integer::parseInt).toArray();

        // Sort the coffee prices once for efficient searching
        Arrays.sort(coffeePrices);

        List<Integer> result = new ArrayList<>();

        for (int money : dailyMoney) {
            // Count how many coffee prices are <= money
            int count = 0;
            for (int price : coffeePrices) {
                if (price <= money) {
                    count++;
                } else {
                    break; // since array is sorted
                }
            }
            result.add(count);
        }

        return result;
    }

    @Test
    public void FindingTheChefPossibleCoffeeCount() {
        String[] input = {
                "5",
                "3 10 8 6 11",
                "3",
                "7 15 4"
        };

        List<Integer> result = getCoffeesPerDay(input);
        result.forEach(i -> System.out.print(i + " "));
    }
}
