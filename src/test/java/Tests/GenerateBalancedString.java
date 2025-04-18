package Tests;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class GenerateBalancedString {


    public List<String> VerifyBalancedString(int size){
        if(size < 1 && size > 13){
            throw new IllegalArgumentException("Invalid Size");
        }
        List<String> result = new ArrayList<>();

        int open = 0;
        int close = 0;

        String brackets = "";

        GenerateBalancedStringBracketCombinations(brackets, open, close, size, result);
        return result;
    }

    public void GenerateBalancedStringBracketCombinations(String output, int open, int close, int size, List<String> result){
        if(output.length() == size * 2){
            result.add(output);
            return;
        }

        if (open < size){
            GenerateBalancedStringBracketCombinations(output + "(", open+1, close, size, result);
        }

        if (close < open){
            GenerateBalancedStringBracketCombinations(output + ")", open, close+1, size, result);
        }

    }

    @Test
    public void PrintBalancedStrings(){
        int n = 2;
        List<String> combos = VerifyBalancedString(n);
        System.out.println("Balanced combination for n: " + n);
        combos.forEach(System.out::println);
    }

}
