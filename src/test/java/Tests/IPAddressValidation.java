package Tests;

import org.testng.annotations.Test;

public class IPAddressValidation {
    @Test
    public void VerifyIPv4Address(){
        String[] IPAdddresses = {
        "000.12.12.034",
        "121.234.12.12",
        "23.45.12.56",
        "00.12.123.123123.123",
        "122.23",
        "Hello.IP"
        };
        for(String address : IPAdddresses){
            System.out.println(address.matches(new MyRegex().pattern));
        }
    }
}

//Write your code here
class MyRegex{
    public String pattern = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";
}

