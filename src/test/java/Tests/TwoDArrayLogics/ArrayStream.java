package Tests.TwoDArrayLogics;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayStream {

    @Test
    public void IntegerArrayToStringArray(){
        int[] input = {3, 10, 8, 6, 11};

        String[] coffeePrices = Arrays.stream(input)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(coffeePrices));
    }

    @Test
    public void StringArrayToIntArray(){
        String[] input = { "2", "7 5 8", "5 4 7"};
        String[] coffeePrices = input[1].split(" ");

        int[] prices = Arrays.stream(coffeePrices)
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] Coffeeprices = Arrays.stream(input[1].split(" "))
                .map(s -> Integer.parseInt(s))
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(coffeePrices));

    }
}
