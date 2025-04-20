package Tests;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BirdNestLogic2 {

    public int[] FindZigZagStickPosition(int[] forest, int bird){
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        HashSet<Integer> unique = new HashSet<>();
        boolean isMovesRight = true;
        int offset = 1;
        while(sum < 100){
            int index = -1;
            if (isMovesRight) {
                for(int i = bird + offset; i < forest.length; i++){
                    if(forest[i] > 0 && !unique.contains(i)){
                        index = i;
                        break;
                    }
                }
            }else{
                for(int j = bird - offset; j > 0; j--){
                    if(forest[j] > 0 && !unique.contains(j)){
                        index = j;
                        break;
                    }
                }
            }

            if(index != -1){
                result.add(index);
                sum = sum + forest[index];
                unique.add(index);
            }else{
                break;
            }
            isMovesRight = !isMovesRight;
        }

        int[] output = new int[result.size()];
        for(int k = 0; k< output.length; k++){
            output[k] = result.get(k);
        }
        return output;
    }

    @Test
    public void PrintZigZagBirdStickPosition(){
        int[] forest = {0, 25, 50, 0, 0, 0, 0, 15, 0, 0, 45, 0, 10};
        int start = 4;
        int[] output = FindZigZagStickPosition(forest, start);
        System.out.println(Arrays.toString(output));
    }
}
