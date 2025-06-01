package Tests.Strings;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class BalancedString {

    @Test
    public void CheckBalancedString() {
        String s = "()(())()()";
        Map<Character, Integer> result = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (!result.containsKey(c)) {
                result.put(c, 1);
            } else {
                result.put(c, result.get(c) + 1);
            }
        }
    }
}
