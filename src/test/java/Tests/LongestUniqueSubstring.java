package Tests;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring {

    public int ExtractLongestUniqueSubstring(String str){
        int maxLength = 0;
        int startIndex = 0;
        Map<Character, Integer> charCount = new HashMap<>();
        int left = 0;
        for(int right = 0; right < str.length(); right++){
            if(charCount.containsKey(str.charAt(right)) && charCount.get(str.charAt(right)) >= left){
                left = charCount.get(str.charAt(right)) + 1;
            }
                charCount.put(str.charAt(right), right);
            if(right-left+1 > maxLength){
                maxLength = right-left+1;
                startIndex = left;
            }
        }
        System.out.println(str.substring(startIndex, maxLength + startIndex));
        return maxLength;

    }

    @Test
    public void PrintLongestUniqueSubstringLength(){
        String input = "abcabcbb";

        int length = ExtractLongestUniqueSubstring(input);
        System.out.println(length);

    }
}
