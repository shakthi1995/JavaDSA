package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[3];
        for(int i = 0; i < input.length; i++){
            input[i] = reader.readLine();
        }

        int q = Integer.parseInt(input[0]);
        //System.out.println(q);
        for(int j = 1; j <= q; j++){
            String[] variables = input[j].split(" ");

            int a = Integer.parseInt(variables[0]);
            int b = Integer.parseInt(variables[1]);
            int n = Integer.parseInt(variables[2]);
            int sum = 0;
            //  System.out.print(a + " ");
            //  System.out.print(b + " ");
            //  System.out.print(n + " ");
            for(int l = 0; l < n;  l++){
                int c = (int)(Math.pow(2, l) * b);
                sum = sum + a + c;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

}
