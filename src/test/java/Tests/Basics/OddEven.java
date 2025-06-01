package Tests.Basics;

import org.testng.annotations.Test;

public class OddEven {

    @Test
    public void FindOddOrEven(){
        int num = 47;
        String[] result = {"Even", "Odd"};
        System.out.println(result[num%2]);
    }
}
