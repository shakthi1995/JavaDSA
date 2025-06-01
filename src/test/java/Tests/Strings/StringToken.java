package Tests.Strings;

import org.testng.annotations.Test;

public class StringToken {

    @Test
    public void ExtractToken(){
        String s = "He is a very very goog boy, isn't he?";

        if(s.length() > 0){
            String[] tokens = s.trim().split("[^\\p{Alpha}]+");
            int size = (tokens.length > 0) ? tokens.length : 0;
            System.out.println(size);

            for(String token : tokens){
                System.out.println(token);
            }
        }
        else{
            System.out.println(0);
        }
    }
}
