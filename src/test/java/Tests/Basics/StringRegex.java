package Tests.Basics;

import java.util.Scanner;

public class StringRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        //in.close();
    }
}

class MyRegex{
    String pattern = "^(\\d{2,3}\\.){3}\\d{2,3}$";
}