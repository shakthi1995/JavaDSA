package Tests.Basics;

import org.testng.annotations.Test;

public class LexicographyString {

    @Test
    public void  isLexicographicallyGreater(){
        String A = "openAI";
        String B = "llama";
        System.out.println(A.length() + B.length());
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
    }

    @Test
    public void getSmallestAndLargestSubstring(){
        String s = "welcometojava";
        int k = 3;

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i = 0; i <= s.length() - k; i++){
            String sub = s.substring(i, i+k);
            if(sub.compareToIgnoreCase(smallest) < 0){
                smallest = sub;
            }
            if(sub.compareToIgnoreCase(largest) > 0){
                largest = sub;
            }
        }

         System.out.println(smallest + "\n" + largest);
    }
}
