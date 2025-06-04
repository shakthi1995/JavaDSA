package Tests.Basics;

import org.testng.annotations.Test;

public class SwapNumbers {

    @Test
    public void SwapTwoNumbersUsingTemp(){
        int a = 5;
        int b = 10;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a:" + a + ", b:" + b);
    }

    @Test
    public void SwapTwoNumbersWithoutTemp(){
        int a = 5;
        int b = 10;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a:" + a + ", b:" + b);
    }

    @Test
    public void SwapTwoNumbers(){
        int a = 5;
        int b = 10;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a:" + a + ", b:" + b);
    }
}
