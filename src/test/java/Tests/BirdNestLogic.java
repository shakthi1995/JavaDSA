package Tests;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirdNestLogic {

    public int[] FindStickPosition(int[] forest, int bird) {
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        int left = bird - 1;
        int right = bird + 1;

        while(sum < 100){
            //iterates through right and finds values > 0 and adds it
            while(right < forest.length && sum < 100) {
                if (forest[right] > 0) {
                    result.add(right);
                    sum = sum + forest[right];
                }
                right++;
            }

            //after iterating through right and sum < 100, then iterate through left
            while(left >= 0 && sum < 100) {
                if (forest[left] > 0) {
                    result.add(left);
                    sum = sum + forest[left];
                }
                left--;
            }
        }

        int[] output = new int[result.size()];
        for(int i = 0; i< output.length; i++){

        output[i] = result.get(i);

        }
        return output;

    }

    @Test
    public void PrintBirdStickPosition(){
        int[] forest = {0, 25, 50, 0, 0, 0, 0, 15, 0, 0, 45, 0, 10};
        int start = 4;
        int[] output = FindStickPosition(forest, start);
        System.out.println(Arrays.toString(output));
    }

}
