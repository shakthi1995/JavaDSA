package Tests;

import org.testng.annotations.Test;

import java.io.*;

public class GenerateNumber {
    @Test
    public void GenerateNumberQuerySeries()throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String[] input = new String[3];
//        for(int i = 0; i < input.length; i++){
//            input[i] = reader.readLine();
//        }
        String[] input = {"2", "0 2 10", "5 3 5"};
        int q = Integer.parseInt(input[0]);
        //System.out.println(q);
        for(int j = 1; j <= q; j++){
            String[] variables = input[j].split(" ");

            int a = Integer.parseInt(variables[0]);
            int b = Integer.parseInt(variables[1]);
            int n = Integer.parseInt(variables[2]);
            int sum = a;
            //  System.out.print(a + " ");
            //  System.out.print(b + " ");
            //  System.out.print(n + " ");
            for(int l = 0; l < n;  l++){
                int c = (int)(Math.pow(2, l) * b);
                sum = sum + c;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }



}
