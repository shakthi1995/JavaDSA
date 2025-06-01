package Tests.Basics;

import org.testng.annotations.Test;

public class PassFail {

    @Test
    public void PrintPassOrFail(){
        int mark = 32;
        String[] result = {"Fail", "Pass"};
        System.out.println(result[mark / 35]);
    }
}
