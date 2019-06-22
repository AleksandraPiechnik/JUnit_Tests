package Exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;


import java.time.Duration;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise4Test {


    @Test
    public void solutionWhenSolutionExist() {

        float arr[] = {5, 1, 11, 2};
        float target = 7;
        Exercise4 solution1 = new Exercise4();
        int []result={3,0};
        assertEquals(equals(result),equals(solution1.solution(arr, target)));
    }
    @Test
    public void solutionWhenSolutionDoesntExist()
    {
        float arr[] = {5, 1, 11, 2};
        float target=8;
        int[]results={-1,-1};
        Exercise4 solution1=new Exercise4();
        assertEquals(equals(results),equals(solution1.solution(arr, target)));
    }

    @Test()
    public void heapSortTestWithTimeOut() {
        final Exercise4 example=new Exercise4();
        Random rand = new Random();
        final float[] array = new float[10000];
        for (int i = 0; i < 10000; i++) array[i] = rand.nextInt(10000);

        Assertions.assertTimeout(Duration.ofMillis(500), () ->{example.heapSort(array);});
    }



}