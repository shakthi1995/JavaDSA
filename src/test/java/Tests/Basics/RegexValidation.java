package Tests.Basics;

import org.testng.annotations.Test;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexValidation {

    public void FindValidSyntax(){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){

            String pattern = in.nextLine();
            //Write your code
            try{
                testCases--;
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }

        }
        in.close();
    }

    public boolean[] matchRegexArray(String[] inputArray, String regex) {
        Pattern pattern = Pattern.compile(regex);
        boolean[] results = new boolean[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            results[i] = pattern.matcher(inputArray[i]).matches();
        }

        return results;
    }

    @Test
    public void RegexVerification() {
        String[] data = {"abc123", "123abc", "abc", "123"};
        String regex = "[a-z]+\\d+";  // starts with letters, ends with digits

        boolean[] result = matchRegexArray(data, regex);

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " --> " + result[i]);
        }
    }

    public boolean isValidPassword(String password) {
        String PASSWORD_PATTERN =
                "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&#^()\\[\\]{}|<>~+=\\-]).{14,}$";
        return Pattern.matches(PASSWORD_PATTERN, password);

    }

    @Test
    public void TestingPasswords() {
        String[] testPasswords = {
                "Password123!@#",       // true
                "short123!",            // false
                "NoSpecialChar12345",   // false
                "StrongOne@2024#",      // true
                "Nouppercase1!test",    // false
                "$123gajdjCVFUNKK<T"
        };

        for (String pass : testPasswords) {
            System.out.println(pass + " -> " + isValidPassword(pass));
        }
    }
}
